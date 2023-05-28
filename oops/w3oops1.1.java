
//Java Classes and Objects

import java.util.*;
class Pen {
    String color;
   
    public void printColor() {
        System.out.println("The color of this Pen is " + this.color);
    }
 }
 
public class w3oops1 {
    int x=5;                  // x= Attribute
    String fname = "John";    // If you don't want the ability to override existing values, declare the attribute as final:
                              // final int x = 5;
    String lname = "Doe";

                         
public static void main(String[] args){
    w3oops1 myObj1=new w3oops1();
    w3oops1 myObj2=new w3oops1();       //multiple objects
    System.out.println(myObj1.x);
    myObj1.x=25;                       //override existing values
    System.out.println(myObj1.x);
    myObj2.x=0;
    System.out.println(myObj2.x);
    System.out.println("Name: " + myObj1.fname + " " + myObj1.lname);  //multiple attributes
    
    Pen p1 = new Pen();       //obj.
        p1.color = "red";
 
    p1.printColor();

}
}