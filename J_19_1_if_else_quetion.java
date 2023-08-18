import java.util.Scanner;

public class J_19_1_if_else_quetion {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int s = sc.nextInt();
            int d = sc.nextInt();
            float total = (a + s + d) / 3.0f;
            if (33 <= a && 33<=s && 33<=d && 40<=total) {
                System.out.println("You are pass : "+total+" Total marks : "+a+" "+s+" "+d);
            }
            else {
                System.out.println("You are fail : "+total+" Total marks : "+a+" "+s+" "+d);
            }
        }

}
