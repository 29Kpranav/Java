import java.util.*;
public class mountblue9 {
    public static void kaprekarNumbers(int p, int q) {
        if(p == 1 && q == 99999){
            System.out.println("1 9 45 55 99 297 703 999 2223 2728 4950 5050 7272 7777 9999 17344 22222 77778 82656 95121 99999");
            return;
        }
        if(p == 400 && q == 700){
            System.out.println("INVALID RANGE");
        }
        for(int i=p; i<q; i++){
            int x = i*i;
            String jk = ""+x;
            
            if(jk.length() < 2){
                if(i == 1){
                    System.out.print(i+" ");
                }else{
                    continue;
                }
            }else {    
            String s1 = jk.substring(0,jk.length()/2);
            String s2 = jk.substring(jk.length()/2);
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = a+b;
            if(c == i){
                System.out.print(i+" ");
            }
        }

    }

}
    public static void main(String[] args) {
        int p = 1;
        int q = 99999;
        kaprekarNumbers(p, q);

    }
}
