// Lab 03 task 06
class TaxiLagbe {
    // Instance variables
    private String taxiNumber;
    private String area;
    private int passengerCount;
    private int totalFare;
    private String passengerList;

    // Default constructor
    public TaxiLagbe() {
        this.taxiNumber = "";
        this.area = "";
        this.passengerCount = 0;
        this.totalFare = 0;
        this.passengerList = "";
    }

    // Method to store taxi information
    public void storeInfo(String taxiNumber, String area) {
        this.taxiNumber = taxiNumber;
        this.area = area;
    }

    // Overloaded Method 1: Add a single passenger
    public void addPassenger(String name, int fare) {
        // Check if the taxi has reached its maximum capacity of 4
        if (passengerCount < 4) {
            System.out.println("Dear " + name + "! Welcome to TaxiLagbe");
            
            // Format the passenger list string correctly (prevent leading spaces)
            if (passengerCount == 0) {
                passengerList = name;
            } else {
                passengerList += " " + name;
            }
            
            totalFare += fare;
            passengerCount++;
        } else {
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }

    // Overloaded Method 2: Add two passengers at once
    public void addPassenger(String name1, int fare1, String name2, int fare2) {
        // Reuse the single addPassenger method logic for both passengers
        this.addPassenger(name1, fare1);
        this.addPassenger(name2, fare2);
    }

    // Method to print taxi details
    public void printDetails() {
        System.out.println("Taxi number: " + taxiNumber);
        System.out.println("This taxi can cover " + area + " area");
        System.out.println("Total Passenger: " + passengerCount);
        System.out.println("Passenger Lists:");
        
        // Only print the names line if there are actually passengers
        if (passengerCount > 0) {
            System.out.println(passengerList);
        }
        
        System.out.println("Total collected fare: " + totalFare + " Taka");
    }
}

// The provided Driver Class to test your code
public class TaxiTester {
    public static void main(String[] args) {
        TaxiLagbe taxi1 = new TaxiLagbe();
        taxi1.storeInfo("1010-01", "Dhaka");
        System.out.println("1-----------------");
        
        taxi1.printDetails();
        System.out.println("2-----------------");
        
        taxi1.addPassenger("Wilson", 105);
        System.out.println("3-----------------");
        
        taxi1.printDetails();
        System.out.println("4-----------------");
        
        taxi1.addPassenger("Walker", 100, "Wood", 200);
        System.out.println("5-----------------");
        
        taxi1.printDetails();
        System.out.println("6-----------------");
        
        taxi1.addPassenger("Karen", 200);
        taxi1.addPassenger("Donald", 130);
        System.out.println("7-----------------");
        
        taxi1.printDetails();
        System.out.println("8-----------------");
        
        TaxiLagbe taxi2 = new TaxiLagbe();
        taxi2.storeInfo("1010-02", "Khulna");
        taxi2.addPassenger("Don", 115, "Parker", 215);
        System.out.println("9-----------------");
        
        taxi2.printDetails();
    }
}