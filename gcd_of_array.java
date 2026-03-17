import java.util.*;
import java.util.Arrays;
public class gcd_of_array {
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nums[]= new int[5];
        for(int i=0; i<5; i++){
            nums[i]= sc.nextInt();
        }
        int max=0, min= 1001, gcd=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min= nums[i];
            }
        }
        for(int i=1; i<=max; i++){
            if(max%i==0 && min%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
}
