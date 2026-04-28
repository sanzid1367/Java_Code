// Lab 03 task 08
class Reader {
    // Instance variables
    private String name;
    private int capacity;
    private String[] books;
    private int bookCount;

    // Default constructor
    public Reader() {
        this.name = "New user";
        this.capacity = 0;
        this.bookCount = 0;
    }

    // Method to initialize reader properties and the books array
    public String createReader(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.books = new String[capacity]; // Create the array with the specified capacity
        return "A new reader is created!";
    }

    // Method to display reader details
    public void readerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Books:");
        
        // Check if any books have been added yet
        if (bookCount == 0) {
            System.out.println("No books added yet");
        } else {
            for (int i = 0; i < bookCount; i++) {
                System.out.println("Book " + (i + 1) + ": " + books[i]);
            }
        }
    }

    // Method to add a book to the reader's list
    public void addBook(String bookName) {
        // Check if the current number of books is less than the total capacity
        if (bookCount < capacity) {
            books[bookCount] = bookName; // Assign the book to the next available index
            bookCount++;                 // Increment the count
        } else {
            System.out.println("No more capacity");
        }
    }
}

// The provided Driver Class to test your code
public class Reader_tester {
    public static void main(String[] args) {
        Reader r1 = new Reader();
        Reader r2 = new Reader();

        System.out.println("1 ==========");
        System.out.println(r1.createReader("Messi", 2));
        System.out.println(r2.createReader("Ronaldo", 3));

        System.out.println("2 ==========");
        r1.readerInfo();

        System.out.println("3 ==========");
        r2.addBook("Java");
        r2.addBook("Python");
        r2.addBook("C++");
        r2.readerInfo();

        System.out.println("4 ==========");
        r1.addBook("C#");
        r1.addBook("Rust");
        r1.addBook("GoLang");

        System.out.println("5 ==========");
        r2.addBook("Python");

        System.out.println("6 ==========");
        r1.readerInfo();
    }
}