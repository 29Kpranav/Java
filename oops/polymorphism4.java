
// run time polymorphism - function overriding

class Course{
    void study(){
        System.out.println("Studying base c");
    }
    void publish(){
        System.out.println("Publishing base c");
    }
}
class JavaCourse extends Course{
    void study(){
        System.out.println("studying java c");
    }
}
class pythonCourse extends Course{
    void publish(){
        System.out.println("studing python c");
    }
}
public class polymorphism4 {
    public static void main(Strig[] args){
    Course courses[] = new Course[3];
    courses[0]= new Course();
    courses[1]= new JavaCourse();
    courses[2]= new pythonCourse();
    for (course course:courses){
    course.study();
    course.publish();
    }
    }
}
