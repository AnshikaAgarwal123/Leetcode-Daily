//Leetcode-3. Longest Substring Without Repeating Characters
//Example:
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
import java.util.*;
public class Longest_substring_without_repeating_characters {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        if(s.length()==1){
            System.out.println("1");
            return;
        }
        HashSet <Character> letters= new HashSet<>();
        int max=0;
        int start=0;
        for(int i=0; i<s.length(); i++){
            if(!letters.contains(s.charAt(i))){
                letters.add(s.charAt(i));
                max= Math.max(max, letters.size());
            }
            else if(letters.contains(s.charAt(i))){
                for(int j= start; j<i; j++){
                    if(s.charAt(j)!=s.charAt(i)){
                        letters.remove(s.charAt(j));
                    }
                    else if(s.charAt(j)==s.charAt(i)){
                        start=j+1;
                        break;
                    }  
                }
                letters.add(s.charAt(i));
            }
                
            }
        if(max==0){
            System.out.println(s.length());
            return;
        }
        System.out.println(max);
    }
}

