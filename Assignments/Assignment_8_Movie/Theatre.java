import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Theatre {
    Scanner scanner = new Scanner(System.in);

    // Attributes
    private String name;
    private int capacity;
    private List<Movie> movies = new ArrayList<>();

    
    // Constructor
    Theatre(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getters & Setters
    public String getName() { return this.name; }
    public int getCapacity() { return this.capacity; }
    public List<Movie> getMovies() { return this.movies; }

    public void setName(String name) { this.name = name; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    // Methods
    // [ METHOD ]: Add pre-defined movies
    public void addMovies() {
        movies.add(new Movie("Inception", "Sci-Fi / Action", 148, 10, 18));
        movies.add(new Movie("The Dark Knight", "Action / Thriller", 152, 10, 18));
        movies.add(new Movie("Interstellar", "Sci-Fi / Drama", 169, 11, 20));
        movies.add(new Movie("Parasite", "Thriller / Drama", 132, 9, 16));
        movies.add(new Movie("The Godfather", "Crime / Drama", 175, 12, 21));
        movies.add(new Movie("Spirited Away", "Animation / Fantasy", 125, 8, 15));
        movies.add(new Movie("Avengers: Endgame", "Action / Superhero", 181, 13, 22));
        movies.add(new Movie("La La Land", "Romance / Musical", 128, 9, 16));
        movies.add(new Movie("Joker", "Drama / Thriller", 122, 10, 18));
        movies.add(new Movie("Top Gun: Maverick", "Action / Adventure", 130, 12, 20));
    }

    // [ METHOD ]: View movies in the theatre
    public void viewMovies() {
        Utility.displaySubheader("                                            FEATURED   MOVIES                                            ");
        System.out.printf("| %-20s | %-20s | %-18s | %-20s | %-15s |\n", "Title", "Genre", "Duration (mins.)", "Regular Price ($)", "VIP Price ($)"); Utility.delay(150);

        Utility.displayLine(109, "=");
        for (Movie movie : movies) {
            System.out.printf("| %-20s | %-20s | %-18d | %-20.2f | %-15.2f |\n",
            movie.getTitle(),
            movie.getGenre(),
            movie.getDuration(),
            movie.getRegularPrice(),
            movie.getVipPrice());
            Utility.delay(300);
        } Utility.displayLine(109, "=");
        Utility.pressKeyToContinue();
    }

    // [ METHOD ]: Select a movie from the pre-defined movies
    public void selectMovie() {
        int counter = 1;
        
        // Display movie selection
        Utility.displaySubheader("------------MOVIE--------SELECTION------------");
        Utility.displayLine(50, "=");
        for (Movie movie : movies) {
            System.out.printf("[%d] (%s)\n", counter++, movie.getTitle()); Utility.delay(100);
            System.out.printf("Regular: ($%.2f) | VIP: ($%.2f)\n", movie.getRegularPrice(), movie.getVipPrice()); Utility.delay(100);
            Utility.displayLine(50, "=");
        } counter = 1; // Reset counter

        int movieIndex = -1;

        // Prompt user to enter movie choice
        while (true) {
            System.out.print("Enter choice: ");
            try {
                movieIndex = scanner.nextInt();
                scanner.nextLine();
                if (movieIndex > 0 && movieIndex < 11) break;
                else System.out.println("ERROR: Invalid input, please enter a valid choice");
            } catch (InputMismatchException e) {
                System.out.println("ERROR: " + e);
                scanner.nextLine();
            }
        } Utility.clearScreen();

        // Decrement movie index by 1 to access its movie details properly (off-by-1 indexing)
        movieIndex--;

        int choice = -1;
        Movie currentMovie = movies.get(movieIndex); // Store currently selected movie

        // Display movie details and ask user to buy the movie ticket
        while (true) {
            System.out.printf("[%d] (%s)\n", counter++, currentMovie.getTitle()); Utility.delay(50);
            System.out.printf("Regular: ($%.2f) | VIP: ($%.2f)\n", currentMovie.getRegularPrice(), currentMovie.getVipPrice()); Utility.delay(50);
            Utility.displayLine(34, "=");
            Utility.printAnimated("[1] Buy Ticket\n", 200);
            Utility.printAnimated("[2] View Tickets\n", 200);
            Utility.displayLine(34, "=");

            // Prompt user to enter choice
            try {
                Utility.printAnimated("Enter choice: ", 200);
                choice = scanner.nextInt();
                scanner.nextLine();

                if (choice > 0 && choice < 3) break;
                else Utility.printAnimated("ERROR: Invalid choice, please enter '1' to buy ticket or '2' to view tickets", 2000);
                break;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: " + e);
                Utility.delay(2000);
                scanner.nextLine();
            }
        }

        // Navigate based on user's choice
        if (choice == 1) {
            currentMovie.createMovieTicket();
        } else if (choice == 2) {
            currentMovie.viewMovieTickets();
        }
    }
}
