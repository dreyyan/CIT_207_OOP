
import java.util.Random;

public class ColorGame {
    // Attributes
    private String playerName;
    private String chosenColor;
    private String resultColor;

    // Getters
    public String getPlayerName() { return this.playerName; }
    public String getChosenColor() { return this.chosenColor; }
    public String getResultcolor() { return this.resultColor; }

    // Setters
    public void setPlayerName(String playerName) { this.playerName = playerName; }
    public void setChosenColor(String chosenColor) {
        if (!chosenColor.equals("Red") && !chosenColor.equals("Green") && !chosenColor.equals("Blue") && !chosenColor.equals("Yellow"))
            System.out.println("ERROR: Invalid color");
        else
            this.chosenColor = chosenColor;
    }
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

        randomColor = switch (randomNumber) {
            case 0 -> "Red";
            case 1 -> "Green";
            case 2 -> "Blue";
            case 3 -> "Yellow";
            default -> "Red"; // Set default color to 'Red'
        }

        System.out.println("Chosen Color: " + getChosenColor());
        System.out.println("Random Color: " + randomColor);

        // Compares it with chosen color
        if (getChosenColor().equals(randomColor)) {
            playerWon = true;
        }

        // Prints whether the player won or lost
        if (playerWon) {
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("Sorry, you lost...");
        }
    }
}
