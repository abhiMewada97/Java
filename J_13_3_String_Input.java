import java.util.Scanner;
public class J_13_3_String_Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        String st = sc.next();     //it will take only one word
        String st = sc.nextLine();  //  It will take full line
        System.out.println(st);
    }
}
