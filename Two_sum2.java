import java.util.*;
public class Two_sum2 {
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int numbers[]= new int[n];
        for(int i=0; i<n; i++){
            numbers[i]= sc.nextInt();
        }
        System.out.println("Enter target");
        int target= sc.nextInt();
        HashMap <Integer, Integer> nums= new HashMap<>();
        int result[]= new int[2];
        for(int i=0; i<numbers.length; i++){
            nums.put(numbers[i], i);
        }
        for(int i=0; i<numbers.length; i++){
            int num2= target-numbers[i];
            if(nums.containsKey(num2)){
                result[0]=i+1;
                result[1]= nums.get(num2)+1;
                break;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
