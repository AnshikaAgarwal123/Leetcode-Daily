// 75. Sort Colors
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
import java.util.*;
public class Sort_colors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int nums[]= new int[x];
        int n= nums.length;
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]= nums[j];
                    nums[j]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
