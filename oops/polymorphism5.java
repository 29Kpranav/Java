
// run time polymorphism - function overriding

class Vehicle{
    void info(){
        System.out.println("Im vehicle");
    }
}
class car extends Vehicle{
    void info(){
        System.out.println("Im Car");
    }
}
class Bike extends Vehicle{
    void info(){
        System.out.println("Im Bike");
    }
}
class Bus extends Vehicle{
    void info(){
        System.out.println("Im Bus");
    }
}
public class polymorphism5 {
    public static void main(String[] args){
        car c = new Vehicle();
        c.info();
    }
}

/* 
 Because every vehicle is not a car
 Every car is a Vehicle 
 (Remember the IS-A relationship in inheritance)
 */
