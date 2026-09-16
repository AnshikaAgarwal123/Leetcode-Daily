public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        // Sample square matrix
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i]; // Primary diagonal

            // Add secondary diagonal element only if it's not the center element
            if (i != n - 1 - i) {
                sum += mat[i][n - 1 - i];
            }
        }

        System.out.println("Diagonal Sum: " + sum);
    }
}
