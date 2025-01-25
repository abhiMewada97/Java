import java.util.*;

class MyException extends Exception {
    @Override
    public String toString() {
        return super.toString() + " I am a toString()";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " I am a getMessage()";
    }
}

class J_83_Custom_exception_class {
    public static void main(String []args) {

        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        a = sc.nextInt();
        
        if(a<9) {
            try {
                throw new MyException();
            }
            catch(Exception e) {        
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e);
                e.printStackTrace();  // it shows --> konsa error konsi line me hai
            }
        }
    }
}