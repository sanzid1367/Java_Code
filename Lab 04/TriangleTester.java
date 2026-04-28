//Lab 04 Task 5
class Triangle {
    // Instance variables to store the lengths of the three sides
    public int side1, side2, side3;

    // Constructor to initialize the sides
    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Method to print the sides and the calculated perimeter
    public void triangleDetails() {
        System.out.println("Three sides of the triangle are: " + this.side1 + ", " + this.side2 + ", " + this.side3);
        System.out.println("Perimeter: " + (this.side1 + this.side2 + this.side3));
    }

    // Method to determine and return the type of the triangle as a String
    public String printTriangleType() {
        if (this.side1 == this.side2 && this.side2 == this.side3) {
            return "This is an Equilateral Triangle.";
        } else if (this.side1 == this.side2 || this.side2 == this.side3 || this.side1 == this.side3) {
            return "This is an Isosceles Triangle.";
        } else {
            return "This is a Scalene Triangle.";
        }
    }

    // Method to compare the current triangle with another triangle passed as an argument
    public void compareTriangles(Triangle t) {
        // Check 1: Do they point to the exact same object in memory?
        if (this == t) {
            System.out.println("These two triangle objects have the same address.");
        } 
        // Check 2: Are all sides equal in the exact same orientation?
        else if (this.side1 == t.side1 && this.side2 == t.side2 && this.side3 == t.side3) {
            System.out.println("Addresses are different but the sides of the triangles are equal.");
        } 
        // Check 3: Is only the perimeter equal?
        else if ((this.side1 + this.side2 + this.side3) == (t.side1 + t.side2 + t.side3)) {
            System.out.println("Only the perimeter of both triangles is equal.");
        } 
        // Check 4: If none of the above match
        else {
            System.out.println("Addresses, length of the sides and perimeter all are different.");
        }
    }
}

public class TriangleTester {
    public static void main(String args[]) {
        Triangle t1 = new Triangle(4, 4, 4);
        Triangle t2 = new Triangle(4, 5, 6);
        Triangle t3 = new Triangle(4, 5, 6);
        Triangle t4 = new Triangle(5, 4, 6);

        t1.triangleDetails();
        System.out.println("--------1--------");
        System.out.println(t1.printTriangleType());
        System.out.println("--------2--------");
        t3.triangleDetails();
        System.out.println(t3.printTriangleType());
        System.out.println("--------3--------");
        t4.triangleDetails();
        System.out.println(t4.printTriangleType());
        System.out.println("--------4--------");
        t2.compareTriangles(t3);
        System.out.println("--------5--------");
        t1.compareTriangles(t2);
        System.out.println("--------6--------");
        t1 = t2;
        t1.compareTriangles(t2);
        System.out.println("--------7--------");
        t3.compareTriangles(t4);
    }
}