
import java.util.*;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int temp=n,sum=0;
        while(n>0){
        int a=n%10;
        sum=sum+a*a*a;
        n=n/10;
        }
        System.out.println(sum);
        if(sum==temp){
            System.out.println("Armstrong no.");
        }else {
            System.out.println("No");
        }

    }
}
