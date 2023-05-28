import java.util.ArrayList;
import java.util.Collections;

class alpha{
    public static void main(String[] args) {
        ArrayList<Character> ar = new ArrayList<>();
        ar.add(0, 'b');
        ar.add(1, 'a');
        ar.add(2, 'c');
        ar.add(3, 'e');
        ar.add(4, 'd');

        Collections.sort(ar);
        System.out.println(ar);
    }
} 
