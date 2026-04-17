import java.util.*;
public class Max_count_of_pos_and_neg_integer {
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int [n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int countpos=0, countneg=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                countneg++;
            }
            else if(nums[i]>0){
                countpos++;
            }
        }
        int max= Math.max(countpos, countneg);
        System.out.println(max);
    }
}

