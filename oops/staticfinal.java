public class staticfinal {

    static int count = 0;
    public void increment() {
    count++;
    }
    static void methodf(){
        // static int a = 9;  ....final
       }
    public static void main(String[] args) {

        staticfinal obj1 = new staticfinal();
        staticfinal obj2 = new staticfinal();
        obj1.increment();
        obj2.increment();
        System.out.println("Obj1: count is=" + obj1.count);
        System.out.println("Obj2: count is=" + obj2.count);

    }
}
