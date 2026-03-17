import java.util.*;
public class Happy_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int temp=n, sum1=0, sum=n;
        if(n<10){
            if(n==1 || n==7){
                System.out.println("true");
                return;
            }
            else{
                System.out.println("false");
                return;
            }
        }
        while(sum>=10){
            sum1=0;
            while(temp>0){
            int digit= temp%10;
            temp/=10;
            sum1= sum1 + digit*digit; 
            }
            sum=sum1;
            temp=sum1;
        }
        if(sum==1 || sum==7){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
