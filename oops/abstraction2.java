
abstract class AbstractBaseClass1{
    abstract void f1();
}
class DerivedClassA extends AbstractBaseClass1{
    void f1(){
        System.out.println("function f1");
    }
}
class DerivedClassB extends AbstractBaseClass1{

}
public class abstraction2 {
public static void main(String[] args){
 AbstractBaseClass1 ref = new DerivedClassA();
 ref.f1();
 ref= new DerivedClassB();  //*
 ref.f1();
}    
}

//error
//class AbstractBaseClass1 has one abstract method f1()
//it is overridden in class DerivedClassA but not in class DerivedClassB so DerivedClassB becomes abstract
//We cannot create objects of DerivedClassB class


//We canot declare abstract methods in a non abstract class !