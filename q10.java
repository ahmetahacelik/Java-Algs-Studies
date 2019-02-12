import java.util.Arrays;

// The transpose part was referred from: https://stackoverflow.com/questions/15449711/transpose-double-matrix-with-a-java-function/15497288

public class q10 {
    
    public static void main(String[] args) {
        int matrix[][]={{2,1,5},{1,9,0},{1,5,9}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
    
    
    }
    
    
    
    
    private static int[][] transpose(int[][] matrix) {
        int[][] matrix2 = new int[matrix[0].length][matrix.length];
            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < matrix[0].length; j++)
                    matrix2[j][i] = matrix[i][j];
            return (matrix2);
}}
