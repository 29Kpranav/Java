class RBRCourse {
public void baseCourseDetails(){
    System.out.println("RBR Base Corse is launched");
}  
}
class JavaCourse extends RBRCourse{

}
public class inheritance1 {
    public static void main(String[] args){
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.baseCourseDetails();
    }

}