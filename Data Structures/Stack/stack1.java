//stack - last in last out
// push...pop..peek
// stack implements using linkedlist
public class stack1 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){  // add node at start
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;  //newNode's next become head
            head = newNode;       // head becomes newNode   ... insertion of newNode 
        }

        public static int pop(){  // delete 1st node 
            if(isEmpty()){
                 return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        
        public static int peek(){ // to select node & data 
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
     
    }


    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()){                  // while keep going until get false
            System.out.println(s.peek());
            s.pop(); 

            // stack will be 5 4 3 2 1
            // it will peek 5 then pop 5
            // then peek 4 pop 4 ... utl gets empty 
        }

    }
}
