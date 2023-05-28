
import java.util.*;
import java.util.Scanner;
public class quadrants {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x==0 && y==0){
        System.out.println("Coordinates at origin");
        }else if(x>0 && y>0){
            System.out.println("Coordinates at 1st quad.");
        }else if(x<0 && y>0){
            System.out.println("Coordinates at 2nd quad.");
        }else if(x<0 && y<0){
            System.out.println("Coordinates at 3rd quad.");
        }else {
            System.out.println("4th");
        }
    }
}
