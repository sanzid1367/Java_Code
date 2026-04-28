import java.util.Scanner;
import java.util.Arrays;

public class task_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int n = sc.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr);

        double median;
        if (n % 2 != 0) {
            median = arr[n / 2];
        } else {
            median = (arr[(n / 2) - 1] + arr[n / 2]) / 2.0;
        }

        if (median == (int) median) {
            System.out.println("The median is " + (int) median + ".");
        } else {
            System.out.println("The median is " + median + ".");
        }
        sc.close();
    }
}