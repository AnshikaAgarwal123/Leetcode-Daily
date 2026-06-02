//Leetcode-451. Sort Characters By Frequency
//Example 1:
// Input: s = "tree"
// Output: "eert"
// Explanation: 'e' appears twice while 'r' and 't' both appear once.
// So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
import java.util.*;
public class Sort_characters_by_frequency {
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int freq[]= new int[128];
        String answer= "";
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)]++;
        }

        for(int j=0; j<s.length(); j++){
        int index=0;
        int max=0;
        char ch='a';
            for(int i=0; i<freq.length; i++){
                if(freq[i]>max){
                    index=i;
                    max=freq[i];
                    ch= (char)i;
                }
            }
            if(max==0)
            break;
            
            answer+=String.valueOf(ch).repeat(max);
            freq[index]=0;
        }
        System.out.println(answer);
    }
}
