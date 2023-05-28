
// stack implements using arraylist

import java.util.*;
public class stack2 {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty(){
            return list.size() == 0;

        }

        //push
        public void push(int data){
            list.add(data);
        }

        //pop
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.pop());

        while(!s.isEmpty()){                  // while keep going until get false
            System.out.print(s.peek()+" ");
            s.pop(); 

            // stack will be 5 4 3 2 1
            // it will peek 5 then pop 5
            // then peek 4 pop 4 ... utl gets empty 
        }

    }
}


// to implement stack using linkedlist we push,pop,peek element at first node while using arraylist we add,delete,peek last element 
// arraylist perform better..