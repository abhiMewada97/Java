public class J_33_2_Varargs_at_least_one_value {

    static int sum(int x, int... arr) { // we have not written many function for overloading
        int result = x;
        for (int element : arr) {
            result += element;
        }
        return result;
    }

    public static void main(String[] args) {
        // System.out.println("The sum is " + sum()); //this will give error
        System.out.println("The sum is " + sum(1));
        System.out.println("The sum is " + sum(1, 2));
        System.out.println("The sum is " + sum(1, 2, 5));
        System.out.println("The sum is " + sum(5, 14, 7, 2));
    }
}
