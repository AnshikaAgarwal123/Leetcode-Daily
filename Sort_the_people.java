//2418. Sort the People
//Input: names = ["Mary","John","Emma"], heights = [180,165,170]
// Output: ["Mary","Emma","John"]
// Explanation: Mary is the tallest, followed by Emma and John.
import java.util.*;
class Sort_the_people {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String names[]= new String[n];
        int heights[]= new int[n];
        for(int i=0; i<n; i++){
            names[i]= sc.next();
            heights[i]= sc.nextInt();
        }
        for(int j=0; j<names.length-1; j++){
        for(int i=0; i<names.length-j-1; i++){
            if(heights[i]<heights[i+1]){
                int temp= heights[i];
                String tem= names[i];
                heights[i]= heights[i+1];
                names[i]= names[i+1];
                heights[i+1]= temp;
                names[i+1]= tem;
            }
        }
        }
        System.out.println(Arrays.toString(names));
    }
}