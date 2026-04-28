// LAb 2 task 4
class ImaginaryNumber {
    public int realPart;
    public int imaginaryPart;

    // Constructor to set default values
    public ImaginaryNumber() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    // Method to print the number in the required format
    public void printNumber() {
        System.out.println(this.realPart + " + " + this.imaginaryPart + "i");
    }
}

// The Tester class provided in the image
public class Tester6 {
    public static void main(String[] args) {
        ImaginaryNumber num1 = new ImaginaryNumber();
        num1.printNumber();
        System.out.println("1*********");
        
        num1.realPart = 3;
        num1.imaginaryPart = 7;
        num1.printNumber();
        System.out.println("2*********");
        
        ImaginaryNumber num2 = new ImaginaryNumber();
        num2.realPart = 1;
        num2.imaginaryPart = 9;
        num2.printNumber();
    }
}