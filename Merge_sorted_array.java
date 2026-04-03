import java.util.*;
public class Merge_sorted_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int nums1[]= new int[m+n];
        int nums2[]= new int[n];
        for(int i=0; i<m; i++){
            nums1[i]= sc.nextInt();
        }
        for(int i=0; i<n; i++){
            nums2[i]= sc.nextInt();
        }
        int x=0;
        for(int i=m; i<m+n; i++){
            if(nums1[i]==0){
            nums1[i]=nums2[x];
            x++;
            }
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}