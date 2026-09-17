//73. Set Matrix Zeroes
//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
// You must do it in place.
//Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]
import java.util.Arrays;

public class Set_Matrix_zeroes {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };

        boolean row1 = false, col1 = false;

        // Check if first row contains zero
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                row1 = true;
                break;
            }
        }

        // Check if first column contains zero
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                col1 = true;
                break;
            }
        }

        // Use first row and column as flag markers
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set inner elements to zero based on flags
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero out first row if needed
        if (row1) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        // Zero out first column if needed
        if (col1) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

        // Print final matrix
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}