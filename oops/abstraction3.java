
//Abstract Classes and Costructors

abstract class Shape{
    double s1,s2;
    shape(double a,double b){
        s1=a;
        s2=b;                                              // ans..
    }                                                      //data members s1 and s2 represent two sides of a shape 
    abstract double area();                                //the sides are initialized using a parameterized constructor
}                                                          //the are method is abstract and must be overridden by derived class
class Rectangle extends Shape{                             //super keyword is used to call the constructor of the derived classes
    Rectangle (double a,double b){
        super(a,b);
    }
    double area(){
        return s1*s2;
    }
}
class Triangle extends Shape{
    Triangle(double a,double b){
        super(a,b);
    }
    double area()
    {
        return 0.5*s1*s2;
    }
}
public class abstraction3 {
    public static void main(String[] args){
        Shape ref= new Rectangle(10.5, 5.6);
        System.out.println("Area of Rectangle="+ref.are());
        ref=new Triangle(10, 14);
        System.out.println("Area of Triangle="+ref.area());
    }
}
