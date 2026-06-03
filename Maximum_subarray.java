//Leetcode-53. Maximum Subarray
//Example 1:
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.
import java.util.*;
public class Maximum_subarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int maxsum= nums[0];
        int currentsum= nums[0];
        for(int i=1; i<nums.length; i++){
            currentsum= Math.max(currentsum+nums[i], nums[i]);  
            maxsum= Math.max(maxsum, currentsum); 
        }
        System.out.println(maxsum);
    }
}
//we are comparing two adjacent elements and then if its sum is max than the individual element then moving forward.
