// Lab 04 Task 6
class Course {
    public String courseName;

    // Constructor to initialize the course name
    public Course(String courseName) {
        this.courseName = courseName;
    }
}

class Teacher {
    private String name;
    private String initial;
    private Course[] courses; // Array to store course objects
    private int courseCount;

    // Constructor to initialize the teacher's details and the course array
    public Teacher(String name, String initial) {
        this.name = name;
        this.initial = initial;
        this.courses = new Course[3]; // Hint: maximum of 3 courses
        this.courseCount = 0;
        System.out.println("A new teacher has been created");
    }

    // Method to add a course to the teacher's list
    public void addCourse(Course c) {
        if (this.courseCount < 3) {
            this.courses[this.courseCount] = c;
            this.courseCount++;
        } else {
            System.out.println("Cannot add more than 3 courses.");
        }
    }

    // Method to print the teacher's details and their courses
    public void printDetail() {
        System.out.println("Name: " + this.name);
        System.out.println("Initial: " + this.initial);
        System.out.println("List of courses:");
        for (int i = 0; i < this.courseCount; i++) {
            System.out.println(this.courses[i].courseName);
        }
    }
}

public class TestTeacher {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Matin Saad Abdullah", "MSA");
        Teacher t2 = new Teacher("Mumit Khan", "MMK");
        Teacher t3 = new Teacher("Sadia Hamid Kazi", "SKZ");
        
        Course c1 = new Course("CSE 110");
        Course c2 = new Course("CSE 111");
        Course c3 = new Course("CSE 220");
        Course c4 = new Course("CSE 221");
        Course c5 = new Course("CSE 230");
        Course c6 = new Course("CSE 310");
        Course c7 = new Course("CSE 320");
        Course c8 = new Course("CSE 340");
        
        t1.addCourse(c1);
        t1.addCourse(c2);
        
        t2.addCourse(c3);
        t2.addCourse(c4);
        t2.addCourse(c5);
        
        t3.addCourse(c6);
        t3.addCourse(c7);
        t3.addCourse(c8);
        
        System.out.println("1========================");
        t1.printDetail();
        System.out.println("2========================");
        t2.printDetail();
        System.out.println("3========================");
        t3.printDetail();
    }
}