//Leetcode-219. Contains Duplicate II
//Example 1:
// Input: nums = [1,2,3,1], k = 3
// Output: true
// Example 2:
// Input: nums = [1,0,1,1], k = 1
// Output: true
// Example 3:
// Input: nums = [1,2,3,1,2,3], k = 2
// Output: false
import java.util.*;
class Contains_duplicate2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        HashMap <Integer, Integer> numbers= new HashMap<>();
        int diff=0;
        if(nums.length==1){
            System.out.println("False");
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(numbers.containsKey(nums[i])){
                diff= Math.abs(i- numbers.get(nums[i]));
                numbers.put(nums[i], i);
                if(diff<=k){
                System.out.println("True");
                return;
                }
            }
            numbers.put(nums[i],i);
        }
        System.out.println("False");
        return;
    }
}