// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
// - ans = [1,2,1,1,2,1]
import java.util.Arrays;
import java.util.*;
public class Concatenation_of_array {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int nums[]= new int[5];
    for(int i=0; i<5; i++){
        nums[i]= sc.nextInt();
    }
    int n= nums.length;
    int ans[]= new int[2*n];
    for(int i=0; i<n; i++){
        ans[i]=nums[i];
    }
    int x=0;
    for(int i=n; i<2*n; i++){
        ans[i]=nums[x];
        x++;
    }
    System.out.println(Arrays.toString(ans));
    }
}
