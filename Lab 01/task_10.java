import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers :");

        // Read 5 numbers
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            
        }

        int largest = numbers[0];
        int smallest = numbers[0];
        int largestLoc = 0;
        int smallestLoc = 0;

        for (int i = 1; i < 5; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
                largestLoc = i;
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
                smallestLoc = i;
            }
        }

        System.out.println("The largest number " + largest + " was found at location " + largestLoc + ".");
        System.out.println("The smallest number " + smallest + " was found at location " + smallestLoc + ".");
        
        sc.close();
    }
}