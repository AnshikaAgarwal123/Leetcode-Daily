//915. Partition Array into Disjoint Intervals
// Example 1:
// Input: nums = [5,0,3,8,6]
// Output: 3
// Explanation: left = [5,0,3], right = [8,6]
import java.util.*;
public class Partition_Array_into_Disjoint_Intervals {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int leftmax[]= new int[n];
        int rightmin[]= new int[n];
        leftmax[0]= nums[0];
        for(int i=1; i<n; i++){
            leftmax[i]= Math.max(leftmax[i-1], nums[i]);
        }
        rightmin[n-1]= nums[n-1];
        for(int i=n-2; i>=0; i--){
            rightmin[i]= Math.min(rightmin[i+1], nums[i]);
        }
        for(int i=1; i<n; i++){
            if(leftmax[i-1]<=rightmin[i]){
                System.out.println(i);
                return;
            }
        }
    }
}
