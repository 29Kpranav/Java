
//// Take numbers from 1-50  as elements of a linked list as input from user delete all nodes which have values greater than 25

public class LL3 {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        if(head.next == null){
            head.next = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next  != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public Node remove(Node head){
        if(head == null){
            return null;
        }
        Node testNode = new Node(1);     // any value at 1 is gud
        testNode.next = head;
        Node preNode = testNode;
        Node currNode = head;

        while(currNode != null){
            if(preNode.next != currNode){
                preNode = preNode.next;
            }

            if(currNode.data > 25){
                preNode.next = currNode.next;
            }

            currNode = currNode.next;
        }
        return testNode.next;
    }
     
    public void printList(){
        Node currNode = head;
        while(currNode  != null){
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        LL3 list = new LL3();

        for(int i = 1; i < 51; i++){
            list.addLast(i);
        }

        list.printList();

         list.remove(list.head);

        list.printList();
    }
}