import java.util.*;
public class diff_element_digit_sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int element_sum=0;
        int digitsum=0;
        for(int i=0; i<nums.length; i++){
            element_sum+=nums[i];
            int no= nums[i];
            while(no>0){
                digitsum+=no%10;
                no/=10;
            }
        }
        int result= digitsum-element_sum;
        if(result<0){
            System.out.println(-result);
        }
        else
        System.out.println(result);
    }
}