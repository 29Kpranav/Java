

class BaseClassExtraMethod{
    void fun(){
        System.out.println("fun of ");
    }
}
class DerivedClassExtraTest extends BaseClassExtraMethod{
    void fun(){
        System.out.println("fun of Derived");
    }
    void morefun(){
        System.out.println("more fun ");
    }
}
public class polymorphism8 {
    public static void main(String[] args){
    BaseClassExtraMethod obj = new DerivedClassExtraTest();
    obj.morefun();
    }
}

//When a basee class reference points to an object of derived class only methods overridden and inherited can be called 
// the method morefun is a method of DerivedClassExtraMethod class so it cannot be called from a reference of bae class