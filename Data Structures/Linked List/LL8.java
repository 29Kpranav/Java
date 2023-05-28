
// https://leetcode.com/problems/swap-nodes-in-pairs/

 // Java program to pairwise swap elements of a linked list
 // 1 2 3 4 5 6 --> 2 1 4 3 6 5
 
class LinkedList {
	Node head; // head of list

	/* Linked list Node*/
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	void pairWiseSwap()
	{
		Node temp = head;

		/* Traverse only till there are atleast 2 nodes left */
		while (temp != null && temp.next != null) {

			/* Swap the data */
			int k = temp.data;
			temp.data = temp.next.data;
			temp.next.data = k;
			temp = temp.next.next;
		}
	}

	/* Utility functions */

	/* Inserts a new Node at front of the list. */
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/* Function to print linked list */
	void printList()
	{
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	/* Driver program to test above functions */
	public static void main(String args[])
	{
		LinkedList llist = new LinkedList();

		/* Created Linked List 1->2->3->4->5 */
		llist.push(5);
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(1);

		System.out.println("Linked List before calling pairWiseSwap() ");
		llist.printList();

		llist.pairWiseSwap();

		System.out.println("Linked List after calling pairWiseSwap() ");
		llist.printList();
	}
}
/* without copy the data
 
public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode testNode = new ListNode(0);
        testNode.next = head;
        ListNode preNode = testNode;
        ListNode currNode = head;

        while(currNode != null && currNode.next != null){
            preNode.next = currNode.next;                           
            currNode.next = preNode.next.next;            
            preNode.next.next = currNode;
            
            
            preNode = currNode;
            currNode = currNode.next;
        }
        return testNode.next;
    }
 */
