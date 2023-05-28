import java.util.*;
import java.util.LinkedList;
// queue using framework
public class queue4{

    public static void main(String args[]){
        
        //Queue q = new Queue();
        Queue<Integer> q = new java.util.LinkedList<>();          // gajab   
        //we can also use ArrayDeque instead of LinkedList 
        //queue is inteface , object made by classes not by interface so we use LinkeedList here

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    
    }
}
