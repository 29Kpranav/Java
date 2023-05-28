 //x to power n(stack height=logn)
 // youtube 1.15 hrs.

 public class recursion4 {
    public static int getPow(int x,int n){
    int result;
    if(n==0){
        return 1;
    }
    if(x==0){
        return 0; 
    }
    if(n%2==0){ // n is even
       return getPow(x, n/2)*getPow(x, n/2);
    }else{  // n is odd
        return getPow(x, n/2)*getPow(x, n/2) * x;
    }
    result=x * getPow(x, n-1);
    return result; 
    }
    public static void main(String[] args){
        int x=2;
        int n=5;
        int ans = getPow(x, n);
        System.out.println(ans);
    }
}