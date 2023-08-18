import java.util.Scanner;
public class J_7_3_check_number_integer {
    public static void main(String[] args){
        System.out.println("Enter any thing");
        Scanner sc = new Scanner(System.in);
        boolean bl = sc.hasNextInt();     // check it is integer or not
        System.out.println("It is integer value = "+bl);
    }
}