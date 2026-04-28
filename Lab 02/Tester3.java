// Lab 2 task 8
class Employee {
    public String name;
    public double salary;
    public String designation;

    // Method to initialize a new employee
    public void newEmployee(String empName) {
        this.name = empName;
        this.salary = 30000.0;
        this.designation = "junior";
    }

    // Method to display employee details
    public void displayInfo() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary + " Tk");
        System.out.println("Employee Designation: " + this.designation);
    }

    // Method to calculate and print tax
    public void calculateTax() {
        if (this.salary > 50000) {
            double tax = this.salary * 0.30;
            System.out.println(this.name + " Tax Amount: " + tax + " Tk");
        } else if (this.salary > 30000) {
            double tax = this.salary * 0.10;
            System.out.println(this.name + " Tax Amount: " + tax + " Tk");
        } else {
            System.out.println("No need to pay tax");
        }
    }

    // Method to promote an employee and update their salary
    public void promoteEmployee(String newDesignation) {
        this.designation = newDesignation;
        
        if (newDesignation.equals("senior")) {
            this.salary += 25000.0;
        } else if (newDesignation.equals("lead")) {
            this.salary += 50000.0;
        } else if (newDesignation.equals("manager")) {
            this.salary += 75000.0;
        }
        
        System.out.println(this.name + " has been promoted to " + this.designation);
        System.out.println("New Salary: " + this.salary + " Tk");
    }
}

// The Driver class provided in the image
public class Tester3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        
        emp1.newEmployee("Harry Potter");
        emp2.newEmployee("Hermione Granger");
        emp3.newEmployee("Ron Weasley");
        
        System.out.println("1 ==========");
        emp1.displayInfo();
        
        System.out.println("2 ==========");
        emp2.displayInfo();
        
        System.out.println("3 ==========");
        emp3.displayInfo();
        
        System.out.println("4 ==========");
        emp1.calculateTax();
        
        System.out.println("5 ==========");
        emp1.promoteEmployee("lead");
        
        System.out.println("6 ==========");
        emp1.calculateTax();
        
        System.out.println("7 ==========");
        emp1.displayInfo();
        
        System.out.println("8 ==========");
        emp3.promoteEmployee("manager");
        
        System.out.println("9 ==========");
        emp3.calculateTax();
        
        System.out.println("10 ==========");
        emp3.displayInfo();
    }
}