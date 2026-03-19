import java.util.*;
public class Richest_Customer_wealth{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int accounts[][]= new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                accounts[i][j]= sc.nextInt();
            }
        }
        int max=0, sum=0;
        for(int i=0; i<accounts.length; i++){
            sum=0;
            for(int j=0; j<accounts[i].length; j++){
                sum+=accounts[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}