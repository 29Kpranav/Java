
// constructor..
//to initiate objects..

public class w3oops3 {
    int modelYear;
    String modelName;
  
    public Main(int year, String name) {    // class name = constructor name
       modelYear = year;
       modelName = name;
    }
  
    public static void main(String[] args) {
      w3oops3 myCar = new w3oops3();  //create object
      myCar.modelName="Mustang";
      myCar.modelYear=2022;
      System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
  }
  
  // Outputs 1969 Mustang

  //this keyword 
  // copy constructor =  A Copy constructor is an overloaded constructor used to declare and initialize an object from another object.
  // There is only a user defined copy constructor in Java(C++ has a default one too).
  /*class Student {
   String name;
   int age;
  
   Student(Student s2) {
       this.name = s2.name;
       this.age = s2.age;
   }
}
 */

  // java doesn't have distrucor because they have garbage collector.