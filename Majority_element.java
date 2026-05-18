import java.util.Arrays;
import java.util.*;
public class Majority_element {
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        if(nums.length==1){
            System.out.println(nums[0]);
            return;
        }
        Arrays.sort(nums);
        int max=0;
        int count=0;
        int element=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]== nums[i]){
                count++;
            }
            else{
                count=0;
            }
            if(count>max){
                max=count;
                element=nums[i];
            }
        }
        System.out.println(element);
    }
}
