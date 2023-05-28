
//Count of Matches in Tournament
//Input: n = 7
//Output: 6
//Explanation: Details of the tournament: 
//- 1st Round: Teams = 7, Matches = 3, and 4 teams advance.
//- 2nd Round: Teams = 4, Matches = 2, and 2 teams advance.
//- 3rd Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
//Total number of matches = 3 + 2 + 1 = 6.
 
import java.util.*;
public class leetcode4 {
    static void numberOfMatches(int n) {   
       int sum=0;
        while (n>1){
            if(n%2==0){
                n/=2;
                sum+=n;
            }else{
                n/=2;
                sum+=n++;    ////sum=sum+n+1
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        numberOfMatches(n);
    }
}
    