
//run time polymorphism - function overriding

class Animal{
    void eat(){
        System.out.println("Animal is eatig");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Deer is eating grass");
    }
}
class Fawn extends Deer{
    void eat(){
        System.out.println("On mother's feed");
    }
}
public class polymorphism6 {
    public static void main(String[] args){
        Animal animal = new Fawn();
        animal.eat();
        Deer deer = new Fawn();
        deer.eat();
    }
}


//An object of Fawn can be stored in the reference of either class BaseClass Animal or class Deer
