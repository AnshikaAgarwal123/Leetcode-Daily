//Leetcode-345. Reverse Vowels of a String
//Example 1:
// Input: s = "IceCreAm"
// Output: "AceCreIm"
// Explanation:
// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
import java.util.*;
class Reverse_vowels_of_a_string {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        char array[]= s.toCharArray();
        int left=0;
        int right= s.length()-1;
        while(left<right){
            boolean lisvowel= false;
            boolean risvowel= false;
            if(array[left]=='a' || array[left]=='e' || array[left]=='i' || array[left]=='o' || array[left]=='u' || array[left]=='A' || array[left]=='E' || array[left]=='I' || array[left]=='O' || array[left]=='U' ){
                lisvowel= true;
            }
            if(array[right]=='a' || array[right]=='e' || array[right]=='i' || array[right]=='o' || array[right]=='u' || array[right]=='A' || array[right]=='E' || array[right]=='I' || array[right]=='O' || array[right]=='U' ){
                risvowel= true;
            }
            if(lisvowel==true && risvowel==true){
                char temp= array[left];
                array[left]= array[right];
                array[right]= temp;
                left++;
                right--;
            }
            if(lisvowel== true && risvowel==false){
                right--;
            }
            else if(risvowel==true && lisvowel==false){
                left++;
            }
            else if(risvowel==false && lisvowel==false){
                left++;
                right--;
            }
        }
        String ans= new String(array);
        System.out.println(ans);
    }
}