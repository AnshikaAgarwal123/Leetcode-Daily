import java.util.*;
public class two_string_arrays_equivalent_check {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        String word1[]= new String[m];
        for(int i=0; i<m; i++){
            word1[i]= sc.next();
        }
        int n=sc.nextInt();
        String word2[]= new String[n];
        for(int i=0; i<n; i++){
            word2[i]= sc.next();
        }
        String s1= "";
        String s2= "";
        int max= Math.max(word1.length, word2.length);
        for(int i=0; i<max; i++){
            if(i<word1.length)
            s1+=word1[i];
            if(i<word2.length)
            s2+=word2[i];
        }
        if(s1.equals(s2)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}