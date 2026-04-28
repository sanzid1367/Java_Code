import java.util.Scanner;

public class task_05 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter then length of an array: ");
      int num = sc.nextInt();  
      int[] arr = new int[num];

      for(int i = 0; i < num; i++){
        System.out.println("Enter the array element :" + (i+1));
        arr[i] = sc.nextInt();
      }

      for(int i = 0; i < num / 2; i++){
        int temp = arr[i];
        arr[i] = arr[num - i - 1];
        arr[num - i - 1] = temp;
      }

      for(int i = 0; i < num; i++){
        System.out.print(arr[i] + " ");
      }
sc.close();
    }
    
}
