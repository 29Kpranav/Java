 

 // Rotate list

 //Input: head = [1,2,3,4,5], k = 2
 //Output: [4,5,1,2,3]

 //Input: head = [0,1,2], k = 4
 //Output: [2,0,1]

 /*class Solution 
{
    public ListNode rotateRight(ListNode head, int k) 
    {
        if (head == null) return null;
        ListNode tail = head;
        ListNode newTail = head;
        int len = 1;
        while (tail.next != null) 
        {
            tail = tail.next;
            len++;
        }
        for (int i = 0; i < len - k%len - 1; i++) 
        newTail = newTail.next;
        tail.next = head;
        head = newTail.next;
        newTail.next = null;
        return head;
    }     
} */