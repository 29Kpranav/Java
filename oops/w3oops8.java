import java.util.concurrent.LinkedBlockingDeque;

//Runtime Polymorphism 
//the child class overrides the method of the parent class.

class Shape{  
    void draw(){System.out.println("drawing...");}  
    }  
    class Rectangle extends Shape{  
    void draw(){System.out.println("drawing rectangle...");}  
    }  
    class Circle extends Shape{  
    void draw(){System.out.println("drawing circle...");}  
    }  
    class Triangle extends Shape{  
    void draw(){System.out.println("drawing triangle...");}  
    }  
    class w3oops8{  
    public static void main(String args[]){  
    Shape s;  
    s=new Rectangle();  
    s.draw();  
    s=new Circle();  
    s.draw();  
    s=new Triangle();  
    s.draw();  
    }  
    }