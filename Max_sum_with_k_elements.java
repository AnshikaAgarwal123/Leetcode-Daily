//2656. Maximum Sum With Exactly K Elements 
//Input: nums = [1,2,3,4,5], k = 3
// Output: 18
// Explanation: We need to choose exactly 3 elements from nums to maximize the sum.
// For the first iteration, we choose 5. Then sum is 5 and nums = [1,2,3,4,6]
// For the second iteration, we choose 6. Then sum is 5 + 6 and nums = [1,2,3,4,7]
// For the third iteration, we choose 7. Then sum is 5 + 6 + 7 = 18 and nums = [1,2,3,4,8]
// So, we will return 18.
// It can be proven, that 18 is the maximum answer that we can achieve.
import java.util.*;
public class Max_sum_with_k_elements {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        int sum=0, max=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max= nums[i];
            }
        }
        for(int i=0; i<k; i++ ){
            sum+=max;
            max++;
        }
        System.out.println(sum);
    }
}
