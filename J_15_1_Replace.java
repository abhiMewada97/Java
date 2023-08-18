
import java.util.Locale;
public class J_15_1_Replace {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String st = sc.next();
//        System.out.println(st.toLowerCase());

//        Replace Space into ___......................
//        String st = "    Abhishek     ";
//        System.out.println(st.replace(" ","_"));

        String letter =" Dear |<name>|, Thanks a lot!";
//        letter.replace("|<name>|","Abhishek");   // it will not replace because it is not initialize
        letter = letter.replace("|<name>|","Abhishek");  //it is initialize
        System.out.println(letter);
    }
}
