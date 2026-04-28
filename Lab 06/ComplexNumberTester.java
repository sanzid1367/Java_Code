//Lab_06 Task 05
class RealNumber {
    public double realValue;
    
    public RealNumber() {
        this(0.0);
    }
    
    public RealNumber(double realValue) {
        this.realValue = realValue;
    }
    
    public String toString() {
        return "RealPart: " + realValue;
    }
}

// Write the ComplexNumber class here
class ComplexNumber extends RealNumber {
    public double imaginaryValue;

    // Default constructor
    public ComplexNumber() {
        super(1.0); // Sets the inherited realValue to 1.0
        this.imaginaryValue = 1.0;
    }

    // Parameterized constructor
    public ComplexNumber(double realValue, double imaginaryValue) {
        super(realValue); // Passes the realValue to the parent constructor
        this.imaginaryValue = imaginaryValue;
    }

    @Override
    public String toString() {
        // Appends the imaginary part to the parent's string representation
        return super.toString() + "\nImaginaryPart: " + imaginaryValue;
    }
}

// Tester Class
public class ComplexNumberTester {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber();
        System.out.println(cn1);
        System.out.println("--------------------");
        ComplexNumber cn2 = new ComplexNumber(5.0, 7.0);
        System.out.println(cn2);
    }
}