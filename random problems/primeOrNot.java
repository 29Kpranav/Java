
import java.util.*;
public class primeOrNot {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i=2;
        while(i<n){
            if(n%i==0){
            System.out.println("No prime");
            break;
            } 
            i++;
            }
            if(i==n)
            System.out.println("Prime");
        }
        
    }

