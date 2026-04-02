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
        int product=1, count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                count++;
            }
            else
            product*=nums[i];
        }

        int result=0;
        for(int i=0; i<nums.length; i++){
            if(count==0){
                nums[i]= product/nums[i];
            }
            else if(count==1){
                if(nums[i]==0){
                    nums[i]= product;
                }
                else{
                    nums[i]=0;
                }
            }
            else if(count>1){
                nums[i]=0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}