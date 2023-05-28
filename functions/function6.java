import java.util.*;
public class function6 {
    
    public static void main(String[] args){
     int sum_p=0, sum_n=0, sum_z=0;
     char choice;
         do{
        System.out.println("Enter number ");
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if(n>0)
			sum_p++;
		else if(n<0)
			sum_n++;
		else
			sum_z++;
            System.out.println("Do you want to Continue(y/n)?");
            Scanner s= new Scanner(System.in);
            choice=  s.next().charAt(0);
        }while(choice=='y');
        System.out.println("Positive Number :"+sum_p);
        System.out.println("Negative Number :"+sum_n);
        System.out.println("Zero Number :"+sum_z);
    }
}