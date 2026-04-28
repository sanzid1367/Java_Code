import java.util.Scanner;
public class task_01 {
    
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        int sum = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i <10; i++){
            int num = myobj.nextInt();

            if(num>0 && num%2==1){
                sum += num;
                count++;

                if(num > max){
                    max = num;
                }
                if(num < min){
                    min = num;
                }

            }
        }
        myobj.close();
        double avg = (double) sum / count;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
