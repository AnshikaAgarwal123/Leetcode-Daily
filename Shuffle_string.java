//1528. Shuffle String
//Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
// Output: "leetcode"
// Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
import java.util.*;
public class Shuffle_string {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int n= sc.nextInt();
        int indices[]= new int[n];
        for(int i=0; i<n; i++){
            indices[i]= sc.nextInt();
        }
        String s1= "";
        for(int i=0; i<indices.length; i++){
            for(int j=0; j<indices.length; j++){
                if(indices[j]==i){
                    s1+= s.charAt(j);
                    break;
                }
            }
        }
        System.out.println(s1);
    }
}
