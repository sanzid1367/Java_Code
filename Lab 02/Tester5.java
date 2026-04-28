// Lab2 task 5
class Course {
    public String courseName;
    public String courseCode;
    public int courseCredit;

    // Method to update the details of the course
    public void updateDetails(String name, String code, int credit) {
        this.courseName = name;
        this.courseCode = code;
        this.courseCredit = credit;
    }

    // Method to display the course information
    public void displayCourse() {
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Course Code: " + this.courseCode);
        System.out.println("Course Credit: " + this.courseCredit);
    }
}

// The driver code provided in the image
public class Tester5 {
    public static void main(String[] args) {
        Course c1 = new Course();
        Course c2 = new Course();
        
        c1.updateDetails("Programming Language I", "CSE110", 3);
        System.out.println("========== 1 ==========");
        c1.displayCourse();
        
        c2.updateDetails("Data Structures", "CSE220", 3);
        System.out.println("========== 2 ==========");
        c2.displayCourse();
        
        c1.updateDetails("Programming Language II", "CSE111", 3);
        System.out.println("========== 3 ==========");
        c1.displayCourse();
    }
}