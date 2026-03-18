import java.util.*;
import java.util.Arrays;
public class Employees_target {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int hours[]= new int[5];
        for(int i=0; i<hours.length; i++){
            hours[i]= sc.nextInt();
        }
        int target=sc.nextInt();
        int count=0;
        for(int i=0; i<hours.length; i++){
            if(hours[i]>=target){
                count++;
            }
        }
        System.out.println(count);
    }
}

