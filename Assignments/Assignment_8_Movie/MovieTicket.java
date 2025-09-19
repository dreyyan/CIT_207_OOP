import Utilities.Utility;

public class MovieTicket {
    // Attributes
    private String seatNumber;
    private String ticketType;
    private float price;
    static public int currentTicketNumber = 1;
    
    // Constructor
    MovieTicket(String seatNumber, String ticketType, float price) {
        this.seatNumber = seatNumber;
        this.ticketType = ticketType;
        this.price = price;
    }

    // Getters & Setters
    public String getSeatNumber() { return this.seatNumber; }
    public String getTicketType() { return this.ticketType; }
    public float getPrice() { return this.price; }

    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }
    public void setTicketType(String ticketType) { this.ticketType = ticketType; }
    public void setPrice(float price) { this.price = price; }

    // Methods
    // [ METHOD ]: Display the movie ticket's details
    public void displayTicket() {
        Utility.printAnimated("[ Ticket Details -- Ticket #" + currentTicketNumber++ + " ]\n", 200);
        Utility.displayLine(40, "=");   // wider line for ticket look
        System.out.printf("| %-12s: %-22s |\n", "Seat No.", getSeatNumber());
        System.out.printf("| %-12s: %-22s |\n", "Ticket Type", getTicketType());
        System.out.printf("| %-12s: $%-21.2f |\n", "Price", getPrice());
        Utility.displayLine(40, "=");
    }
}
