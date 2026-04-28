// Lab 03 task 03
class Shelf {
    // Instance variables
    // capacity must be public (or default) because it is accessed directly in the driver class
    public int capacity; 
    public int numberOfBooks;

    // Default constructor
    public Shelf() {
        this.capacity = 0;
        this.numberOfBooks = 0;
    }

    // Method to display shelf details
    public void showDetails() {
        System.out.println("Shelf capacity: " + capacity);
        System.out.println("Number of books: " + numberOfBooks);
    }

    // Method to add books with conditional checks
    public void addBooks(int count) {
        if (capacity == 0) {
            System.out.println("Zero capacity. Cannot add books.");
        } else if (numberOfBooks + count > capacity) {
            System.out.println("Exceeds capacity");
        } else {
            numberOfBooks += count;
            System.out.println(count + " books added to shelf");
        }
    }
}

// The provided Driver Class to test your code
public class ShelfTester {
    public static void main(String[] args) {
        Shelf shelf = new Shelf();
        shelf.showDetails();
        System.out.println("1---------------");
        
        shelf.addBooks(3);
        System.out.println("2---------------");
        
        shelf.capacity = 7;
        shelf.addBooks(3);
        System.out.println("3---------------");
        
        shelf.showDetails();
        System.out.println("4---------------");
        
        shelf.addBooks(5);
        shelf.showDetails();
        
        shelf.capacity += 4;
        System.out.println("6---------------");
        
        shelf.addBooks(5);
        shelf.showDetails();
    }
}