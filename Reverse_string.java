import java.util.*;
public class Reverse_string {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String input= sc.nextLine();
        char[] s= input.toCharArray(); //To convert a string to array of characters
       int index= s.length-1;
       for(int i=0; i<s.length/2; i++){
            char temp= s[i];
            s[i]= s[index-i];
            s[index-i]= temp;
       } 
       System.out.println(s);
    }
} 