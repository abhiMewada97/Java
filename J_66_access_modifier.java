package abhishek.gym;

class C1 extends gym{

    public void meth1(){
        
        System.out.println(x);  // public 
        System.out.println(y);  // protected
        // System.out.println(z);  // default
        // System.out.println(a);  // private
    }
}
public class J_66_access_modifier {

    public static void main(String[] args) {
        
        C1 c = new C1();
        c.meth1();
    }
}
