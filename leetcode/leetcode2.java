import java.util.*;
import java.util.Scanner;
 class leercode2 {
    static void isSameAfterReversals(int num) {
        int sum=0,r,sum2=0,p,temp=num;
        while(num>0){
          r=num%10;
            sum=sum*10+r;
            num=num/10;
        }
        System.out.println(sum);
        while(sum>0){
            p=sum%10;
            sum2=sum2*10+p;
            sum=sum/10;
        }
        System.out.println(sum2);
        //if(sum2==temp){
          //  return true;
          //  }
        //else return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        isSameAfterReversals(num);
        
    }
}

// A Number After a Double Reversal
//Input: num = 526
//Output: true
//Explanation: Reverse num to get 625, then reverse 625 to get 526, which equals num.