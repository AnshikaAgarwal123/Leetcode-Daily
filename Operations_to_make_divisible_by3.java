//3190. Find Minimum Operations to Make All Elements Divisible by Three
//Input: nums = [1,2,3,4]
// Output: 3
// Explanation:
// All array elements can be made divisible by 3 using 3 operations:
// Subtract 1 from 1.
// Add 1 to 2.
// Subtract 1 from 4
import java.util.*;
class Operations_to_make_divisible_by3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%3!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}