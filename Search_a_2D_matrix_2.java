//240. Search a 2D Matrix II
//Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
// Output: true
public class Search_a_2D_matrix_2 {
    public static void main(String[] args) {
        int[][] matrix = {
            { 1,  4,  7, 11, 15 },
            { 2,  5,  8, 12, 19 },
            { 3,  6,  9, 16, 22 },
            { 10, 13, 14, 17, 24 },
            { 18, 21, 23, 26, 30 }
        };
        int target = 5;

        int row = 0;
        int column = matrix[0].length - 1;
        boolean found = false;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                found = true;
                break;
            } else if (matrix[row][column] > target) {
                column--;
            } else {
                row++;
            }
        }

        System.out.println("Found: " + found);
    }
}
