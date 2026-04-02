//34. Find First and Last Position of Element in Sorted Array
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
import java.util.*;
public class First_and_last_position_in_sorted_array{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int target= sc.nextInt();
        int n=sc.nextInt();
        int nums[]= new int[n];
        int array[]= new int[2];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        } 
        int minindex=Integer.MAX_VALUE, maxindex=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                int index=i;
                if(index>maxindex){
                    maxindex=index;
                }
                if(index<minindex){
                    minindex=index;
                }
            }
        }
        if(minindex==Integer.MAX_VALUE)
        minindex=-1;

        if(maxindex==Integer.MIN_VALUE)
        maxindex=-1;

        array[0]= minindex;
        array[1]= maxindex;
        System.out.println(Arrays.toString(array));
    }
}