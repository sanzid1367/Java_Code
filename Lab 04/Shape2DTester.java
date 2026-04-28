// Lab 04 Task 3

class Shape2D {
    // Instance variables to store the shape's properties
    public String shapeName;
    public int param1, param2, param3;
    public int type; // To track which formula to use for area

    // 1. Default constructor for a Square
    public Shape2D() {
        this.shapeName = "Square";
        this.param1 = 5;
        this.type = 1;
        System.out.println("A Square has been created with length: " + this.param1);
    }

    // 2. Constructor for a Rectangle
    public Shape2D(int length, int breadth) {
        this.shapeName = "Rectangle";
        this.param1 = length;
        this.param2 = breadth;
        this.type = 2;
        System.out.println("A Rectangle has been created with length: " + this.param1 + " and breadth: " + this.param2);
    }

    // 3. Constructor for a Triangle given height and base
    public Shape2D(int height, int base, String shapeName) {
        this.shapeName = shapeName;
        this.param1 = height;
        this.param2 = base;
        this.type = 3;
        System.out.println("A " + this.shapeName + " has been created with height: " + this.param1 + " and base: " + this.param2);
    }

    // 4. Constructor for a Triangle given 3 sides
    public Shape2D(int side1, int side2, int side3) {
        this.shapeName = "Triangle";
        this.param1 = side1;
        this.param2 = side2;
        this.param3 = side3;
        this.type = 4;
        System.out.println("A " + this.shapeName + " has been created with the following sides: " + this.param1 + ", " + this.param2 + ", " + this.param3);
    }

    // Method to calculate and print the area based on the shape type
    public void area() {
        double area = 0.0;
        
        if (this.type == 1) { // Square
            area = this.param1 * this.param1;
            System.out.println("The area of the " + this.shapeName + " is: " + area);
            
        } else if (this.type == 2) { // Rectangle
            area = this.param1 * this.param2;
            System.out.println("The area of the " + this.shapeName + " is: " + area);
            
        } else if (this.type == 3) { // Triangle (1/2 * base * height)
            area = 0.5 * this.param1 * this.param2;
            System.out.println("The area of the " + this.shapeName + " is: " + area);
            
        } else if (this.type == 4) { // Triangle (Heron's Formula)
            double s = (this.param1 + this.param2 + this.param3) / 2.0;
            area = Math.sqrt(s * (s - this.param1) * (s - this.param2) * (s - this.param3));
            
            // Truncating the result to 2 decimal places to match the exact expected output of "14.69"
            area = Math.floor(area * 100) / 100.0; 
            System.out.println("The area of the " + this.shapeName + " is: " + area);
        }
    }
}

public class Shape2DTester {
    public static void main(String[] args) {
        Shape2D sq = new Shape2D();
        System.out.println("---------1---------");
        sq.area();
        System.out.println("---------2---------");
        Shape2D rectangle = new Shape2D(5, 6);
        System.out.println("---------3---------");
        rectangle.area();
        System.out.println("---------4---------");
        Shape2D tri1 = new Shape2D(5, 6, "Triangle");
        System.out.println("---------5---------");
        tri1.area();
        System.out.println("---------6---------");
        Shape2D tri2 = new Shape2D(5, 6, 7);
        System.out.println("---------7---------");
        tri2.area();
        System.out.println("---------8---------");
    }
}