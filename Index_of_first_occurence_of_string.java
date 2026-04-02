//28. Find the Index of the First Occurrence in a String
// Example:
// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
import java.util.*;

public class Index_of_first_occurence_of_string {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String  haystack= sc.nextLine();
        String  needle= sc.nextLine();
        int lofneedle= needle.length();
        for(int i=0; i<haystack.length(); i++){
            if(i+lofneedle<=haystack.length()){
            String str= haystack.substring(i, i+lofneedle);
            if(str.equals(needle)){
            System.out.println(i);
            return;
            }
        }
        }
        System.out.println("-1");
    }
}
