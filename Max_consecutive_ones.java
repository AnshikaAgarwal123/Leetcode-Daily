// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s.
// The maximum number of consecutive 1s is 3.
import java.util.*;
public class Max_consecutive_ones {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int count=1, maxcount=0;
        if(nums.length==1){
            if(nums[0]==1)
            System.out.println("1");
            else
            System.out.println("0");
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                maxcount=1;
            }
        }
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==1 && nums[i+1]==1){
                    count++;
                    if(count>maxcount)
                    maxcount= count;
            }
            else{
                count=1;
            }
        }
        System.out.println(maxcount);
    }
}
