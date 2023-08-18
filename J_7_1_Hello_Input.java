import java.util.Scanner;
public class J_7_1_Hello_Input {
    public static void main(String[] args){
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        System.out.println("Hello "+ ch +", Have a good day");
    }
}
