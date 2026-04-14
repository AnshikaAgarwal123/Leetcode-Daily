//2586. Count the Number of Vowel Strings in Range
//Input: words = ["are","amy","u"], left = 0, right = 2
// Output: 2
// Explanation: 
// - "are" is a vowel string because it starts with 'a' and ends with 'e'.
// - "amy" is not a vowel string because it does not end with a vowel.
// - "u" is a vowel string because it starts with 'u' and ends with 'u'.
// The number of vowel strings in the mentioned range is 2.
import java.util.*;
public class Count_no_of_vowel_string_in_range {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String words[]= new String[n];
        for(int i=0; i<n; i++){
            words[i]= sc.next();
        }
        int left= sc.nextInt();
        int right= sc.nextInt();
        int count=0;
        for(int i=left; i<=right; i++){
            String word= words[i];
            word= word.toLowerCase();
            if(word.charAt(0)=='a' || word.charAt(0)=='e' || word.charAt(0)=='i' || word.charAt(0)=='o' || word.charAt(0)=='u'){
                if(word.charAt(word.length()-1)=='a' || word.charAt(word.length()-1)=='e' || word.charAt(word.length()-1)=='i' || word.charAt(word.length()-1)=='o' || word.charAt(word.length()-1)=='u'){
                    count++;
            }
        }
    }
    System.out.println(count);
}
}