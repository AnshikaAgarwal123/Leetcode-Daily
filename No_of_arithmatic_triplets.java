import java.util.*;
public class No_of_arithmatic_triplets {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int diff= sc.nextInt();

        int count=0;
        for(int i=nums.length-1; i>=0; i--){
            for(int j=i-1; j>=0; j--){
                if(nums[i]-nums[j]==diff){
                    for(int x=j-1; x>=0; x--){
                        if(nums[j]-nums[x]==diff){
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
