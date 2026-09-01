//1991. Find the Middle Index in Array
//Example 1:
// Input: nums = [2,3,-1,8,4]
// Output: 3
// Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
// The sum of the numbers after index 3 is: 4 = 4
import java.util.*;
public class Middle_index_of_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int leftsum[]= new int[n];
        int rightsum[]= new int[n];
        leftsum[0]= 0;
        for(int i=1; i<n; i++){
            leftsum[i]= leftsum[i-1]+nums[i-1];
        }
        rightsum[n-1]=0;
        for(int i=n-2; i>=0; i--){
            rightsum[i]= rightsum[i+1]+nums[i+1];
        }
        for(int i=0; i<n; i++){
            if(leftsum[i]==rightsum[i]){
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
}
