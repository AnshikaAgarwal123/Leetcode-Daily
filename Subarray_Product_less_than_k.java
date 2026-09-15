//713. Subarray Product Less Than K
//Example 1:
// Input: nums = [10,5,2,6], k = 100
// Output: 8
// Explanation: The 8 subarrays that have product less than 100 are:
// [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
// Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
import java.util.Scanner;
public class Subarray_Product_less_than_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();

        // Input array elements
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input k
        int k = sc.nextInt();

        // Sliding window logic
        if (k <= 1) {
            System.out.println(0);
            sc.close();
            return;
        }

        int product = 1, ans = 0, left = 0, right = 0;

        while (right < nums.length) {
            product *= nums[right];

            while (product >= k) {
                product /= nums[left];
                left++;
            }

            ans += (right - left + 1);
            right++;
        }

        System.out.println(ans);

        sc.close();
    }
}
