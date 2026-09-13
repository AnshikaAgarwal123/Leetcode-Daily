//152. Maximum Product Subarray
// Example:
// Input: nums = [-2,0,-1]
// Output: 0
// Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
public class Maximum_product_subarray {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};

        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (prefix == 0) {
                prefix = 1;
            }
            if (suffix == 0) {
                suffix = 1;
            }

            prefix *= nums[i];
            suffix *= nums[nums.length - i - 1];

            ans = Math.max(ans, Math.max(prefix, suffix));
        }

        System.out.println("Maximum Product: " + ans);
    }
}
    