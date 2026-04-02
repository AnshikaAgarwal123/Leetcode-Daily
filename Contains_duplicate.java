//217. Contains Duplicate
// Input: nums = [1,2,3,1]
// Output: true
// Explanation:
// The element 1 occurs at the indices 0 and 3.

// Input: nums = [1,2,3,4]
// Output: false
// Explanation:
// All elements are distinct.

import java.util.*;
import java.util.Arrays;
public class Contains_duplicate{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i]= sc.nextInt();
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");
    }
}