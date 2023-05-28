
// Find & Delete the nth Node from the end of linked list..

// if node from last given 2 and size is 5 then distance from start is size-n+1 = 5-2+1 = 4
// to delete that node find prev Node and link to next of target node as prevNode.Next = prevNode.Next.Next  ..prevNode will be size-n


public class LL5 {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    void printList(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
        System.out.println();
    }
    public Node removeNthElement(Node head,int n){
        if(head.next == null){
            return null; 
        }
        Node currNode = head;
        int size = 0;
        while(currNode.next != null){
            currNode = currNode.next;
            size++;
        }
        int index = size - n + 1;
        Node prev = head;
        int i=1;
        while(i < index){
            prev = prev.next; 
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
    public static void main(String args[]){
        LL5 list = new LL5();
        
        list.addNode(0);
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        list.printList();

        list.head = list.removeNthElement(list.head, 3);

        list.printList();
    }
}


// this solution correct but not for [1,2]

// so use this most valid ans..
/*class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode headNode = new ListNode(9527);
        headNode.next = head;
        ListNode fastNode = headNode;
        ListNode slowNode = headNode;
        while(fastNode.next != null){
        	if(n <= 0){
        	    slowNode = slowNode.next;
        	} else {
        	    n--;
        	}
        	fastNode = fastNode.next;
        }
        if(slowNode.next != null)
        	slowNode.next = slowNode.next.next;
        return headNode.next;
    }
    } */