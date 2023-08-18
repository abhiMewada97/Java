import java.util.Scanner;

public class J_29_2_find_num_in_array {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");

        n = sc.nextInt();

        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {

            array[i] = sc.nextInt();
        }

        System.out.println("Enter the number which do want to find ");

        int find = sc.nextInt();
        boolean isInArray = false;

        for (int i = 0; i < n; i++) {
            if(array[i] == find){
                System.out.println("at index "+i);
                isInArray = false;
                break;
            }
        }
        if(isInArray){
            System.out.println("Not find");
        }
    }
    
}
