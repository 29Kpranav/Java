
// classes and objects..

class num{
    int x=2;
}
class Pen {
    String color;    // color is an attribute here
   
    public void printColor() {
        System.out.println("The color of this Pen is " + this.color);
    }
 }
  
 public class w3oops1 {   //main class
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.color = "blue";
  
        Pen p2 = new Pen();
        p2.color = "black";
  
        Pen p3 = new Pen();   //multiple objects
        p3.color = "red";
  
        p1.printColor();
        p2.printColor();
        p3.printColor();

        num n1=new num();
        n1.x=25;
        System.out.println(n1.x);     //value of x can override.
    }
 }
 