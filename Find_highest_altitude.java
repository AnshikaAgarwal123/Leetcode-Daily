import java.util.*;
public class Find_highest_altitude {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int gain[]= new int[n];
        for(int i=0; i<n; i++){
            gain[i]= sc.nextInt();
        }
        int array[]= new int[gain.length+1];
        array[0]=0;
        int sum=0;
        for(int i=1; i<gain.length+1; i++){
            sum+=gain[i-1];
            array[i]= sum;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0; i<gain.length+1; i++){
            if(array[i]>max){
                max=array[i];
            }
        }

        System.out.println(max);
    }
}

