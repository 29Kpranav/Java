import java.util.Scanner;

public class leetcode1 {
    static void countEven(int num) {
    int ans=0;
       //*****/
              while(num>0) {
                  if(isEven(sum(num))) {
                      ans++;
                  }
                  num--;
              }
          System.out.println(ans);
    }
    public static boolean isEven(int n) {
    return n%2==0;
    }
    public static int sum(int n) {
    int sum=0;
    while(n>0) {
    
              int t=n%10;
              sum=sum+t;
              n=n/10;
          }
          return sum;
      }
      public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        countEven(num);
         
      }
    }

//Count Integers With Even Digit Sum
//Example 1:

//Input: num = 4
//Output: 2
//Explanation:
//The only integers less than or equal to 4 whose digit sums are even are 2 and 4.    
//Example 2:

//Input: num = 30
//Output: 14
//Explanation:
//The 14 integers less than or equal to 30 whose digit sums are even are
//2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, and 28.