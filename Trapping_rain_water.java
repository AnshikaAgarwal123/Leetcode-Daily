//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
import java.util.*;
public class Trapping_rain_water{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int height[]= new int[n];
        for(int i=0; i<n; i++){
            height[i]= sc.nextInt();
        }
        int answer=0;
        int lmax[]= new int[n];
        int rmax[]= new int[n];
        lmax[0]=height[0];
        rmax[n-1]=height[n-1];
        for(int i=1; i<n; i++){
            lmax[i]=Math.max(lmax[i-1], height[i]);
        }

        for(int i=n-2; i>=0; i--){
            rmax[i]=Math.max(rmax[i+1], height[i]);
        }

        for(int i=0; i<n; i++){
            int water= Math.min(rmax[i], lmax[i])- height[i];
            answer+=water;
        }
        System.out.println(answer);
    }
}