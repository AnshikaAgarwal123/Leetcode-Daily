import java.util.*;
public class Pangram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String sentence= sc.nextLine();
        sentence= sentence.toLowerCase();
        for(char ch='a'; ch<='z'; ch++){
            boolean panagram=false;
            for(int i=0; i<sentence.length(); i++){
                if(sentence.charAt(i)==ch){
                    panagram=true;
                }
            }
            if(panagram==false){
            System.out.println("false");
            return;
            }
        }
        System.out.println("true");
    }
}
