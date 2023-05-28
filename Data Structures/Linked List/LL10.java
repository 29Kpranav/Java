
//Merge Two Sorted Lists

//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]

 /* Java program to merge two sorted linked lists */

import java.util.*;
 
/* Linklist node */

class ListNode {

    int val;
    ListNode next;
    ListNode(int val)
    {
        this.val = val;
        this.next = null;
    }
}
class MergeLists {
    ListNode head;
    /* Method to insert a node at the end of the linked list */
    public void addToTheLast(ListNode node)
    {
        if (head == null) {
            head = node;
        }
        else {
            ListNode temp = head;
            while (temp.next != null)
            temp = temp.next;
            temp.next = node;
        }
    }
    /* Method to print linked list */
    void printList()
    {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    // Driver Code
    public static void main(String args[])
    {
        /* Let us create two sorted linked lists to test the methods Created lists llist1: 5->10->15,llist2: 2->3->20
        */
        MergeLists llist1 = new MergeLists();
        MergeLists llist2 = new MergeLists();
 
        // Node head1 = new Node(5);
        llist1.addToTheLast(new ListNode(5));
        llist1.addToTheLast(new ListNode(10));
        llist1.addToTheLast(new ListNode(15));
        // Node head2 = new Node(2);
        llist2.addToTheLast(new ListNode(2));
        llist2.addToTheLast(new ListNode(3));
        llist2.addToTheLast(new ListNode(20));
        llist1.head = new Gfg().sortedMerge(llist1.head,llist2.head);       // naya hai yah
        System.out.println("Merged Linked List is:");
        llist1.printList();
    }
}
class Gfg {
    /* Takes two lists sorted in increasing order, and splices their nodes together to make one big sorted list which is returned. */
    ListNode sortedMerge(ListNode headA, ListNode headB)
    {
        /* a dummy first node to hang the result on */
        ListNode dummyNode = new ListNode(0);
        /* tail points to the last result node */
        ListNode tail = dummyNode;
        while (true) {                                               //naya hai yah
            /* if either list runs out, use the other list */
            if (headA == null) {
                tail.next = headB;
                break;
            }
            if (headB == null) {
                tail.next = headA;
                break;
            }
            /* Compare the data of the two lists whichever lists' data is smaller, append it into tail and advance the head to the next Node
            */
            if (headA.val <= headB.val) {
                tail.next = headA;
                headA = headA.next;
            }
            else {
                tail.next = headB;
                headB = headB.next;
            }
            /* Advance the tail */
            tail = tail.next;
        }
        return dummyNode.next;
    }
}