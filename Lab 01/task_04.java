import java.util.Scanner;
public class task_04 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string in small letters : ");
        String str = sc.nextLine();
        sc.close();

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a'){
                    result.append('z');
                }
                else{
                    result.append((char) (ch - 1));
                }
            }
                else{
                    result.append(ch);
                }
            }
        
        System.out.println("The modified string is : " + result.toString());

    }
    
}
