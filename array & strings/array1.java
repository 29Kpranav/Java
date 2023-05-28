 import java.util.*;
 
 
public class array1 {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int names[] = new int[size];
  
       //input
       for(int i=0; i<size; i++) {                 //i should start with 0 in array..
           names[i] = sc.nextInt();
       }
      
       //output
        for(int i=0; i<names.length; i++) {
            System.out.println("name " + (i+1) +" is : " + names[i]);
        }
       System.out.println("Enter no. to find: ");
       int x= sc.nextInt();
       for(int i=0; i<names.length; i++) {
       if(names[i]==x)
        System.out.println("no. found at : "+ i);
    }
 }
}
 