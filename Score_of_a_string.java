//3110. Score of a String
//Example 1:
// Input: s = "hello"
// Output: 13
// Explanation:
// The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111. 
// So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111|
//  = 3 + 7 + 0 + 3 = 13.
import java.util.*;
public class Score_of_a_string {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        int sum=0;
        if(s.length()==1){
            int value= (int) s.charAt(0);
            System.out.println(value);
            return;
        }
        for(int i=1; i<s.length(); i++){
            int value1= (int)s.charAt(i-1);
            int value2= (int)s.charAt(i);
            int result= value1- value2;
            if(result<0){
            result=-result;
        }
            sum+=result;
        }
        
        System.out.println(sum);
    }
}
