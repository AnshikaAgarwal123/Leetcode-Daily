import java.util.*;
public class Find_peak_element {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i]= sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max= nums[i];
                index= i;
            }
        }
        System.out.println(index);
    }
}
