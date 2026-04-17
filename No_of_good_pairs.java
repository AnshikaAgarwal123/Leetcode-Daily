//3162. Find the Number of Good Pairs I
//Input: nums1 = [1,3,4], nums2 = [1,3,4], k = 1
// Output: 5
// Explanation:
// The 5 good pairs are (0, 0), (1, 0), (1, 1), (2, 0), and (2, 2).
import java.util.*;
public class No_of_good_pairs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        int n= sc.nextInt();
        int nums1[]= new int[n];
        for(int i=0; i<n; i++){
            nums1[i]= sc.nextInt();
        }
        int nums2[]= new int[n];
        for(int i=0; i<n; i++){
            nums2[i]= sc.nextInt();
        }
        int count=0;
       for(int i=0; i<nums1.length; i++){
        for(int j=0; j<nums2.length; j++){
            if(nums1[i]%(nums2[j]*k)==0){
                count++;
            }
        }
       } 
       System.out.println(count);
    }
}
