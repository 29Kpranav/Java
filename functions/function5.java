import java.util.*;
public class function5 {
    public static void getFibonacciNumbers(int n){
        int f1=0,f2=1,i;
        if(n<1)
        System.out.print(f1+" ");
        for(i=1;i<=n;i++){
            System.out.print(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        
    }

    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     int n= sc.nextInt();
     getFibonacciNumbers(n);
    }
}
