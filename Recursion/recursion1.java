public class recursion1 {
    public static void printNo(int n){
    if(n==0){
        return;
    }
    System.out.println(n);
    printNo(n-1);
    }
    public static void main(String[] args){
        int n=5;
        printNo(n);
    }
}
// 5 4 3 2 1

//for 1 to 5 
//int n=5
//printNo(n+1)