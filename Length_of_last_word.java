//58. Length of Last Word
//Example:
// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.
import java.util.*;
public class Length_of_last_word {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String array[]= s.split(" ");
        String word= array[array.length-1];
        System.out.println(word.length());
    }
}