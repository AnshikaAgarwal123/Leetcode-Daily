//3903. Smallest Stable Index I
//Input: nums = [5,0,1,4], k = 3
// Output: 3
// Explanation:
// At index 0: The maximum in [5] is 5, and the minimum in [5, 0, 1, 4] is 0, so the instability score is 5 - 0 = 5.
// At index 1: The maximum in [5, 0] is 5, and the minimum in [0, 1, 4] is 0, so the instability score is 5 - 0 = 5.
// At index 2: The maximum in [5, 0, 1] is 5, and the minimum in [1, 4] is 1, so the instability score is 5 - 1 = 4.
// At index 3: The maximum in [5, 0, 1, 4] is 5, and the minimum in [4] is 4, so the instability score is 5 - 4 = 1.
// This is the first index with an instability score less than or equal to k = 3. Thus, the answer is 3.
import java.util.*;
    public class Smallest_stable_index1{
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        int max[]= new int[n];
        int min[]= new int[n];
        max[0]= nums[0];
        for(int i=1; i<n; i++){
            max[i]= Math.max(max[i-1], nums[i]);
        }

        min[n-1]= nums[n-1];
        for(int i=n-2; i>=0; i--){
            min[i]= Math.min(nums[i], min[i+1]);
        }

        for(int i=0; i<n; i++){
            if((max[i]-min[i])<=k){
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
}