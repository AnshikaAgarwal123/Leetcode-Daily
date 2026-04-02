import java.util.*;
public class Detect_capital {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String word= sc.nextLine();
        int countupper=0, countlower=0;
        for(int i=0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                countupper++;
            }   
            else{
                countlower++;
            }
        }
        if(countupper==0){
            System.out.println("true");
        }
        else if(countupper==word.length()){
            System.out.println("true");
        }
        else if(countupper==1 && Character.isUpperCase(word.charAt(0))){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
