// Lab02 Task 3
class CSECourse {
    public String courseName;
    public String courseCode;
    public int credit;

    // Constructor to assign the default values
    public CSECourse() {
        this.courseName = "Programming Language II";
        this.courseCode = "CSE111";
        this.credit = 3;
    }
}

// The driver code provided in the image
public class CourseTester {
    public static void main(String args []) {
        CSECourse c1 = new CSECourse();
        System.out.println("Course Name: " + c1.courseName);
        System.out.println("Course Code: " + c1.courseCode);
        System.out.println("Credit: " + c1.credit);
    }
}