
// run time polymorphism - function overriding

class x{
    void show(){
        System.out.println("x");
    }
}
class y extends x{
    void show(){
        System.out.println("y");
    }
}
class z extends y{
    void show(){
        System.out.println("z");
    }
}
public class polymorphism3 {
   public static void main(String[] args){
   x ref = new X();
   ref.show();
   ref = new y();
   ref.show();
   ref = new z();
   ref.show();
   } 
}
