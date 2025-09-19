import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

import Utilities.Utility;

public class Movie {
    static Scanner scanner = new Scanner(System.in);

    // Attributes
    private String title;
    private String genre;
    private int duration;
    private float regularPrice;
    private float vipPrice;
    private ArrayList<MovieTicket> tickets = new ArrayList<>();

    // Constructor
    Movie(String title, String genre, int duration, float regularPrice, float vipPrice) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.regularPrice = regularPrice;
        this.vipPrice = vipPrice;
    }

    // Getters & Setters
    public String getTitle() { return this.title; }
    public String getGenre() { return this.genre; }
    public int getDuration() { return this.duration; }
    public float getRegularPrice() { return this.regularPrice; }
    public float getVipPrice() { return this.vipPrice; }
    public ArrayList<MovieTicket> getTickets() { return this.tickets; }

    public void setTitle(String title) { this.title = title; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setDuration(int duration) { this.duration = duration; }
    public void setRegularPrice(float regularPrice) { this.regularPrice = regularPrice; }
    public void setVipPrice(float vipPrice) { this.vipPrice = vipPrice; }
    
    // Methods
    // [ METHOD ]: Create movie tickets for the selected movie
    public void createMovieTicket() {
        String seatNumber, ticketType = "Regular"; // Set default ticket type
        float price = 0;
     
        // Display header & subheader
        Utility.clearScreen();
        Utility.displayHeader();
        
        // Prompt user to enter the seat number
        while (true) {
            System.out.print("Enter seat number: ");
            try {
                seatNumber = scanner.nextLine();
                if (seatNumber.equals("")) {
                    System.out.println("ERROR: Seat number must not be blank");
                } else break;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: " + e);
                scanner.nextLine();
            }
        } Utility.displayLine(24, "=");

        // Prompt user to enter the type of ticket
        while (true) {
            Utility.printAnimated("[ (1) Regular | (2) VIP ]\n", 200);
            Utility.printAnimated("Type of ticket: ", 200);
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) { ticketType = "Regular"; break; }
                else if (choice == 2) { ticketType = "VIP"; break; }
                else System.out.println("ERROR: Invalid choice, please enter 1 for 'Regular' and 2 for 'VIP'");
            } catch (InputMismatchException e) {
                System.out.println("ERROR: " + e);
                scanner.nextLine();
            }
        } Utility.displayLine(24, "=");

        // Set price depending on customer's type of ticket
        if (ticketType.equals("Regular")) price = getRegularPrice();
        else if (ticketType.equals("VIP")) price = getVipPrice();

        // Display ticket and confirm purchase to customer
        while (true) {
            Utility.clearScreen();
            Utility.printAnimated("      [ Ticket Details ]\n", 200);
            Utility.displayLine(30, "=");
            System.out.printf("   Seat No.: %s\n", seatNumber);
            System.out.printf("Ticket Type: %s\n", ticketType);
            System.out.printf("      Price: $%.2f\n", price);
            Utility.displayLine(30, "=");

            Utility.printAnimated("Confirm purchase? [ y | n ]: ", 200);
            String choice = scanner.nextLine();

            // Confirm purchase
            if (choice.equalsIgnoreCase("y")) {
                break; 
            } else { // Cancel purchase
                Utility.printAnimated("Cancelling purchase...", 2000);
                return;
            }
        } Utility.clearScreen();

        // [1] Create the ticket
        MovieTicket ticket = new MovieTicket(seatNumber, ticketType, price);

        // [2] Add it to the movie's ticket list
        tickets.add(ticket);
        
        // [3] Display ticket details
        Utility.printAnimated("Ticket '" + ticket.getSeatNumber() + "' successfully purchased!", 200);
        Utility.delay(2000);
        Utility.clearScreen();
        ticket.displayTicket();

        Utility.pressKeyToContinue();
    }

    public void viewMovieTickets() {
        // Display header & subheader
        Utility.clearScreen();
        Utility.displayHeader();

        System.out.printf("[ Movie Tickets - %s ]\n", getTitle());
        // Prompt user to create tickets if there are currently none
        if (tickets.size() == 0) {
            System.out.print("There are currently no tickets for this movie.\nWould you like to add one? [ y | n ]: ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("y"))
                createMovieTicket();
                return;
        }
       
        // Display list of movie tickets
        for (MovieTicket ticket : tickets) {
            Utility.displayLine(30, "=");
            System.out.printf("Seat No.: %s\n",  ticket.getSeatNumber());
            System.out.printf("Ticket Type: %s\n",  ticket.getTicketType());
            System.out.printf("Price: $%.2f\n",  ticket.getPrice());
            Utility.displayLine(30, "=");
        } Utility.pressKeyToContinue();
    }
}