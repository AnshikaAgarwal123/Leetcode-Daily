//852. Peak Index in a Mountain Array
// Example 1:
// Input: arr = [0,1,0]
// Output: 1
import java.util.*;

public class Peak_index_in_a_mountain_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int start=0;
        int end=n-1;
        while(start<end){
            int mid= start+ ((end-start)/2);
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        System.out.println(start);
}
}
