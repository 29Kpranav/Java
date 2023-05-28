import javax.naming.spi.DirStateFactory.Result;


//x to power n(stack height=n)
public class recursion4 {
    public static int getPow(int x,int n){
        int result;
        if(n==0){
        return 1;
    }
    if(x==0){
        return 0; 
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
