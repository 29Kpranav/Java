
//Data Members and Runtime Polymorphism

class BaseClassTest{
    int x=10;
}
class DerivedClassTest extends BaseClassTest{
    int x=20;
}
public class polymorphism7 {
    public static void main(String[] args){
        BaseClassTest ref = new DerivedClassTest();
        System.out.println(ref.x);
    }
}


//Remember Object slicing covered earlier
//Data members cannot be overridden