
//Java methods

public class w3oops2 {
    // Static method
    static void myStaticMethod() {
      System.out.println("Static methods can be called without creating objects");
    }
  
    // Public method
    public void myPublicMethod() {
      System.out.println("Public methods must be called by creating objects");
    }
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
      }
  
    // Main method
    public static void main(String[] args) {
      myStaticMethod(); // Call the static method
      // myPublicMethod(); This would compile an error
  
      w3oops2 myObj = new w3oops2(); // Create an object of Main
      myObj.myPublicMethod(); // Call the public method on the object
      myObj.speed(200);   //Access Methods With an Object
    }
  }