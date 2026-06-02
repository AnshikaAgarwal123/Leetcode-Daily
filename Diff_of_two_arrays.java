//Leetcode-2215. Find the Difference of Two Arrays
//Example 1:
// Input: nums1 = [1,2,3], nums2 = [2,4,6]
// Output: [[1,3],[4,6]]
// Explanation:
// For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
// For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums1. Therefore, answer[1] = [4,6].

import java.util.*;

public class Diff_of_two_arrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int nums1[]= new int[n];
        for(int i=0; i<n; i++){
            nums1[i]= sc.nextInt();
        }
        int m= sc.nextInt();
        int nums2[]= new int[m];
        for(int i=0; i<m; i++){
            nums2[i]= sc.nextInt();
        }
        HashSet <Integer> set1= new HashSet<>();
        HashSet <Integer> set2= new HashSet<>();
        for(int num: nums1) set1.add(num);
        for(int num: nums2) set2.add(num);

        List<List<Integer>> answer= new ArrayList<>();

        List <Integer> folder1= new ArrayList<>();
        for(int num: nums1){
            if(!set2.contains(num) && !folder1.contains(num)){
                folder1.add(num);
            }
        }
        List <Integer> folder2= new ArrayList<>();
        for(int num: nums2){
            if(!set1.contains(num) && !folder2.contains(num)){
                folder2.add(num);
            }
        }
        System.out.println(Arrays.asList(folder1, folder2));
    }
}
