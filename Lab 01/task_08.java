import java.util.Scanner;

public class task_08 {
    /**
     * @param args
     */
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix of N x N : ");
        int n = sc.nextInt();

        int [][] A = new int [n][n];
        System.out.println("Enter the elements of the matrix :");

        for(int i = 0; i < n; i++){
            for(int j = 0; j <n; j++){
                A[i][j] = sc.nextInt();
            }
        }

        boolean isIdentity = true;

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){
                if(i == j){
                    if(A[i][j] != 1){
                        isIdentity = false;
                        break;
                    }
                }
                else{
                    if(A[i][j] != 0){
                        isIdentity = false;
                        break;
                    }
                }               
            }
            
            if(!isIdentity){
                break;
            }
        }
        if(isIdentity){
            System.out.println("The matrix is an Identity Matrix.");
        }
        else{
            System.out.println("The matrix is not an Identity Matrix.");
        }

        sc.close();
    }
    
}
