//74. Search a 2D Matrix
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true
public class Search_a_2D_matrix {
    public static void main(String[] args) {
        // Sample input
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;

        // Binary search logic
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = (m * n) - 1;
        boolean found = false;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / n;
            int column = mid % n;

            if (matrix[row][column] == target) {
                found = true;
                break;
            } else if (matrix[row][column] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Target found: " + found);
    }
}
