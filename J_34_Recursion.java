import java.util.Scanner;
public class J_34_Recursion {

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String [] args){
        System.out.println("Enter the num ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact = factorial(n);
        System.out.println("Factorial is "+ fact);
        
    }
}