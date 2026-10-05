import java.util.Scanner;
public class MovieInvoice {
    public static void main(String[] args) {
        System.out.print("Enter the Movie Name: ");
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();

        System.out.print("Enter no of the tickets: ");
        int noOfTickets = scanner.nextInt();

        /*
            Calculate total bill
            by the baseprice and the no of the ticket
         */
        double basePrice = 199.9;
        double totalBill  = basePrice * noOfTickets;

        // This is the summary of my movie ticket invoice
        System.out.println("Movie Invoice:");
        System.out.println("Screening: " + movieName);
        System.out.println("No of Tickets: " + noOfTickets);
        System.out.println("Amount to Pay: " + totalBill);

    }
}