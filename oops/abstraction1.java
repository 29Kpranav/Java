
//when to use abstract class -
//When we expect derived classes to provide specific functioality
//when partial implementation id to be provided in the base class

abstract class AbstractBaseClass{
    abstract void f1();
}
class abstraction1 extends AbstractBaseClass{
    void f1() {
     System.out.println("function f1");
    }
 public static void main(String[] args){
 AbstractBaseClass ref = new abstraction1();
 ref.f1();
 }    
}

// class AbstractBaseClass is declared abstract and has just one abstract method f1
// only the signature of the method is given 
// The derived class Abstraction1 must override this method provide implementation