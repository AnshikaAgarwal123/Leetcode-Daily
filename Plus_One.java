//66. Plus One
//Example :
// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].
//Example 2:
// Input: digits = [9]
// Output: [1,0]
// Explanation: The array represents the integer 9.
// Incrementing by one gives 9 + 1 = 10.
// Thus, the result should be [1,0].
import java.util.*;
class Plus_One {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int digits[]= new int[n];
        for(int i=0; i<n; i++){
            digits[i]= sc.nextInt();
        }
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return;
            }
            else if(digits[i]==9){
                digits[i]=0;
            }
        }
        int array[]= new int[digits.length+1];
        array[0]= 1;
        System.out.println(Arrays.toString(array));
    }
}