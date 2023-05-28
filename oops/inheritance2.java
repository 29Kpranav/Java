
class Exam{
    void examDetails(){
        System.out.println("Printing Exam details");
    }
}
class GATE extends Exam{
    void gateExamDetails(){
        System.out.println("Printing GATE Exam details");
    }
}
public class inheritance2 {
 public static void main(String[] args){
    GATE gateExam = new GATE();
    gateExam.examDetails();
    gateExam.gateExamDetails();
 }   
}
