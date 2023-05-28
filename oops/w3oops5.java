
//inheritance

//subclass (child) - the class that inherits from another class
//superclass (parent) - the class being inherited from
//To inherit from a class, use the extends keyword.

class Vehicle {
    protected String brand = "Ford";
    public void honk() {
      System.out.println("Tuut, tuut!");
    }
  }
  
  class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {
      Car myFastCar = new Car();
      myFastCar.honk();
      System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
  }
  