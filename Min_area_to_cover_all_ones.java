//3195. Find the Minimum Area to Cover All Ones I
// Example 1:
// Input: grid = [[0,1,0],[1,0,1]]
// Output: 6
// The smallest rectangle has a height of 2 and a width of 3, so it has an area of 2 * 3 = 6.
public class Min_area_to_cover_all_ones {
    public static void main(String[] args) {
        // Sample input grid
        int[][] grid = {
            {0, 1, 0},
            {1, 0, 1}
        };

        int minrow = Integer.MAX_VALUE;
        int mincolumn = Integer.MAX_VALUE;
        int maxrow = Integer.MIN_VALUE;
        int maxcolumn = Integer.MIN_VALUE;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    minrow = Math.min(minrow, i);
                    mincolumn = Math.min(mincolumn, j);
                    maxrow = Math.max(maxrow, i);
                    maxcolumn = Math.max(maxcolumn, j);
                }
            }
        }

        int l = maxrow - minrow + 1;
        int b = maxcolumn - mincolumn + 1;
        int ans = l * b;

        System.out.println("Minimum Area: " + ans);
    }
}