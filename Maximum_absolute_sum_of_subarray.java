//1749. Maximum Absolute Sum of Any Subarray
// Example 1:
// Input: nums = [1,-3,2,3,-4]
// Output: 5
// Explanation: The subarray [2,3] has absolute sum = abs(2+3) = abs(5) = 5.
public class Maximum_absolute_sum_of_subarray {
    public static void main(String[] args) {
        int[] nums = {1, -3, 2, 3, -4};

        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;

        // Find minimum subarray sum
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < minsum) {
                minsum = sum;
            }
            if (sum > 0) {
                sum = 0;
            }
        }

        sum = 0;

        // Find maximum subarray sum
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxsum) {
                maxsum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        int ans = Math.max(maxsum, Math.abs(minsum));

        System.out.println("Maximum Absolute Sum: " + ans);
    }
}