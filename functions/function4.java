import java.util.*;
public class function4 {
    public static void getGcd(int a, int b){
    int  i,gcd=1;
    for(i=1;i<=a && i<=b;i++){
        if(a%i==0 && b%i==0)
            gcd=i;
    }
            System.out.print(gcd);    
    }
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    getGcd(a,b);
    }
}
