import java.util.Arrays;


// matrix multiplication was referred from: https://stackoverflow.com/questions/21547462/how-to-multiply-2-dimensional-arrays-matrix-multiplication
public class arrr {
    
    
     public static void main(String[] args) {
         int[][] A={{2,1,5},{1,9,0},{1,5,9}};
         int[][] B={{9,5,1},{0,9,1},{5,1,2}};
     
        System.out.println(Arrays.deepToString(matrix_multiplication(A,B)));
             }
    public static int[][] matrix_multiplication(int[][] A,int[][] B)

        {
        int [][] result = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) { 
            for (int j = 0; j < B[0].length; j++) { 
                for (int k = 0; k < A[0].length; k++) { 
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
       return result;
}}
