public class J_13_2_Output_Type {
    public static void main(String[] args){
        int a = 89;
        float b = 77.454f;
        System.out.println(a +" "+ b );
        System.out.print(a +" "+ b + "\n");
        System.out.printf("%d  %8.3f \n" , a, b);    //%8.3f
        System.out.printf("%d %f \n" , a, b);
        System.out.format("%d %f \n" , a, b);
    }
}