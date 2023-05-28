
//constructer..


public class w3oops3 {   // Create a Main class
    int modelYear;
    String modelName;
  
    public w3oops3(int year, String name) {   
        //Constructor Parameters
        //name of class = name of constructor
      modelYear = year;
      modelName = name;
    }
  
    public static void main(String[] args) {
      w3oops3 myCar1 = new w3oops3(1969, "Mustang");    // Create an object of class w3oops3 (This will call the constructor)
      System.out.println(myCar1.modelYear + " " + myCar1.modelName);
      }
    }
  

  /*
   A Copy constructor is an overloaded 
constructor used to declare and initialize an object from another object. There is only a user defined copy constructor in Java(C++ has a default one too).
class Student {
   String name;
   int age;
  
   Student(Student s2) {
       this.name = s2.name;
       this.age = s2.age;
   }
}
   */
  