//448. Find All Numbers Disappeared in an Array
// Example:
// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]
import java.util.*;
public class Find_all_no_disappeared_in_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        List <Integer> ans= new ArrayList<>();
        HashSet <Integer> numbers= new HashSet<>();
        for(int i=0; i<nums.length; i++){
            numbers.add(nums[i]);
        }

        for(int i=1; i<=nums.length; i++){
            if(!numbers.contains(i)){
                ans.add(i);
            }
        }
        System.out.println(ans);
    }
}
