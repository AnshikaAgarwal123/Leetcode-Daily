//2744. Find Maximum Number of String Pairs
//Input: words = ["cd","ac","dc","ca","zz"]
// Output: 2
// Explanation: In this example, we can form 2 pair of strings in the following way:
// - We pair the 0th string with the 2nd string, as the reversed string of word[0] is "dc" and is equal to words[2].
// - We pair the 1st string with the 3rd string, as the reversed string of word[1] is "ca" and is equal to words[3].
// It can be proven that 2 is the maximum number of pairs that can be formed.
// import java.util.*;
public class Max_no_of_string_pairs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String words[]= new String[n];
        for(int i=0; i<words.length; i++){
            words[i]= sc.next();
        }
        int count=0;
        for(int i=0; i<words.length; i++){
            String word= words[i];
            String rev="";
            for(int j=word.length()-1; j>=0; j--){
                rev+= word.charAt(j);
            }
            for(int j=i+1; j<words.length; j++){
                if(words[j].equals(rev)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

