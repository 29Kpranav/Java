import java.util.*;
import java.util.Scanner;
public class calculator {
    static void getAdd(int a,int b){
       int c=a+b;
       System.out.println(c);
    }
    static void getSub(int a,int b){
        int c=a-b;
        System.out.println(c);
    }
    static void getMul(int a,int b){
        int c=a*b;
        System.out.println(c);
    }
    static void getDiv(int a,int b){
        int c=a/b;
        System.out.println(c);
    }

    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int exp=sc.nextInt();
     switch(exp){
        case 1:getAdd(a,b);
        break;
        case 2:getSub(a,b);
        break;
        case 3:getMul(a,b);
        break;
        case 4:getDiv(a,b);
        break;
        default:System.out.println("Invalid Expression");
     }
    }
}
    

