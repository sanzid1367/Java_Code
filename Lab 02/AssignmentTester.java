// Lab 02 Task 6 
class Assignment {
    public int tasks;
    public String difficulty;
    public boolean submission;

    // Method to display the details of the assignment
    public void printDetails() {
        System.out.println("Number of tasks: " + this.tasks);
        System.out.println("Difficulty level: " + this.difficulty);
        System.out.println("Submission required: " + this.submission);
    }

    // Method to make the assignment optional and return a status message
    public String makeOptional() {
        if (this.submission == true) {
            this.submission = false;
            return "Assignment will not require submission";
        } else {
            return "Submission is already not required";
        }
    }
}

// The Driver Class provided in the image
public class AssignmentTester {
    public static void main(String[] args) {
        Assignment as1 = new Assignment();
        as1.printDetails();
        System.out.println("1-----------------");
        
        as1.tasks = 11;
        as1.difficulty = "Moderate";
        as1.submission = true;
        as1.printDetails();
        System.out.println("2-----------------");
        
        System.out.println(as1.makeOptional());
        System.out.println("3-----------------");
        
        as1.printDetails();
        System.out.println("4-----------------");
        
        Assignment as2 = new Assignment();
        as2.tasks = 12;
        as2.difficulty = "Hard";
        as2.submission = false;
        as2.printDetails();
        System.out.println("5-----------------");
        
        System.out.println(as2.makeOptional());
    }
}