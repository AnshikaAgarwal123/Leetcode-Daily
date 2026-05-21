import java.util.*;
public class Rotate_image{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int matrix[][]= new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        
        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix[i].length; j++){
                    int temp= matrix[i][j];
                    matrix[i][j]= matrix[j][i];
                    matrix[j][i]= temp;
            }
        }
        //This will transpose the matrix in place 

        for(int i=0; i<matrix.length; i++){
            int left=0, right=matrix.length-1;
            while(left<right){
                int temp= matrix[i][left];
                matrix[i][left]= matrix[i][right];
                matrix[i][right]= temp;
                left++;
                right--;
            }
        }
        //This will change the left row to the right row.

        System.out.println(Arrays.deepToString(matrix));
    }
}