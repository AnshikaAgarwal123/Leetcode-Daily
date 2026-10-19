//Leetcode-69. Sqrt(x)
//Input: x = 8
// Output: 2
// Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
public class sqrt {
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        }
        
        int start = 0;
        int end = x / 2;
        int ans = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((long) mid * mid == x) {
                return mid;
            } else if ((long) mid * mid < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Test your implementation locally
        int testValue = 8;
        System.out.println("Square root of " + testValue + " = " + mySqrt(testValue)); // Expected: 2
        
        int testValue2 = 4;
        System.out.println("Square root of " + testValue2 + " = " + mySqrt(testValue2)); // Expected: 2
    }
}