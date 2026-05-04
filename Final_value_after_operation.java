import java.util.*;
public class Final_value_after_operation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array(It should be less than 4)");
        int n= sc.nextInt();
        String operations[]= new String[n];
        for(int i=0; i<n; i++){
            operations[i]= sc.next();
        }
        int x=0;
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("X++")){
                x++;
            }
            else if(operations[i].equals("X--")){
                x--;
            }
            else if(operations[i].equals("++X")){
                ++x;
            }
            else if(operations[i].equals("--X")){
                --x;
            }
        }
        System.out.println(x);
    }
}