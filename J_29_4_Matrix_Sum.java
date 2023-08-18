import java.util.Scanner;

public class J_29_4_Matrix_Sum {

    public static void main(String[] args) {
        
        int [][]mat1 = {{2, 12, 23},{23,43,3}};

        int [][]mat2 = {{4,6,2},{7,8,1}};
        int [][]result = {{0,0,0},{0,0,0}};
        
        for (int i = 0; i < mat1.length ; i++) {
            for(int j=0; j<mat1[i].length; j++){

                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for (int i = 0; i < mat1.length ; i++) {
            for(int j=0; j<mat1[i].length; j++){

                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }
     }
}