// Lab 03 task 04
class Student {
    // Instance variables
    private String name;
    private String department;
    private double cgpa;
    private int credits;
    private String scholarshipStatus;

    // Default constructor
    public Student() {
        this.name = "Not Set";
        this.department = "CSE";
        this.cgpa = 0.0;
        this.credits = 9;
        this.scholarshipStatus = "Not Set";
    }

    // Overloaded method 1: Updates Name, CGPA, and Credits
    public void updateDetails(String name, double cgpa, int credits) {
        this.name = name;
        this.cgpa = cgpa;
        this.credits = credits;
    }

    // Overloaded method 2: Updates Name and CGPA
    public void updateDetails(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    // Overloaded method 3: Updates Name, CGPA, Credits, and Department
    public void updateDetails(String name, double cgpa, int credits, String department) {
        this.name = name;
        this.cgpa = cgpa;
        this.credits = credits;
        this.department = department;
    }

    // Method to check eligibility and update scholarship status
    public void checkScholarshipEligibility() {
        // First, check the base eligibility: CGPA >= 3.5 AND credits > 10
        if (cgpa >= 3.5 && credits > 10) {
            // Determine the specific type of scholarship
            if (cgpa >= 3.7) {
                scholarshipStatus = "Merit based scholarship";
                System.out.println(name + " is eligible for Merit based scholarship");
            } else {
                scholarshipStatus = "Need based scholarship";
                System.out.println(name + " is eligible for Need based scholarship");
            }
        } else {
            scholarshipStatus = "No scholarship";
            System.out.println(name + " is not eligible for scholarship");
        }
    }

    // Method to print student details
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Credits: " + credits);
        System.out.println("Scholarship Status: " + scholarshipStatus);
    }
}

// The provided Driver Class to test your code
public class StudentTester {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.showDetails();
        System.out.println("1-----------------");
        
        std1.updateDetails("Alif", 3.99, 12);
        System.out.println("2-----------------");
        
        std1.checkScholarshipEligibility();
        System.out.println("3-----------------");
        std1.showDetails();
        
        Student std2 = new Student();
        std2.updateDetails("Mim", 3.4);
        
        Student std3 = new Student();
        std3.updateDetails("Henry", 3.5, 15, "BBA");
        
        System.out.println("5-----------------");
        std2.checkScholarshipEligibility();
        
        System.out.println("6-----------------");
        std3.checkScholarshipEligibility();
        
        System.out.println("7-----------------");
        std2.showDetails();
        
        System.out.println("8-----------------");
        std3.showDetails();
    }
}