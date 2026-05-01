import java.util.*;
public class Truncate_sentence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int k= sc.nextInt();
        String array[]= s.split(" ");
        String s1= "";
        for(int i=0; i<k; i++){
            s1+=array[i];
            if(i!=k-1)
            s1+=" ";
        }
        System.out.println(s1);
    }
}
