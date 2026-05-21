// Leetcode-151 Reverse Words in a String
//Input: s = "a good   example"
//Output: "example good a"
import java.util.*;
public class Reverse_words_in_String {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String array[]= s.trim().split("\\s+");
        String str="";
        for(int i=array.length-1; i>=0; i--){
            str+=array[i];
            if(i!=0){
            str+=" ";
            }
        }
        System.out.println(str);
    }
}