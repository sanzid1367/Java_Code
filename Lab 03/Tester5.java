// Lab 03 task 05
class Library {
    // Instance variables
    private int capacity;
    private int totalBooks;
    private String[] bookList;

    // Default constructor
    public Library() {
        this.capacity = 0;
        this.totalBooks = 0;
    }

    // Method to set the maximum capacity and initialize the book array
    public void setBookCapacity(int capacity) {
        this.capacity = capacity;
        this.bookList = new String[capacity]; // Create an array of Strings with the given capacity
    }

    // Method to add a book to the library
    public void addBook(String bookName) {
        if (totalBooks >= capacity) {
            System.out.println("Exceeds maximum capacity. You can't add more than " + capacity + " books");
        } else {
            bookList[totalBooks] = bookName; // Add the book at the current index
            totalBooks++;                    // Increment the total number of books
            System.out.println("Book '" + bookName + "' added to the library");
        }
    }

    // Method to print the library details and the list of books
    public void printDetail() {
        System.out.println("Maximum Capacity: " + capacity);
        System.out.println("Total Books: " + totalBooks);
        System.out.println("Book list:");
        for (int i = 0; i < totalBooks; i++) {
            System.out.println(bookList[i]);
        }
    }
}

// The provided Driver Class to test your code
public class Tester5 {
    public static void main(String[] args) {
        Library a1 = new Library();
        a1.setBookCapacity(3);
        System.out.println("1-----------------");
        
        a1.addBook("Ice");
        System.out.println("2-----------------");
        a1.printDetail();
        System.out.println("3-----------------");
        
        a1.addBook("Emma");
        a1.addBook("Wings");
        a1.addBook("Next");
        System.out.println("4-----------------");
        a1.printDetail();
        
        Library a2 = new Library();
        a2.setBookCapacity(4);
        System.out.println("5-----------------");
        
        a2.addBook("Onnobhubon");
        a2.addBook("Ami");
        System.out.println("6-----------------");
        a2.printDetail();
        System.out.println("7-----------------");
        
        a2.addBook("Deyal");
        a2.addBook("Himu");
        a2.addBook("Megher Upor Bari");
        System.out.println("8-----------------");
        a2.printDetail();
    }
}