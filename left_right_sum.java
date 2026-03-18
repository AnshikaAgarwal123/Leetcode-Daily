//2574. Left and Right Sum Differences
// Input: nums = [10,4,8,3]
// Output: [15,1,11,22]
// Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
// The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].

import java.util.*;
public class left_right_sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nums[]= new int[4];
        for(int i=0; i<nums.length; i++){
            nums[i]= sc.nextInt();
        }
        int array[]= new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int leftsum=0, rightsum=0;
            for(int j=i; j>=0; j--){
                leftsum+= nums[j];
            }
            for(int j=i; j<nums.length; j++){
                rightsum+=nums[j];
            }

            int diffrence= leftsum-rightsum;
            if(diffrence<0)
            diffrence= diffrence*(-1);

            array[i]= diffrence;
        }

        System.out.println(Arrays.toString(array));
    }
}
