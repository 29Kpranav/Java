

class BaseReference{
    void show(){
        System.out.println("show of A");
    }
}
class DerivedReference extends BaseReference{
    void display(){
        System.out.println("display of B");
    }
}
public class inheritance6 {
 public static void main(String args[]){
    BaseReference x = new DerivedReference();
    x.show();
    // DerivedReference x = new BaseReference();  ....cannot convert from BaseReference to DerivedReference
     
 }   
}

//The line BaseReference x = new BaseReference(); creates a reference of the parent class but points to an object of the subclass.
//Now baseReference can only call methods of class DerivedReference that have been inherited from class BaseReference: only show method


