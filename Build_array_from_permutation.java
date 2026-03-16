import java.util.*;
import java.util.Arrays;
public class Build_array_from_permutation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nums[]= new int[6];
        for(int i=0; i<6; i++){
            nums[i]= sc.nextInt();
        }
        int ans[]= new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i]= nums[nums[i]];
        }

        System.out.println(Arrays.toString(ans));
    }
}
