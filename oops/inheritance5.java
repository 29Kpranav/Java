
// Access modifiers

class A{
    int a;
    public int b;
    private int c;      ///
    protected int d;
}
class B extends A{
    void show(){
        a=10;
        b=20;
        //c=30;
        d=40;
        System.out.println(a+","+b+","+d);
    }
}
public class inheritance5 {
    public static void main(String args[]){
        B obj = new B();
        obj.show();
    }
}
