// Lab 04 Task 1 
class Student {
    // Instance variables
    public String name;
    public String prog;

    // Constructor to initialize name and program
    public Student(String name, String prog) {
        this.name = name;
        this.prog = prog;
    }

    // Method to update the student's name
    public void updateName(String newName) {
        this.name = newName;
    }

    // Method to update the student's program
    public void updateProgram(String newProg) {
        this.prog = newProg;
    }

    // Method to return the student's program
    public String accessProgram() {
        return this.prog;
    }
}

public class StudentTester {
    public static void main(String[] args) {
        // 1. Create a new Student object
        Student s1 = new Student("Harry", "CSE");
        
        // 2. Print initial name (Expected: Harry)
        System.out.println(s1.name);
        
        // 3. Update and print name (Expected: Harry Potter)
        s1.updateName("Harry Potter");
        System.out.println(s1.name);
        
        // 4. Print initial program (Expected: CSE)
        System.out.println(s1.prog);
        
        // 5. Update program and access it via method (Expected: CS)
        s1.updateProgram("CS");
        String var = s1.accessProgram();
        System.out.println(var);
    }
}