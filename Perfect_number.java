import java.util.*;
public class Perfect_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int sum=0;
        for(int i=1; i<=num/2; i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}