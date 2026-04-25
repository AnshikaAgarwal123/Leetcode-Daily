import java.util.*;
public class Transpose_matrix_length {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int n=sc.nextInt();
        int matrix[][]= new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        int matrix2[][]= new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix2[j][i]= matrix[i][j];
            }
        }
        
        System.out.println(Arrays.deepToString(matrix2));
    }
}
