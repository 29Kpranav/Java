import java.util.LinkedList;

//Linked List from scrach.. 
//Time complexity

//                 ArrayList       LinkedList
//   insert           O(n)    >      O(1)     
//   search           O(1)    <      O(n)

// so linkedlist use for manupulations and arraylist use for searching to control time complexity

//Linked list have variable size and non contiguous memory
 
// Head is known as first node of linked list
class LL {
 
    Node head;
    private int size;
  
    LL () {      // constructor to initialise size
        size = 0;
    }
  
    public class Node {
        String data;
        Node next;
  
        Node(String data) {
            this.data = data;
            this.next = null;          // every new node have null to its next 'cause first node is making and then linked list formed
            size++;                    // whenever we make new node size increases
        }
    }
  
    public void addFirst(String data) {
        Node newNode = new Node(data);       // make a node and pass data to it
        if(head == null) {                   // check wheather linkedlist is present or not if not then assign our data to node
            head = newNode;
            return;
        }
        newNode.next = head;                 // next of newNode is refers head 
        head = newNode;                      // and head becomes new node
    }
  
    public void addLast(String data) {
        Node newNode = new Node(data);
  
        if(head == null) {
            head = newNode;
            return;
        }
  
        Node lastNode = head;                    // assign lastNode value to head
        while(lastNode.next != null) {           // travel to linkedlist upto null  , so when we got null it will be our last node
            lastNode = lastNode.next;            // refer lastNode to next of 'next node'
        }
  
        lastNode.next = newNode;                 // next of last node become new node
    }
  
    public void printList() {
        Node currNode = head;
  
        while(currNode != null) {                // if we use currNode.next then last node will not print
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
  
        System.out.println("null");
    }
  
    public void removeFirst() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
  
        head = this.head.next;     //head.next also gud
                                   // when we change our head remeaning part will be lost forever due java garbage collector so, automatically deleted
        size--;                    // delete node size decreses
    }
  
    public void removeLast() {
        if(head == null) {         
            System.out.println("Empty List, nothing to delete");
            return;
        }
  
        size--;                  // delete node size decreses  u must put it before line 90's condition  
        if(head.next == null) {  // corner case
            head = null;         // its like if we have only one node then make head as null
            return;
        }
  
        Node currNode = head;             
        Node lastNode = head.next;             // if head.next = null
        while(lastNode.next != null) {         // then head.next.next is occurs there is no next for null so error occurs to avoid that we made corner case    
            currNode = currNode.next;       
            lastNode = lastNode.next;         
        }
  
        currNode.next = null;   // when lastNode.next is null make currNode.next as null so last node will be garbage and get deleted 
    }
  
    public int getSize() {
        return size;
    }
    public void reverseList() {
        if(head == null || head.next == null) {
            return;
        }
  
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;          // curr become prev
            currNode = nextNode;          // next become curr
        }
        head.next = null;                ///  1st node connect with single connection to 2nd node    ..daught
        head = prevNode;                 ///  last null will currNode so make new head as previous
    }
  
  
    public static void main(String args[]) {
        LL list = new LL();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();
  
        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize()); 
  
        //list.removeFirst();
        //list.printList();
        //list.removeLast();

        list.printList();
        list.reverseList();
        list.printList();

    }
 }
 
 /*How to insert in the middle of a Linked List (at a specified index ‘i’) ?


Scratch
public void addInMiddle(int index, String data) {
       if(index > size || index < 0) {
           System.out.println("Invalid Index value");
           return;
       }
       size++;
 
       Node newNode = new Node(data);
       if(head == null || index == 0) {
           newNode.next = head;
           head = newNode;
           return;
       }
        Node currNode = head;
       for(int i=1; i<size; i++) {
           if(i == index) {
               Node nextNode = currNode.next;           
               currNode.next = newNode;
               newNode.next = nextNode;
               break;
           }
           currNode = currNode.next;
       }
   }
 */