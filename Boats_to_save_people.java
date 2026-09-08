//881. Boats to Save People
//Example 1:
// Input: people = [1,2], limit = 3
// Output: 1
// Explanation: 1 boat (1, 2)  
// Example 2:
// Input: people = [3,2,2,1], limit = 3
// Output: 3
// Explanation: 3 boats (1, 2), (2) and (3)
import java.util.*;
public class Boats_to_save_people {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int people[]= new int[n];
        for(int i=0; i<n; i++){
            people[i]= sc.nextInt();
        }
        int limit= sc.nextInt();
        int count=0;
        Arrays.sort(people);
        int left=0;
        int right= people.length-1;
        while(left<=right){
            if((people[left]+people[right])<=limit){
                count++;
                left++;
                right--;
            }
            else{
                count++;
                right--;
            }
        }
        System.out.println(count);
    }
}
