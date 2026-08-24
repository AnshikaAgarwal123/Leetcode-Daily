//1822. Sign of the Product of an Array
//1 if x is positive.
// -1 if x is negative.
// 0 if x is equal to 0.
// Example 1:
// Input: nums = [-1,-2,-3,-4,3,2,1]
// Output: 1
// Explanation: The product of all values in the array is 144, and signFunc(144) = 1
import java.util.*;
public class Sign_of_product_of_an_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int sign=1;
        for(int num: nums){
            if(num<0){
                sign*=-1;
            }
            else if(num>0){
                sign*=1;
            }
            else 
                sign=0;
        }
        System.out.println(sign);
    }
}
