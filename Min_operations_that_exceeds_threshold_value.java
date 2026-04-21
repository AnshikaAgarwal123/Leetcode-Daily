import java.util.*;
public class Min_operations_that_exceeds_threshold_value {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<k){
                count++;
            }
        }
        System.out.println(count);
    }
}
