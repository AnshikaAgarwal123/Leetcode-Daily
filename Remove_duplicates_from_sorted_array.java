//26. Remove Duplicates from Sorted Array
//Example:
// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).
import java.util.*;
public class Remove_duplicates_from_sorted_array{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        if(nums.length==1){
            System.out.println("1");
            return;
        }
        int pointer=1, count=1;
        nums[0]=nums[0];
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]!=nums[i+1]){
                nums[pointer]=nums[i+1];
                pointer++;
                count++;
            }
        }
        System.out.println(count);
}
}