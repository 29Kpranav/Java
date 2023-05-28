
// Can we overload the main Method

class s{
    static void main(int i){
        System.out.println("int argument");
    }
    static void main(double d){
        System.out.println("double argument");
    }
    static void main(){
        System.out.println("main without argument");{
        }
    }
}
public class polymorphism9 {
    public static void main(String[] args){
    s m = new S();
    m.main();
    m.main(20);
    m.main(2.45);
    }
}

//main method can be overloaded
//All overloaded methods will be called