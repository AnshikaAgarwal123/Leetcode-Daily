//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
import java.util.*;
import java.util.Arrays;
public class running_sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nums[]= new int[5];
        for(int i=0; i<5; i++){
            nums[i]= sc.nextInt();
        }
        int runningSum[]= new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int sum=0;
            for(int j=0; j<=i; j++){
                sum+= nums[j];
            }
            runningSum[i]=sum;
        }
        System.out.println(Arrays.toString(runningSum));
    }
}