import java.util.Scanner;

public class task_07 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of an array (N) : ");
        int n = sc.nextInt();

        double [] original = new double[n];
        System.out.println("Please enter " + n + " double values :");
        for(int i = 0; i < n; i++){
            original[i] = sc.nextDouble();
        }

        int new_size = 0;
        if(n > 0){
            new_size = 1;
            for(int i = 1; i < n; i++){
                if(original[i] != original[i - 1]){
                    new_size++;
                }
            }
        }

        double [] newArr = new double[new_size];
        if(n > 0){
            newArr[0] = original[0];
            int index = 1;
            for(int i = 1; i < n; i++){
                if(original[i] != original[i - 1]){
                    newArr[index] = original[i];
                    index++;
                }
            }
        }

        System.out.println("New Array : ");
        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }

        int removedElements = n - new_size;
        System.out.println("\nTotal number of removed elements : " + removedElements);

sc.close();
    }
}
