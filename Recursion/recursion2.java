public class recursion2 {
    public static void naturalSum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        naturalSum(i+1, n, sum);
    }
    public static void main(String[] args){
     naturalSum(1, 5, 0);
    }
}
