//2119. A Number After a Double Reversal
//For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not
//retained.
//Input: num = 526
//Output: true
//Explanation: Reverse num to get 625, then reverse 625 to get 526, which equals num.
import java.util.*;
public class Double_Reversal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int reverse=0, reverse2=0;
        if(num==0){
            System.out.println("true");
        }
        int temp=num;

        int last_digit=temp%10;
        while(last_digit==0){
            temp/=10;
            last_digit=temp%10;
        }
        while(temp>0){
            last_digit= temp%10;
            temp/=10;
            reverse=reverse*10 + last_digit;
        }
        while(reverse>0){
            last_digit= reverse%10;
            reverse/=10;
            reverse2= reverse2*10 + last_digit;
        }

        if(reverse2==num){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}