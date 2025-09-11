import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create one 'BarangaySalon'
        BarangaySalon salon = new BarangaySalon("");

        int count = 1, numOfCustomers;
        String salonName, customerName, customerService;

        // Prompt user to enter salon name
        while (true) {
            System.out.print("Enter Salon Name: ");
            salonName = scanner.nextLine();

            if (salonName.equals("")) {
                System.out.println("ERROR: Input cannot be blank");
            } else break;
        }

        // Set salon's name
        salon.setSalonName(salonName);

        // Prompt user to enter # of customers
        while (true) {
            try {
                System.out.print("Enter # of Customers: ");
                numOfCustomers = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                break;
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Clear buffer
                System.out.printf("ERROR: Invalid input [%s]\n", e);
            }
        }

        // Add customers /w different services
        while (count <= numOfCustomers) {
            // Prompt user to enter customer name
            while (true) {
                System.out.printf("Enter Customer #%d's Name: ", count);
                customerName = scanner.nextLine();

                // ERROR: Blank input
                if (customerName.equals("")) {
                    System.out.println("ERROR: Customer name cannot be blank");
                } else break;
            }
           
            // Prompt user to enter service
            while (true) {
                System.out.printf("Enter Customer #%d's Service: ", count);
                customerService = scanner.nextLine();

                // ERROR: Blank input
                if (customerService.equals("")) {
                    System.out.println("ERROR: Customer service cannot be blank");
                } else break;
            }

            count++; // Increment counter for next customer
            salon.addCustomer(new Customer(customerName, customerService)); // Create a new customer & add to the salon
            System.out.println(); // Add space for formatting
        }

        // Display customer details after entering it
        salon.displayCustomers();
    }
}