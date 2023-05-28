
/*
 Interfaces
All the fields in interfaces are public, static and final by default.
All methods are public & abstract by default.
A class that implements an interface must implement all the methods declared in the interface.
Interfaces support the functionality of multiple inheritance.
*/

interface Animal {
    void walk();
 }
  
 class Horse implements Animal {
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
 }
   
 class Chicken implements Animal {
   public void walk() {
       System.out.println("Chicken walks on 2 legs");
   }
}
  
 public class w3oops9 {
    public static void main(String args[]){
        Horse a = new Horse();
        a.walk();
    }
 } 

 // Horse walks on 4 legs