import java.util.*;
import java.util.Arrays;
public class Shuffle_array{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter half the size of array");
        int n= sc.nextInt();
        int nums[]= new int[2*n];
        System.out.println("Enter elements of array");
        for(int i=0; i<2*n; i++){
            nums[i]= sc.nextInt();
        }
        int arr1[]= new int[n];
        int arr2[]= new int[n];
        int arrf[]= new int[2*n];
        for(int i=0; i<n; i++){
            arr1[i]= nums[i];
        }

        int x=0;
        for(int i=n; i<2*n; i++){
            arr2[x]= nums[i];
            x++;
        }

        int z=1, y=0, s=0;
        for(int i=0; i<2*n; i++){
            if(z%2!=0){
                arrf[i]= arr1[y];
                y++;
            }
            if(z%2==0){
                arrf[i]= arr2[s];
                s++;
            }
            z++;
        }
        System.out.println(Arrays.toString(arrf));
    }
}