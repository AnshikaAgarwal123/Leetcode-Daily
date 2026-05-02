import java.util.*;
public class Div_and_not_div_sum_diff {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int num2=0, num1=0;
        for(int i=1; i<=n; i++){
            if(i%m==0){
                num2+=i;
            }
            else{
                num1+=i;
            }
        }
        System.out.println(num1-num2);
    }
}