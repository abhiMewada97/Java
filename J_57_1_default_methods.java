// class J_57_1_default_methods {

//     J_57_1_default_methods
//     public static void main(String []args) {

//     }
// }

interface Animal{
    // Default method
    default void say(){
        System.out.println("Hello, this is default method");
    }

    // Abstract method
    void bark();
}

public class J_57_1_default_methods implements Animal{

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }

    public static void main(String[] args) {
        J_57_1_default_methods  obj1 = new J_57_1_default_methods ();
        obj1.bark();
        obj1.say();

    }


}