
public class J_29_5_reverse_array {
        public static void main(String[] args) {
            
            int []mat = {1, 2, 3, 4, 5, 6};
            for (int i = 0; i < mat.length ; i++) {
                
                System.out.print(mat[i] + " ");
            }
            System.out.println("");

            int y = mat.length;
            int temp;
                
            int n = Math.floorDiv(mat.length ,2); //Math.floorDiv(mat1.length ,2);
                                        // mat1.length/2  /both are same
            for (int i = 0; i < n ; i++) {

               mat[i] = mat[i] +  mat[y-1-i];
               mat[y-1-i] = mat[i] - mat[y-1-i];
               mat[i] = mat[i] - mat[y-1-i];
            // temp = mat[i];
            // mat[i] = mat[y-1-i];
            // mat[y-1-i] = temp;
            }
    
            for (int i: mat) {
                
                    System.out.print(i + " ");
            }

         }
    }
