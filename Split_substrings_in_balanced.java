//1221. Split a String in Balanced Strings
//Input: s = "RLRRLLRLRL"
// Output: 4
// Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring 
// contains same number of 'L' and 'R'.
import java.util.*;
class Split_substrings_in_balanced {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int result=0;
        int count_r=0, count_l=0;
        for(int i=0; i<s.length(); i++){
            count_r=0;
            count_l=0;
            if(s.charAt(i)=='R')
            count_r++;
            if(s.charAt(i)=='L')
            count_l++;
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(j)=='L'){
                    count_l++;
                }
                if(s.charAt(j)=='R'){
                    count_r++;
                }
                if(count_r==count_l){
                    result++;
                    i=j-1;
                    continue;
                }
            }
        }
       System.out.println(result);
    }
}