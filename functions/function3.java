import java.util.*;
public class function3 {
    public static void getPow(int a, int b){
        long result = 1;
      
        for (int n=b; n != 0; --n) {
          result *= a;
        }
    
        System.out.println("Answer = " + result);
    }
        public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();

        getPow(a,b);
           
        }
      }

