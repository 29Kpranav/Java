public class pattern3 {
    public static void main(String[] args){

        for(int i=4; i>=1; i--)  //outer loop
        {
        for(int j=1; j<=i; j++)  //inner loop
        {
        System.out.print("*");
        }  
     
        System.out.println();
    }
        }
}