import java.util.*;
public class Valid_anagram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String t= sc.nextLine();
        s.toLowerCase();
        t.toLowerCase();
        if(s.length()!=t.length()){
            System.out.println("False");
            return;
        }
        for(char ch='a'; ch<='z'; ch++){
            int counts=0, countt=0;
            for(int i=0; i<s.length(); i++){
                if(ch==s.charAt(i)){
                    counts++;
                }
                if(ch==t.charAt(i)){
                    countt++;
                }
            }
            if(countt!=counts){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}

