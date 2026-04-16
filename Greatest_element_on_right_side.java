//1299. Replace Elements with Greatest Element on Right Side
//Input: arr = [17,18,5,4,6,1]
// Output: [18,6,6,6,1,-1]
// Explanation: 
// - index 0 --> the greatest element to the right of index 0 is index 1 (18).
// - index 1 --> the greatest element to the right of index 1 is index 4 (6).
// - index 2 --> the greatest element to the right of index 2 is index 4 (6).
// - index 3 --> the greatest element to the right of index 3 is index 4 (6).
// - index 4 --> the greatest element to the right of index 4 is index 5 (1).
// - index 5 --> there are no elements to the right of index 5, so we put -1.
import java.util.*;
public class Greatest_element_on_right_side {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int max=-1;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]>max){
                int temp=arr[i];
                arr[i]=max;
                max=temp;
                
            }
            else{
                arr[i]=max;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
