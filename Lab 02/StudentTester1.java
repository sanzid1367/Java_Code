// Lab 02 Task 2
class Student {
    public String name;
    public int id;

    public Student() {
        this.name = "Default";
        this.id = 0;
    }
}

// The Tester class provided in the image
public class StudentTester1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Name of the Student: " + s1.name);
        System.out.println("ID of the Student: " + s1.id);
        
        s1.name = "Bob";
        s1.id = 123;
        
        System.out.println("Name of the Student: " + s1.name);
        System.out.println("ID of the Student: " + s1.id);
    }
}