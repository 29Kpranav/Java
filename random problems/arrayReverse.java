import java.util.*;
public class arrayReverse{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int A[] = new int[size];
         for(int i=0;i<size;i++){
            A[i]=sc.nextInt();
         }

         for(int i=A.length-1;i>=0;i--){
            System.out.print(A[i]+" ");
         }
    }
}