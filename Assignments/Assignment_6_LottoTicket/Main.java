package Lab.Assignment_6_LottoTicket;
public class Main {
    public static void main(String[] args) {
        // Create one 'Player' and one 'LottoTicket'
        Player adrian = new Player("Adrian", 20);

        // Link them using setters
        LottoTicket lottoTicket = new LottoTicket("L-12345", 17);
        lottoTicket.setPlayer(adrian);

        // Display the ticket information including the player's details
        lottoTicket.displayTicketInformation();
    }
}
