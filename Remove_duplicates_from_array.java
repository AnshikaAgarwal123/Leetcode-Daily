import java.util.*;
public class Remove_duplicates_from_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        if(nums.length==1){
                System.out.println("1");
                return;
        }

            int pointer=1, count=1;
            nums[0]=nums[0];
            for(int i=0; i<nums.length-1; i++){
                if(nums[i]!=nums[i+1]){
                    nums[pointer]=nums[i+1];
                    pointer++;
                    count++;
                }
            }
            System.out.println(count);
}
}