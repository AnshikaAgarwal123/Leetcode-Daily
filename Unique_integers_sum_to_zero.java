//1304. Find N Unique Integers Sum up to Zero
//Input: n = 5
// Output: [-7,-1,1,3,4]
// Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
import java.util.*;
public class Unique_integers_sum_to_zero {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int array[]= new int[n];
        if(n%2==0){
            int y=1;
            for(int i=0; i<n/2; i++){
                array[i]= y;
                y++;
            }
            int x=1;
            for(int i=n/2; i<n; i++){
                array[i]= -x;
                x++;
            }
        }
        else{
            array[0]=0;
            for(int i=1; i<=n/2; i++){
                array[i]= i;
            }
            int x=1;
            for(int i=n/2+1; i<n; i++){
                array[i]= -x;
                x++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
