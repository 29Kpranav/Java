import java.util.Scanner;

public class array2
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int elements = input.nextInt();

        int [] array = new int[elements];
        int max = array[0];
         
        for(int i = 0; i<elements; i++){

            System.out.print("Enter a number: ");
            array[i] = input.nextInt();

            if(array[i]>max){
                max = array[i];
            }
        }

        int min = array[0];
        for(int i = 0; i<elements; i++){
        if(array[i]<min){
            min = array[i];
        }
    }
     
        System.out.println("The maximum number is:" + max);
        System.out.println();
        System.out.println("The minimum number is: " + min);
    
}
}