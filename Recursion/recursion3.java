
public class recursion3 {
    public static void getFibonacci(int a, int b, int n){
     if(n==0){
        return;
     }
     int c = a + b;
     System.out.println(c);
     getFibonacci(b, c, n-1);
    }
    public static void main(String[] args){
      int a=0,b=1;
      int n=7;
      System.out.println(a);
      System.out.println(b);
      getFibonacci(a, b, n-2);
    }
} 