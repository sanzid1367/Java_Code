//Lab_06 Task 07

class MovieTicket { 
    public static String[] seatTypes = {"Regular", "Premium", "IMAX 3D"}; 
    public static double[] seatPrices = {300.0, 450.0, 600.0}; 
    public static int nightShowCharge = 15;     
    private String movie; 
    public String showtime; 
    public String date; 
    private double price; 
    public String seat; 

    public MovieTicket(String movie, String date, String showtime, double price) { 
        this.movie = movie; 
        this.showtime = showtime; 
        this.date = date; 
        this.price = price; 
        this.seat = "Not Selected"; 
    } 
    public void setPrice(double price) { 
        this.price = price; 
    } 
    public double getPrice() { 
        return price; 
    } 
    public String getMovie() { 
        return movie; 
    } 

    public String toString() { 
        return "Movie: " + movie + "\nShowtime: " + showtime + "\nDate: " + date; 
    }
}

class CinemexTicket extends MovieTicket {
    private String genre;
    private String seatType;
    private String ticketID;
    private String status;
    private static int ticketCounter = 0;

    // 4-parameter constructor (defaults to Regular seat)
    // Parameter order matches Tester: movie, showtime, genre, date
    public CinemexTicket(String movie, String showtime, String genre, String date) {
        this(movie, showtime, genre, date, "Regular");
    }

    // 5-parameter constructor
    // Parameter order matches Tester: movie, showtime, genre, date, seatType
    public CinemexTicket(String movie, String showtime, String genre, String date, String seatType) {
        // Parent constructor expects: movie, date, showtime, price
        super(movie, date, showtime, 0.0); 
        this.genre = genre;
        this.seatType = seatType;
        this.ticketID = movie + "-" + seatType.charAt(0) + "-" + (++ticketCounter);
        this.status = "Not Paid";
    }

    public static int getTotalTickets() {
        return ticketCounter;
    }

    public void calculateTicketPrice() {
        double basePrice = 0.0;
        for (int i = 0; i < seatTypes.length; i++) {
            if (seatTypes[i].equals(seatType)) {
                basePrice = seatPrices[i];
                break;
            }
        }

        // Check for night show (6:00 PM - 11:00 PM)
        String[] timeParts = showtime.split(":");
        int hour = Integer.parseInt(timeParts[0]);
        if (hour >= 18 && hour <= 23) {
            basePrice = basePrice * (1 + nightShowCharge / 100.0);
        }

        setPrice(basePrice);
        System.out.println("Ticket price is calculated successfully.");
    }

    public String confirmPayment() {
        if (status.equals("Paid")) {
            return "Ticket price is already paid!";
        } else {
            status = "Paid";
            return "Payment Successful.";
        }
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketID + "\n" +
               "Movie: " + getMovie() + "\n" +
               "Showtime: " + showtime + "\n" +
               "Date: " + date + "\n" +
               "Genre: " + genre + "\n" +
               "Seat Type: " + seatType + "\n" +
               "Price(tk): " + getPrice() + "\n" +
               "Status: " + status;
    }
}

// Driver Code 
public class Tester { 
    public static void main(String[] args) { 
        CinemexTicket ticket1 = new CinemexTicket("Deadpool and Wolverine", "18:30", "Action-Comedy", "July 24, 2024"); 
        System.out.println("Total movie ticket(s): " + CinemexTicket.getTotalTickets()); 
        System.out.println("1============================"); 
        ticket1.calculateTicketPrice(); 
        System.out.println("2============================"); 
        System.out.println(ticket1); 
        System.out.println("3============================"); 
        System.out.println(ticket1.confirmPayment()); 
        System.out.println("4============================"); 
        System.out.println(ticket1); 
        System.out.println("5============================"); 
        CinemexTicket ticket2 = new CinemexTicket("Twisters", "10:00", "Sci-Fi", "August 10, 2024", "Premium"); 
        System.out.println("Total movie ticket(s): " + CinemexTicket.getTotalTickets()); 
        System.out.println("6============================"); 
        ticket2.calculateTicketPrice(); 
        System.out.println("7============================");         
        System.out.println(ticket2.confirmPayment()); 
        System.out.println("8============================"); 
        System.out.println(ticket2); 
        System.out.println("9============================"); 
        System.out.println(ticket2.confirmPayment()); 
    } 
}