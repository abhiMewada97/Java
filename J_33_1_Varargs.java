public class J_33_1_Varargs{

    // static int sum(int a){
    //     int result ;
    //     result = a;
    //     return result;
    // }

    // static int sum(int a, int b){
    //     int result ;
    //     result = a+b;
    //     return result;
    // }

    static int sum(int ...arr){  //we have not written many function for overloading
        int result = 0;
        for(int element : arr){
            result +=element;
        }
        return result;
    }

        public static void main(String [] args){
        System.out.println("The sum is "+sum());
        System.out.println("The sum is "+sum(1));
        System.out.println("The sum is "+sum(1,2));
        System.out.println("The sum is "+sum(1,2,5));
        System.out.println("The sum is "+sum(5,14,7,2));
    }
}