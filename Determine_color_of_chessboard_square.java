import java.util.*;
public class Determine_color_of_chessboard_square {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String coordinates= sc.nextLine();
        if(coordinates.charAt(0)=='a' || coordinates.charAt(0)=='c' || coordinates.charAt(0)=='e' || coordinates.charAt(0)=='g'){
            int num= Character.getNumericValue(coordinates.charAt(1));
            if(num%2==0){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }
        else{
            int num= Character.getNumericValue(coordinates.charAt(1));
        if(num%2==0){
            System.out.println(false);
        }
        else{
            System.out.println(true);
        }
        }
    }
}