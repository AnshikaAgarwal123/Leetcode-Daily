//1688. Count of Matches in Tournament
//Input: n = 7
// Output: 6
// Explanation: Details of the tournament: 
// - 1st Round: Teams = 7, Matches = 3, and 4 teams advance.
// - 2nd Round: Teams = 4, Matches = 2, and 2 teams advance.
// - 3rd Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
// Total number of matches = 3 + 2 + 1 = 6.
import java.util.*;
public class Count_of_matches_in_tournament {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int teams=n;
        int matches=0;
        int sum=0;
        while(teams>1){
            if(teams%2==0){
                matches=teams/2;
                teams=teams/2;
            }
            else{
                matches= (teams-1)/2;
                teams=(teams-1)/2 +1;
            }
            sum+=matches;
        }
        System.out.println(sum);
    }
}
