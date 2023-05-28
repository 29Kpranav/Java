/*Reverse a Linked List 
Java

Reverse a Linked List without using extra space. 

Iterative Method
Time complexity - O(n)
Space complexity - O(1)

public void reverseList() {
       if(head == null || head.next == null) {
           return;
       }
 
       Node prevNode = null;
       Node currNode = head;
       while(currNode != null) {
           Node nextNode = currNode.next;
           currNode.next = prevNode;
           prevNode = currNode;
           currNode = nextNode;
       }
   }

Recursive Method
Time complexity - O(n)
Space complexity - O(1)  
public Node reverseListRecursive(Node head) {
       //empty node || last node or only one node
       if(head == null || head.next == null) {
           return head;
       }
 
       Node newHead = reverseListRecursive(head.next);
      
       head.next.next = head;         // in list of 1 2 3 4 5   this establish connection 3 --> 2 
       head.next = null;              // here we cut connection between 2 to 3 only 3 to 2 stays
       return newHead;                // 4 is newHead
   }

Collections Method
Time complexity - O(n)
Space complexity - O(1)  
 */ 
import java.util.Collections;
import java.util.LinkedList;
 public class LL4{
    public static void main(String[] args){
       LinkedList<Integer> list2 = new LinkedList<>();
       list2.add(1);
       list2.add(2);
       Collections.reverse(list2);
       System.out.println(list2);
    }
}