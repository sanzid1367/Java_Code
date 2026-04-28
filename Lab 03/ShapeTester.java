// Lab 03 task 02
class Shape {
    // Instance variables
    private String name;
    private double area;

    // Overloaded method for Circle (Parameters: String, int)
    public void setParameters(String name, int radius) {
        this.name = name;
        // Using Math.PI and rounding to 2 decimal places to match expected output
        this.area = Math.round(Math.PI * radius * radius * 100.0) / 100.0; 
    }

    // Overloaded method for Triangle (Parameters: String, int, int)
    public void setParameters(String name, int base, int height) {
        this.name = name;
        // Area of triangle = 0.5 * base * height
        this.area = 0.5 * base * height;
    }

    // Overloaded method for Rectangle (Parameters: String, double, double)
    public void setParameters(String name, double length, double width) {
        this.name = name;
        // Area of rectangle = length * width
        // Rounding to 2 decimal places to avoid floating-point precision issues
        this.area = Math.round(length * width * 100.0) / 100.0;
    }

    // Method to return shape details as a formatted string
    public String details() {
        return "Shape Name: " + name + "\nArea: " + area;
    }
}

// The provided Driver Class to test your code
public class ShapeTester {
    public static void main(String args []) {
        Shape circle = new Shape();
        Shape triangle = new Shape();
        Shape rectangle = new Shape();

        circle.setParameters("Circle", 5);
        triangle.setParameters("Triangle", 4, 7);
        rectangle.setParameters("Rectangle", 2.4, 4.4);

        System.out.println(circle.details());
        System.out.println("1-------------");
        System.out.println(triangle.details());
        System.out.println("2-------------");
        System.out.println(rectangle.details());
    }
}