//2185. Counting Words With a Given Prefix
//Input: words = ["pay","attention","practice","attend"], pref = "at"
// Output: 2
// Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
import java.util.*;
class Counting_words_with_given_prefix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String pref= sc.next();
        int n= sc.nextInt();
        String words[]= new String[n];
        for(int i=0; i<n; i++){
            words[i]= sc.next();
        }
        int length= pref.length();
        int count=0;
        for(int i=0; i<words.length; i++){
            if(words[i].length()>=length){
            String start= words[i].substring(0,length);
            if(pref.equals(start)){
                count++;
            }
            }
        }
        System.out.println(count);
    }
}