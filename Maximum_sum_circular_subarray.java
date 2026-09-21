//918. Maximum Sum Circular Subarray
//Example 1:
// Input: nums = [1,-2,3,-2]
// Output: 3
// Explanation: Subarray [3] has maximum sum 3.
import java.util.Scanner;
public class Maximum_sum_circular_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of elements
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = 0, maxsum = Integer.MIN_VALUE, minsum = Integer.MAX_VALUE, total = 0;

        // Linear subarray sum
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            sum += nums[i];
            maxsum = Math.max(sum, maxsum);
            if (sum < 0) {
                sum = 0;
            }
        }

        sum = 0;
        // Circular subarray sum
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            minsum = Math.min(minsum, sum);
            if (sum > 0) {
                sum = 0;
            }
        }

        // Print answer
        if (maxsum < 0) {
            System.out.println(maxsum);
        } else {
            int circularsum = total - minsum;
            int ans = Math.max(maxsum, circularsum);
            System.out.println(ans);
        }

        sc.close();
    }
}
