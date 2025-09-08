import java.util.Random;
public class ColorGame {
    // Attributes
    private String playerName;
    private String chosenColor;
    private String resultColor;

    // Getters & Setters
    public String getPlayerName() { return this.playerName; }
    public String getChosenColor() { return this.chosenColor; }
    public String getResultColor() { return this.resultColor; }

    public void setPlayerName(String playerName) { this.playerName = playerName; }
    public void setChosenColor(String chosenColor) { this.chosenColor = chosenColor; }
    public void setResultColor(String resultColor) { this.resultColor = resultColor; }
    
    // Default Constructor
    public ColorGame() {}

    // Parameterized Constructor
    public ColorGame(String playerName, String chosenColor, String resultColor) {
        this.playerName = playerName;
        this.chosenColor = chosenColor;
        this.resultColor = resultColor;
    }

    // Methods
    // [ METHOD ]: Randomly pick a color, check if it matches, and display the results
    public void playGame() {
        Random num = new Random();
        boolean playerWon = false;
        String randomColor;

        // Randomly picks a result color
        int randomNumber = num.nextInt(4);

        // Convert/map random number to a specific color
        randomColor = switch (randomNumber) {
            case 1 -> "Red";
            case 2 -> "Green";
            case 3 -> "Blue";
            case 4 -> "Yellow";
            default -> "Red"; // Set default color
        };

        // Display choices
        System.out.println("Chosen Color: " + getChosenColor());
        System.out.println("Random Color: " + randomColor);

        // Compares it /w chosen color
        if (getChosenColor().equals(randomColor)) { playerWon = true; }
        
        // Prints whether the player won or lost
        if (playerWon) System.out.println("Congratulations, you won!");
        else System.out.println("Sorry, you lost...");
    }
    
}
