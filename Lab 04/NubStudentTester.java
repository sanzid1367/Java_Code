//Lab 04 Task 7
class NubStudent {
    private String name;
    private String home;
    private boolean hasPass;

    // Constructor to initialize student details
    public NubStudent(String name, String home) {
        this.name = name;
        this.home = home;
        this.hasPass = false; // By default, no pass
    }

    // Method to get a bus pass
    public void getPass() {
        this.hasPass = true;
    }

    // Method to update the student's home location
    public void updateHome(String newHome) {
        this.home = newHome;
    }

    // Method to display student details
    public void showDetails() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Lives in " + this.home);
        System.out.println("Have Bus Pass? " + this.hasPass);
    }

    // Getters for use in the NubBus class
    public String getName() { return this.name; }
    public String getHome() { return this.home; }
    public boolean hasPass() { return this.hasPass; }
}

class NubBus {
    private String route;
    private int capacity;
    private NubStudent[] passengers;
    private int passengerCount;

    // Constructor with default capacity (2)
    public NubBus(String route) {
        this.route = route;
        this.capacity = 2;
        this.passengers = new NubStudent[this.capacity];
        this.passengerCount = 0;
    }

    // Constructor with custom capacity
    public NubBus(String route, int capacity) {
        this.route = route;
        this.capacity = capacity;
        this.passengers = new NubStudent[this.capacity];
        this.passengerCount = 0;
    }

    // Helper method to handle boarding logic for a single student
    private void tryBoard(NubStudent student) {
        if (this.passengerCount >= this.capacity) {
            System.out.println("Bus is full!");
            return;
        }
        if (!student.hasPass()) {
            System.out.println("You don't have a bus pass!");
            return;
        }
        if (!student.getHome().equals(this.route)) {
            System.out.println("You got on the wrong bus!");
            return;
        }
        
        // If all checks pass, board the student
        this.passengers[this.passengerCount] = student;
        this.passengerCount++;
        System.out.println(student.getName() + " boarded the bus.");
    }

    // Overloaded board method: no arguments
    public void board() {
        System.out.println("No passengers");
    }

    // Overloaded board method: 1 student
    public void board(NubStudent student) {
        tryBoard(student);
    }

    // Overloaded board method: 2 students
    public void board(NubStudent s1, NubStudent s2) {
        tryBoard(s1);
        tryBoard(s2);
    }

    // Method to show bus details and current passengers
    public void showDetails() {
        System.out.println("Bus Route: " + this.route);
        System.out.println("Passenger Count: " + this.passengerCount + " (Max: " + this.capacity + ")");
        System.out.println("Passengers on Board:");
        if (this.passengerCount == 0) {
            // No passengers to list
        } else {
            for (int i = 0; i < this.passengerCount; i++) {
                System.out.print(this.passengers[i].getName() + (i < this.passengerCount - 1 ? " " : ""));
            }
            System.out.println();
        }
    }
}

public class NubStudentTester {
    public static void main(String[] args) {
        NubStudent st1 = new NubStudent("Afif", "Mirpur");
        System.out.println("1===================");
        NubStudent st2 = new NubStudent("Shanto", "Motijheel");
        NubStudent st3 = new NubStudent("Taskin", "Mirpur");
        st1.showDetails();
        st2.showDetails();
        System.out.println("2===================");
        st3.showDetails();
        System.out.println("3===================");
        NubBus bus1 = new NubBus("Mirpur");
        NubBus bus2 = new NubBus("Azimpur", 5);
        bus1.showDetails();
        bus2.showDetails();
        System.out.println("4===================");
        st2.getPass();
        st3.getPass();
        System.out.println("5===================");
        st2.showDetails();
        st3.showDetails();
        System.out.println("6===================");
        bus1.board();
        System.out.println("7===================");
        bus1.board(st1, st2);
        System.out.println("8===================");
        st1.getPass();
        st2.updateHome("Mirpur");
        st1.showDetails();
        st2.showDetails();
        System.out.println("9===================");
        bus1.board(st1);
        bus1.board(st2, st3);
        System.out.println("10==================");
        bus1.showDetails();
    }
}