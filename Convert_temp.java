import java.util.*;
import java.util.Arrays;
public class Convert_temp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double celsius= sc.nextDouble();
        double array[]= new double[2];
        double Kelvin= celsius+ 273.15;
        double Fahrenheit= celsius*1.80 +32.00;
        array[0]= Kelvin;
        array[1]= Fahrenheit;
        System.out.println(Arrays.toString(array));
    }
}
