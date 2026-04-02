//1089. Duplicate Zeros
// Input: arr = [1,0,2,3,0,4,5,0]
// Output: [1,0,0,2,3,0,0,4]
// Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
import java.util.*;
public class Duplicate_zeroes {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int arr[]= new int[x];
        int n= arr.length;
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                for(int j=n-1; j>i; j--){
                    arr[j]= arr[j-1];
                }
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}