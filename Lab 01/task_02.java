import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start integers values:");
        int start = sc.nextInt();
        System.out.println("Enter end integers values:");
        int end = sc.nextInt();
        sc.close();

        int count = 0;
        int prime = 0;

        for (int i = start; i <= end; i++) {
            if (i > 2) {
                for (int a = 2; a < i; a++) {
                    if (i % a == 0) {
                        prime = 0;
                        break;
                    } else {
                        prime = 1;
                    }
                }
            }
            if (prime == 1) {
                count++;
            }
        }

        System.out.println("Total prime numbers between " + start + " and " + end + " is: " + count);
    }

}
