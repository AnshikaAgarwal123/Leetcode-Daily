//81. Search in Rotated Sorted Array II
//Example 1:
// Input: nums = [2,5,6,0,0,1,2], target = 0
// Output: true
import java.util.Scanner;
public class Search_in_rotated_sorted_array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Search logic
        int start = 0, end = n - 1;
        boolean found = false;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                found = true;
                break;
            }

            // Handle duplicates at boundaries
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
                continue;
            }

            // Left half is sorted
            if (nums[mid] >= nums[start]) {
                if (target >= nums[start] && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } 
            // Right half is sorted
            else {
                if (target >= nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        System.out.println("Result: " + found);
        sc.close();
    }
}
