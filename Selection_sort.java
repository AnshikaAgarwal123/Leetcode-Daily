import java.util.*;
public class Selection_sort {
    public static void main(String[] args) {
        int arr[]= {5, 4, 6, 3, 8, 5};
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                int temp= arr[min];
                arr[min]= arr[i];
                arr[i]= temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
