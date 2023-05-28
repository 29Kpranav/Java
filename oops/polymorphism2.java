
//// compile time polymorphism - function overloading

class concreteClass{
    void show(int x){
        System.out.println("int show x="+x);
    }
    void show(double s){
        System.out.println("double show s="+s);
    }
}
public class polymorphism2 {
  public static void main(String[] args){
  concreteClass obj = new concreteClass();
  obj.show(23);
  obj.show('P');
  obj.show(2.5f);
  obj.show(3.45);
  }  
}
