package Lab.Assignment_6_LottoTicket;
public class LottoTicket {
    // Attributes
    private String ticketNumber;
    private int chosenNumber;
    private Player player; // one-to-one relationship
    
    // Getters & Setters
    public String getTicketNumber() { return this.ticketNumber; }
    public int getChosenNumber() { return this.chosenNumber; }
    public Player getPlayer() { return this.player; }

    public void setTicket(String ticketNumber) { this.ticketNumber = ticketNumber; }
    public void setChosenNumber(int chosenNumber) { this.chosenNumber = chosenNumber; }
    public void setPlayer(Player player) { this.player = player; }

    // Default Constructor
    public LottoTicket() {}

    // Parameterized Constructor
    public LottoTicket(String ticketNumber, int chosenNumber) {
        this.ticketNumber = ticketNumber;
        this.chosenNumber = chosenNumber;
    }

    // Methods
    // [ METHOD ]: Displays the ticket information /w the player
    public void displayTicketInformation() {
        System.out.println("[ TICKET INFORMATION ]");
        System.out.println("Player Name: " + player.getName());
        System.out.println("Age: " + player.getAge());
        System.out.println("Ticket Number: " + getTicketNumber());
        System.out.println("Chosen Number: " + getChosenNumber());
    }
}
