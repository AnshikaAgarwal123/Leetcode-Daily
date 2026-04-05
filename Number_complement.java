import java.util.*;
public class Number_complement{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if(num==0)
        System.out.println("1");

        int result=0, powerof2=1;
        while(num>0){
            int lastbit= num%2;
            if(lastbit==0)
            result+=powerof2;

            num/=2;
            powerof2*=2;
        }
        System.out.println(result);
    }
}