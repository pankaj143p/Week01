import java.util.Scanner;
// create a class for MovieTicket
class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    MovieTicket(){
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.price=price;
    }
   // method to book ticket
    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    // method to display ticket details
    public void displayTicketDetails() {
        System.out.println(movieName);
        System.out.println(seatNumber);
        System.out.println(price);
    }
    // method to update price
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MovieTicket ticket = new MovieTicket();

        String movieName = sc.nextLine();
        String seatNumber = sc.nextLine();
        double price = sc.nextDouble();

        ticket.bookTicket(movieName, seatNumber, price);

        ticket.displayTicketDetails();

        double newPrice = sc.nextDouble();
        ticket.updatePrice(newPrice);

        ticket.displayTicketDetails();

        sc.close();
    }
}
