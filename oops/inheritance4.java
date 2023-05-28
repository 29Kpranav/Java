
class Doctor{
    void type(){
        System.out.println("Im Simple Doctor");
    }
}
class Pediatrician extends Doctor{
    void type(){
        System.out.println("Im Pediatrician");
    }
}
class Gynecologist extends Doctor{
    void type(){
        System.out.println("Im Gynecologist");
    }
}
public class inheritance4 {
 public static void main(String args[]){
    Doctor d = new Doctor();
    d.type();
    Pediatrician p = new Pediatrician();
    p.type();
    Gynecologist g = new Gynecologist();
    g.type();
 }   
}


// same function makes difference in output..
// heiracal inheritance
