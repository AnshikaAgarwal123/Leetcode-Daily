import java.util.*;
public class Valid_Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        s= s.toLowerCase();
        String s1= "";
        for(int i=0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                s1+= s.charAt(i);
            }
        }
        String reverse="";
        for(int i=s1.length()-1; i>=0; i--){
            reverse+=s1.charAt(i);
        }
        if(reverse.equals(s1)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
