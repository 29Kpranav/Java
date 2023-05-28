 
 import java.util.*;
import javax.naming.spi.DirStateFactory.Result;

 public class recursion{
    static int getRecursion(int n){
    int result;
    if(n==0 || n==1)
         return 1;
    else
    result=n*getRecursion(n-1);
    return result;
}
    public static void main(String[] args){
        int result;
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        result=getRecursion(n);
        System.out.println(result);
         
    }
 }