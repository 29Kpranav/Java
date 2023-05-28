
// compile time polymorphism - function overloading


class ClassA{
    void show(int x, float y){
        System.out.println("x="+x+" y="+y);
    }
    void show(String s){
        System.out.println("s="+s);
    }
}
public class polymorphism1 {
   public static void main(String[] args){
    ClassA obj = new ClassA();
    obj.show("KP");
    obj.show(10,2.5f);
   } 
}
