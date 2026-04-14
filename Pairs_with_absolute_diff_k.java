import java.util.*;
public class Pairs_with_absolute_diff_k {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }

        int count=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int diff= nums[i]-nums[j];
                int diff1= Math.abs(diff);
                if(diff1==k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
