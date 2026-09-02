//238. Product of Array Except Self
// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]
import java.util.*;
public class Product_of_array_except_self {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int nums[]= new int[x];
        int n= nums.length;
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int answer[]= new int[n];
        int prefix[]= new int[n];
        int suffix[]= new int[n];
        prefix[0]= 1;
        for(int i=1; i<n; i++){
            prefix[i]= prefix[i-1]*nums[i-1];
        }
        suffix[n-1]= 1;
        for(int i=n-2; i>=0; i--){
            suffix[i]= suffix[i+1]*nums[i+1];
        }
        for(int i=0; i<n; i++){
            answer[i]= prefix[i]*suffix[i];
        }
        System.out.println(Arrays.toString(answer));
    }
}
