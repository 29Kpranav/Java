import java.util.*;
public class function2 {
    public static void sumOfodd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
        if(i%2!=0){
            sum=sum+i;
        } 
        }
        System.out.print(sum);
    }
    public static void main(String[] args){
        System.out.println("Enter the Number:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
         
        sumOfodd(n);

    }
}
