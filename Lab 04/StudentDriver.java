// Lab 04 Task 4
class Student {
    private int id;
    private double cgpa;
    private boolean isCgpaSet;
    private String[] courses;
    private int courseCount;

    // Constructor with ID only
    public Student(int id) {
        this.id = id;
        this.isCgpaSet = false;
        this.courses = new String[4]; // Maximum 4 courses allowed
        this.courseCount = 0;
        System.out.println("A student with ID " + id + " has been created.");
    }

    // Constructor with ID and CGPA
    public Student(int id, double cgpa) {
        this.id = id;
        this.cgpa = cgpa;
        this.isCgpaSet = true;
        this.courses = new String[4];
        this.courseCount = 0;
        System.out.println("A student with ID " + id + " and cgpa " + cgpa + " has been created.");
    }

    // Setters
    public void storeCG(double cgpa) {
        this.cgpa = cgpa;
        this.isCgpaSet = true;
    }

    public void storeID(int id) {
        this.id = id;
    }

    // Method to add a single course
    public void addCourse(String course) {
        if (!isCgpaSet) {
            System.out.println("Failed to add " + course);
            System.out.println("Set CG first");
            return;
        }
        
        if (cgpa < 3.0 && courseCount >= 3) {
            System.out.println("Failed to add " + course);
            System.out.println("CG is low. Can't add more than 3 courses.");
            return;
        }
        
        if (courseCount >= 4) {
            System.out.println("Failed to add " + course);
            System.out.println("Maximum 4 courses allowed.");
            return;
        }
        
        // If all checks pass, add the course
        courses[courseCount] = course;
        courseCount++;
    }

    // Method to add multiple courses (Overloaded method)
    public void addCourse(String[] newCourses) {
        for (String course : newCourses) {
            addCourse(course); // Reuse the single-course logic
        }
    }

    // Clear all courses
    public void removeAllCourse() {
        this.courseCount = 0;
    }

    // Display student information
    public void showAdvisee() {
        System.out.println("Student ID: " + id + ", CGPA: " + cgpa);
        if (courseCount == 0) {
            System.out.println("No courses added.");
        } else {
            System.out.println("Added courses are:");
            for (int i = 0; i < courseCount; i++) {
                System.out.print(courses[i] + (i < courseCount - 1 ? " " : ""));
            }
            System.out.println(); // Move to the next line after listing courses
        }
    }
}

public class StudentDriver {
    public static void main(String[] args) {
        Student student1 = new Student(12345678);
        System.out.println("1------------------");
        student1.addCourse("CSE110");
        System.out.println("2------------------");
        student1.storeCG(2.5);
        student1.addCourse("CSE110");
        student1.addCourse("ENG101");
        student1.showAdvisee();
        System.out.println("3------------------");
        student1.removeAllCourse();
        student1.showAdvisee();
        System.out.println("4------------------");
        student1.storeID(54652365);
        String[] courses = {"SOC101", "CSE111", "ENG102"};
        student1.addCourse(courses);
        student1.showAdvisee();
        System.out.println("5------------------");
        student1.addCourse("CSE230");
        student1.showAdvisee();
        System.out.println("6------------------");
        Student student2 = new Student(975738383, 3.7);
        System.out.println("7------------------");
        String[] courses2 = {"CSE220", "PHY112", "MAT120", "BUS101", "CHN101"};
        student2.addCourse(courses2);
        student2.showAdvisee();
    }
}