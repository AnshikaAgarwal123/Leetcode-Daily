//Leetcode-16. 3Sum Closest
//Example 1:
// Input: nums = [-1,2,1,-4], target = 1
// Output: 2
// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
import java.util.*;
class threesumclosest {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int target= sc.nextInt();
        Arrays.sort(nums);
        int closestsum= nums[0]+ nums[1]+nums[2];
        for(int i=0; i<nums.length-2; i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int currentsum= nums[i]+nums[left]+nums[right];

                if(Math.abs(currentsum-target)<Math.abs(closestsum-target)){
                    closestsum= currentsum;
                }

                if(currentsum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        System.out.println(closestsum);
    }
}