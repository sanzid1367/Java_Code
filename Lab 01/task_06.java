import java.util.Scanner;

public class task_06 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number N :");
        int n = sc.nextInt();
        

        int [] arr = new int[n];
        System.out.println("Enter " + n + " integer numbers :");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean[] visited = new boolean[n];
        System.out.println("The unique elements in the array are :");
        for(int i = 0; i < n; i++){
            if(visited[i]){
                continue;
            }
            int count = 1;
            for(int a = i + 1; a < n; a++){
                if (arr[i] == arr[a]){
                    visited[a] = true;
                    count++;
                }
            }
             System.out.println(arr[i] + " - " + count + " times");

        }
        sc.close();
    }
}
    

