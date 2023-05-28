
//Swapping Nodes in a Linked List
//You are given the head of a linked list, and an integer k.
//Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

//Input: head = [1,2,3,4,5], k = 2
//Output: [1,4,3,2,5]

 /*class Solution {
    
    // Use fast and slow pointers to find the kth node and last kth node
    // swap the two nodes (draw a picture will make life easier)
    // edge case: the kth node and last kth node might be next to each other, while swapping should deal separately
    
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode dummyPrev = new ListNode(-2);
        dummyPrev.next = dummy;
        
        ListNode fast = dummy;
        ListNode slow = dummy;
        ListNode prevFast = dummyPrev;
        ListNode prevSlow = dummyPrev;
        
        ListNode firstKNode = null;
        ListNode lastKNode = null;
        
        int dis = 0;
        while (dis < k && fast != null) {
            fast = fast.next;
            prevFast = prevFast.next;
            dis++;
        }
        
        firstKNode = fast;
        
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
            prevSlow = prevSlow.next;
        }
        
        lastKNode = slow;
        
        // Update node value can also pass
        /*
        int temp = firstKNode.val;
        firstKNode.val = lastKNode.val;
        lastKNode.val = temp;
        
        return dummy.next;
        
        if (firstKNode == lastKNode) {
            return dummy.next;
        }
        
        if (firstKNode.next == lastKNode) {
            prevFast.next = lastKNode;
            firstKNode.next = lastKNode.next;
            lastKNode.next = firstKNode;
            return dummy.next;
        }
        
        if (lastKNode.next == firstKNode) {
            prevSlow.next = firstKNode;
            lastKNode.next = firstKNode.next;
            firstKNode.next = lastKNode;
            return dummy.next;
        }
        
        ListNode nextOfLastK = lastKNode.next;
        
        // System.out.println("prevSlow = " + prevSlow.val);
        // System.out.println("prevFast = " + prevFast.val);
        // System.out.println("firstKNode = " + firstKNode.val);
        // System.out.println("lastKNode = " + lastKNode.val);
        
        // swap
        prevFast.next = lastKNode;
        prevSlow.next = firstKNode;
        lastKNode.next = firstKNode.next;
        firstKNode.next = nextOfLastK;
        
        return dummy.next;
        
    }
} */
