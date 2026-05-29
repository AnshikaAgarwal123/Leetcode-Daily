//Leetcode-41. First Missing Positive (Hard question)
// Example:
// Input: nums = [1,2,0]
// Output: 3
// Explanation: The numbers in the range [1,2] are all in the array.
// Example 2:
// Input: nums = [3,4,-1,1]
// Output: 2
// Explanation: 1 is in the array but 2 is missing.
// Example 3:
// Input: nums = [7,8,9,11,12]
// Output: 1
// Explanation: The smallest positive integer 1 is missing.
import java.util.*;
public class Find_missing_positive {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i]= sc.nextInt();
        }
        Arrays.sort(nums);
        HashSet <Integer> numbers= new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                numbers.add(nums[i]);
            }
        }
        for(int x=1; x<=nums.length+1; x++ ){
            if(!numbers.contains(x)){
                System.out.println(x);
                return;
            }
        }
    }
}
