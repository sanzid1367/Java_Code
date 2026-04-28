// Class 1: The Blueprint
// Lab_task_01
class University {
    public String name;
    public String country;
}

// Class 2: The Tester (contains the main method)
public class UniversityTester {
    public static void main(String[] args) {
        
        // --- Part (a) ---
        // Creating 2 distinct objects in the Heap memory
        University uni1 = new University();
        University uni2 = new University();

        // Printing the "location" (the default toString() representation)
        System.out.println("Location of uni1: " + uni1);
        System.out.println("Location of uni2: " + uni2);

        // Printing initial instance variables (default values are null)
        System.out.println("uni1 Name: " + uni1.name + ", Country: " + uni1.country);
        System.out.println("uni2 Name: " + uni2.name + ", Country: " + uni2.country);

        // Comparing locations
        if (uni1 == uni2) {
            System.out.println("The locations are the same.");
        } else {
            System.out.println("The locations are NOT the same.");
        }

        System.out.println("------------------------------------");

        // --- Part (b) ---
        // Changing instance variables of the first object
        uni1.name = "Imperial College London";
        uni1.country = "England";

        // Changing instance variables of the second object
        uni2.name = "BRAC University";
        uni2.country = "Bangladesh";

        // Checking if values changed
        System.out.println("Updated uni1: " + uni1.name + " (" + uni1.country + ")");
        System.out.println("Updated uni2: " + uni2.name + " (" + uni2.country + ")");

        // Logic check: Are the values the same?
        if (!uni1.name.equals(uni2.name)) {
            System.out.println("The instance variables are now different from each other.");
        }
    }
}