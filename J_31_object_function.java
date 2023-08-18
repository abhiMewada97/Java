public class J_31_object_function {

    int sumOfTwoNum(int n1, int n2){
    int sum = n1 + n2;
    return sum;
    }

    public static void main(String[] args){
        J_31_object_function obj = new J_31_object_function();
        int sumis = obj.sumOfTwoNum(4,6);

        System.out.println(sumis);
    }
}
