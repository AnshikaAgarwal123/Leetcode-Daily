//Leetcode-189. Rotate Array
//Example:
// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
import java.util.*;
class Rotate_array1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        k= k%nums.length;
        for(int i=0; i<n/2; i++){
            int temp= nums[i];
            nums[i]=nums[n-1-i];
            nums[n-1-i]= temp;
        }
        for(int i=0; i<k/2; i++){
            int temp= nums[i];
            nums[i]=nums[k-1-i];
            nums[k-1-i]= temp;
        }
        int left=k;
        int right= n-1;
        while(left<right){
            int temp= nums[left];
            nums[left]= nums[right];
            nums[right]= temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(nums));
        }
}