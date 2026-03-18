import java.util.*;
import java.util.Arrays;
public class Number_Comparison {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nums[]= new int[5];
        for(int i=0; i<nums.length; i++){
            nums[i]= sc.nextInt();
        }
        int array[]= new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int count=0;
            for(int j=0; j<nums.length; j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            array[i]=count;
        }
        System.out.println(Arrays.toString(array));
    }
}