import java.util.Scanner;

public class task_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int[] originalArray = new int[n];

        for (int i = 0; i < n; i++) {
            originalArray[i] = sc.nextInt();
        }

        System.out.print("Remove Element = ");
        int toRemove = sc.nextInt();

        System.out.print("Input array:\n");
        for (int val : originalArray) System.out.print(val + " ");
        System.out.println();

        int count = 0;
        for (int val : originalArray) {
            if (val == toRemove) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Element not found");
        } else {
            int[] newArray = new int[n - count];
            int index = 0;

            for (int i = 0; i < n; i++) {
                if (originalArray[i] != toRemove) {
                    newArray[index] = originalArray[i];
                    index++;
                }
            }
            System.out.println("New array:");
            for (int val : newArray) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}