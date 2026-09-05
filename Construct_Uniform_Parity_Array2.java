//3876. Construct Uniform Parity Array II
// Input: nums1 = [1,4,7]
// Output: true
// Explanation:​​​​​​​​​​​​​​
// Set nums2[0] = nums1[0] = 1.
// Set nums2[1] = nums1[1] - nums1[0] = 4 - 1 = 3.
// Set nums2[2] = nums1[2] = 7.
// nums2 = [1, 3, 7], and all elements are odd. Thus, the answer is true.
import java.util.*;
        public class Construct_Uniform_Parity_Array2{
            public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n= sc.nextInt();
            int nums1[]= new int[n];
            for(int i=0; i<n; i++){
                nums1[i]= sc.nextInt();
            }
            boolean even= true;
            boolean flag=true;
            int smallest= nums1[0];
            if(nums1[0]%2!=0){
                even= false;
            }
            for(int i=0; i<nums1.length; i++){
                if(even){
                    if(nums1[i]%2!=0){
                    flag=false;
                    break;
                    }
                }
                else{
                    if(nums1[i]%2==0){
                        flag=false;
                        break;
                    }
                }
            }
            if(flag==true){
                System.out.println("True");
                return;
            }

            for(int i=0; i<nums1.length; i++){
                if(nums1[i]<smallest){
                    smallest=nums1[i];
                }
            }
            
            if(smallest%2!=0){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
    }
}