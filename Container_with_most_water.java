//Leetcode-11. Container With Most Water
//Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
import java.util.*;
public class Container_with_most_water {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int height[]= new int[n];
        for(int i=0; i<n; i++){
            height[i]= sc.nextInt();
        }
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        while(left<right){
            int width= right- left;
            int currentarea= Math.min(height[left], height[right])*width;
            if(currentarea>maxarea){
                maxarea= currentarea;
            }
            if(height[left]<=height[right])
            left++;
            else{
                right--;
            }
        }
        System.out.println(maxarea);
    }
}
