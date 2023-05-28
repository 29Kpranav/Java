 /*
 Maximum Twin Sum of a Linked List

 In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.

For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.
The twin sum is defined as the sum of a node and its twin.
 
 Input: head = [5,4,2,1]
Output: 6
Explanation:
Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.
There are no other nodes with twins in the linked list.
Thus, the maximum twin sum of the linked list is 6. 

Input: head = [5,4,2,1]
Output: 6
Explanation:
Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.
There are no other nodes with twins in the linked list.
Thus, the maximum twin sum of the linked list is 6. 

Input: head = [1,100000]
Output: 100001
Explanation:
There is only one node with a twin in the linked list having twin sum of 1 + 100000 = 100001.
 
class Solution {
     public ListNode findMiddle(ListNode head){
        ListNode fast,slow;
        fast=slow=head;
        while(fast!=null && fast.next != null){
            fast = fast.next;
            slow =slow.next;
            if(fast.next == null)break;
            fast =fast.next;
        }
        return slow;
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        while(head!=null){
            ListNode next = head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
    
    public int pairSum(ListNode head) {
        ListNode second = findMiddle(head);
        second = reverseList(second);
        int ans = 0;
        while(second!=null){
            ans = Math.max(ans,second.val+head.val);
            second = second.next;
            head = head.next;
        }
        return ans;
    }   
    }
  */