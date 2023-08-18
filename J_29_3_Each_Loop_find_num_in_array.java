import java.util.Scanner;

public class J_29_3_Each_Loop_find_num_in_array {

    public static void main(String[] args) {

        float sum=0, avg;
        
        float [] array = {2.4f, 2.14f, 23.3f};
        System.out.println("Enter the elements of the array: ");
        
        // for (int i = 0; i < array.length ; i++) {
        //     sum += array[i];
        // }

        for(float element:array){
            sum += element;
        }

        avg = sum/array.length;

        System.out.println(avg);

     }
}
