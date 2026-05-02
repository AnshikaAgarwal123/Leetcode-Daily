import java.util.*;
public class Jewels_and_stones {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String jewels= sc.next();
        String stones= sc.next();
        int count=0;
        for(int i=0; i<jewels.length(); i++){
            char c= jewels.charAt(i);
            for(int j=0; j<stones.length(); j++){
                if(stones.charAt(j)==c){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}