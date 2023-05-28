import java.util.Stack;

//push at the bottom of stack

public class stack4 {
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();       // remove top & get 1 2 3 
        pushAtBottom(data, s);   // call recurrsion
        s.push(top);             // add top 1 2 3
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
         
        pushAtBottom(4, s);
         
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
    }
}
}
