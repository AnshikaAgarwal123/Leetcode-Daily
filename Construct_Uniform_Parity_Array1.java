//3875. Construct Uniform Parity Array I
// Input: nums1 = [2,3]
// Output: true
// Explanation:
// Choose nums2[0] = nums1[0] - nums1[1] = 2 - 3 = -1.
// Choose nums2[1] = nums1[1] = 3.
// nums2 = [-1, 3], and both elements are odd. Thus, the answer is true​​​​​​​.
import java.util.*;
public class Construct_Uniform_Parity_Array1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int array[]= new int[n];
        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        System.out.println(true);
    }
}
