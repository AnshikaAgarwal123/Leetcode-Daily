public class Number_of_occurences {

    static class Solution {
        int countFreq(int[] arr, int target) {
            // lower bound
            int start = 0; 
            int end = arr.length - 1;
            int lower = arr.length;
            
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] >= target) {
                    lower = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            
            // upper bound
            int s = 0; 
            int e = arr.length - 1;
            int upper = arr.length;
            
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[mid] > target) {
                    upper = mid;
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            
            return upper - lower;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1: Target present multiple times
        int[] arr1 = {1, 1, 2, 2, 2, 2, 3};
        int target1 = 2;
        System.out.println("Frequency of " + target1 + ": " + sol.countFreq(arr1, target1)); // Output: 4

        // Test Case 2: Target not present
        int[] arr2 = {1, 2, 3, 4, 5};
        int target2 = 6;
        System.out.println("Frequency of " + target2 + ": " + sol.countFreq(arr2, target2)); // Output: 0
    }
}
