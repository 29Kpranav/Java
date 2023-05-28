import java.util.*;
import java.util.Scanner;
public class allFactors {
    public static Void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        getFactors();
        }
    void getFactors(int n){
        for(int i=1;i<n;i++){
            if(n%i==0)
            System.out.println(i);
        }
    }
    }

