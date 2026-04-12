import java.util.*;
public class Calculate_delayed_arrival_time {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arrivalTime= sc.nextInt();
        int delayedTime= sc.nextInt();
        int finaltime= arrivalTime+ delayedTime;
        if(finaltime>=24){
            finaltime%=24;
        }
        System.out.println(finaltime);
    }
}
