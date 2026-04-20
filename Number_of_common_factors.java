import java.util.*;
public class Number_of_common_factors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int min= Math.min(a,b);
        int count=0;
        for(int i=1; i<=min; i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
}