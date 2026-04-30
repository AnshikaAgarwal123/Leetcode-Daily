import java.util.*;
public class Max_no_of_words_in_sentence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.next();
        String sentences[]= new String[n];
        for(int i=0; i<n; i++){
            sentences[i]= sc.nextLine();
        }
        int max_count=0, count=0;
        for(int i=0; i<sentences.length; i++){
            String array[]= sentences[i].split(" ");
            count=array.length;
            if(count>max_count){
                max_count= count;
            }
        }
        System.out.println(max_count);
    }
}

