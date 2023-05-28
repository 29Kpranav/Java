 // reverse stack

import java.util.Stack;
public class stack5 {
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();       // remove top get 3 2 1
        pushAtBottom(data, s);   // call recurrsion
        s.push(top);             // add top 3 2 1
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
    }

        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);  // 3 2 1  --> 1 2 3
         
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
    }
}
}
