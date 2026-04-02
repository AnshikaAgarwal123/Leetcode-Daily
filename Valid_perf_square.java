import java.util.*;
public class Valid_perf_square {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        boolean flag=false;
        if(num==1){
            System.out.println("True");
        }
        else if(num<0){
            System.out.println("false");
        }
        else{
        for(long i=1; i*i<=num; i++){
            if(i*i==num){
                flag=true;
            }
        }
        if(flag==true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    }
}
// Description- in this prob first i faced TLA because i ran the loop from 1 to n/2.
//then when the ran the loop from 1 to i*i<=n then it faced prob in the range of int then finally
//i converted i to long.