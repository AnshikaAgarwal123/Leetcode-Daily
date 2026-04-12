import java.util.*;
public class Decompress_Run_Length_Encoded_List {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int array[]= new int[100000];
        int x=0;
        for(int i=0; i<nums.length; i=i+2){
            int freq= nums[i];
            int val= nums[i+1];
            for(int j=0; j<freq; j++){
                array[x]= val;
                x++;
            }
        }
        int array2[]= new int[x];
        for(int i=0; i<x; i++){
            array2[i]= array[i];
        }
        System.out.println(Arrays.toString(array2));
    }
}