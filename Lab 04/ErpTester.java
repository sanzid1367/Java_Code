// Lab 04 Task 8
class Student {
    // Instance variables
    public String name;
    public int id;
    public String department;
    public String email;
    public String password;
    public boolean isLoggedIn;
    public String[] advisedCourses;

    // Constructor to initialize student details
    public Student(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
        // Default values as requested
        this.email = null;
        this.password = null;
        this.isLoggedIn = false;
        System.out.println("Student object is created");
    }
}

class Erp {
    // Instance variables
    private int totalAdvisee;
    private Student[] advisees;

    // Constructor to initialize ERP system
    public Erp() {
        this.totalAdvisee = 0;
        this.advisees = new Student[5]; // Max 5 advisees allowed
        System.out.println("Erp is ready to use!");
    }

    // Method to handle login
    public void login(Student s) {
        if (s.email == null || s.password == null) {
            System.out.println("Email and password need to be set.");
        } else {
            s.isLoggedIn = true;
            System.out.println("Login successful");
        }
    }

    // Method to handle advising with a variable number of course arguments (varargs)
    public void advising(Student s, String... courses) {
        if (!s.isLoggedIn) {
            System.out.println("Please login to advise courses!");
            return;
        }
        
        if (courses.length == 0) {
            System.out.println("You haven't selected any courses.");
            return;
        }
        
        if (courses.length > 3) {
            System.out.println("You need special approval to take more than 3 courses.");
            return;
        }
        
        // If all checks pass, advising is successful
        s.advisedCourses = courses;
        
        if (this.totalAdvisee < 5) {
            this.advisees[totalAdvisee] = s;
            this.totalAdvisee++;
            System.out.println("Advising successful!");
        } else {
            System.out.println("Erp capacity is full.");
        }
    }

    // Method to display all successful advisee information
    public void allAdviseeInfo() {
        System.out.println("Total Advisee: " + this.totalAdvisee);
        for (int i = 0; i < this.totalAdvisee; i++) {
            Student s = this.advisees[i];
            System.out.println("Name: " + s.name + " ID: " + s.id);
            System.out.println("Department: " + s.department);
            System.out.println("Advised Courses:");
            for (int j = 0; j < s.advisedCourses.length; j++) {
                System.out.print(s.advisedCourses[j] + (j < s.advisedCourses.length - 1 ? " " : ""));
            }
            System.out.println(); // Move to the next line after printing courses
            System.out.println("================");
        }
    }
}

public class ErpTester {
    public static void main(String[] args) {
        Student rakib = new Student("Rakib", 12301455, "CSE");
        Student roy = new Student("Roy", 12501345, "CS");
        System.out.println("1***************");
        Erp ErpObj = new Erp();
        System.out.println("2***************");
        ErpObj.login(rakib);
        System.out.println("3***************");
        ErpObj.advising(rakib);
        System.out.println("4***************");
        rakib.email = "rakib@hotmail.com";
        rakib.password = "1234";
        System.out.println("5***************");
        ErpObj.login(rakib);
        System.out.println("6***************");
        ErpObj.advising(rakib);
        System.out.println("7***************");
        ErpObj.advising(rakib, "CSE110", "PHY111", "MAT110", "CSE260");
        System.out.println("8***************");
        ErpObj.advising(rakib, "CSE110", "PHY111", "MAT110");
        System.out.println("9***************");
        ErpObj.allAdviseeInfo();
        System.out.println("10**************");
        roy.email = "roy@hotmail.com";
        roy.password = "abcd";
        ErpObj.login(roy);
        System.out.println("11**************");
        ErpObj.advising(roy, "CSE110", "ENG101", "PHY112");
        System.out.println("12**************");
        ErpObj.allAdviseeInfo();
    }
}