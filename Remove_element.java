import java.util.*;
import java.util.Arrays;
public class Remove_element {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int val= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i]= sc.nextInt();
        }

        int count=0, pointer=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[pointer]=nums[i];
                count++;
                pointer++;
            }
        }
        System.out.println(count);
    }
}
