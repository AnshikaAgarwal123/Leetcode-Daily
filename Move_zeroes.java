//283. Move Zeroes
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
import java.util.*;
public class Move_zeroes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n]; 
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int array[]= new int[nums.length];
        int count=0, x=0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                count++;
            }
            else{
                array[x]=nums[i];
                x++;
            }
        }
        for(int i=0; i<count; i++){
            array[x]= 0;
            x++;
        }
        for(int i=0; i<nums.length; i++){
            nums[i]= array[i];
        }
        System.out.print(Arrays.toString(nums));
    }
}
