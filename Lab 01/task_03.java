import java.util.Scanner;

public class task_03{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string : ");
        String str1 = scanner.next();

        System.out.println("Enter the second string : ");
        String str2 = scanner.next();
        scanner.close();

        String str3 = str1 + " " + str2;

        int sum = 0;
        for(int i =  0; i<str3.length(); i++){
            char ch = str3.charAt(i);
            sum += (int) ch;
        }
        System.out.println("The sum of the ASCII values of the characters in the string is : " + sum);

        

    }
    

}
