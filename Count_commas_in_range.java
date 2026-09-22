//3870. Count Commas in Range
// Example 1:
// Input: n = 1002
// Output: 3
// Explanation:
// The numbers "1,000", "1,001", and "1,002" each contain one comma, giving a total of 3.
import java.util.Scanner;

public class Count_commas_in_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = n - 999;
        if (ans < 0) {
            System.out.println(0);
        } else {
            System.out.println(ans);
        }
    }
}
