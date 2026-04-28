// lab 03 task 07
class Cart {
    // Instance variables
    private int cartNumber;
    private String[] items;
    private double[] prices;
    private int itemCount;
    private double discount;

    // Default constructor
    public Cart() {
        this.itemCount = 0;
        this.discount = 0.0;
    }

    // Method to initialize the cart number and the arrays
    public void create_cart(int cartNumber) {
        this.cartNumber = cartNumber;
        this.items = new String[3];  // Cart can hold up to 3 items
        this.prices = new double[3]; // Prices array size must match items array
    }

    // Method to add an item (String name, double price)
    public void addItem(String name, double price) {
        if (itemCount < 3) {
            items[itemCount] = name;
            prices[itemCount] = price;
            itemCount++;
            System.out.println(name + " added to cart " + cartNumber + ".");
            System.out.println("You have " + itemCount + " item(s) in your cart now.");
        } else {
            System.out.println("You already have 3 items on your cart");
        }
    }

    // Overloaded method to add an item (double price, String name)
    public void addItem(double price, String name) {
        // Reuse the logic from the other addItem method
        this.addItem(name, price);
    }

    // Method to set the discount percentage
    public void giveDiscount(double discountAmount) {
        this.discount = discountAmount;
    }

    // Method to print the cart details and calculate the total price
    public void cartDetails() {
        System.out.println("Your cart(c" + cartNumber + ") :");
        
        double total = 0.0;
        
        // Loop through the arrays based on how many items were actually added
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i] + " - " + prices[i]);
            total += prices[i];
        }
        
        System.out.println("Discount Applied: " + discount + "%");
        
        // Calculate the final price after applying the discount
        double finalTotal = total - (total * (discount / 100.0));
        System.out.println("Total price: " + finalTotal);
    }
}

// The provided Driver Class to test your code
public class CartTester {
    public static void main(String[] args) {
        Cart c1 = new Cart();
        Cart c2 = new Cart();
        Cart c3 = new Cart();

        c1.create_cart(1);
        c2.create_cart(2);
        c3.create_cart(3);

        System.out.println("====1====");
        c1.addItem("Table", 3900.5);
        c1.addItem("Chair", 1400.76);
        c1.addItem(5400.87, "Television");
        c1.addItem(5000.0, "Refrigerator");

        System.out.println("====2====");
        c2.addItem("Stove", 439.90);

        System.out.println("====3====");
        c3.addItem("Chair", 1400.5);
        c3.addItem(3400.0, "Chair");

        System.out.println("====4====");
        c1.cartDetails();

        System.out.println("====5====");
        c2.cartDetails();

        System.out.println("====6====");
        c3.cartDetails();
        
        c1.giveDiscount(10);

        System.out.println("====7====");
        c1.cartDetails();
    }
}