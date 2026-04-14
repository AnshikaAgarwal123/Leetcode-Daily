//1464. Maximum Product of Two Elements in an Array
// Input: nums = [3,4,5,2]
// Output: 12 
// Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value,
// that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
import java.util.*;
public class Max_product_of_two_elements_in_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int max= Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(((nums[i]-1)*(nums[j]-1))>max){
                    max= (nums[i]-1)*(nums[j]-1);
                }
            }
        }
        System.out.println(max);
    }
}

