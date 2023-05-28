// Remove duplicate nodes...
//Input: head = [1,2,3,3,4,4,5]
//Output: [1,2,5]

/*
class Solution {
     public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy, cur = head;

        boolean repeat = false;
        while(cur.next != null){
            if(cur.val == cur.next.val){
                repeat = true;
                cur = cur.next;
            } else {
                cur = cur.next;
                if(repeat == false){
                    pre = pre.next;
                }
                pre.next = cur;
                repeat = false;
            }
        }

        if(repeat == true) pre.next = null;
        return dummy.next;
    } 
    } 
}
        */

    /*public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode FakeHead=new ListNode(0);
        FakeHead.next=head;
        ListNode pre=FakeHead;
        ListNode cur=head;
        while(cur!=null){
            while(cur.next!=null&&cur.val==cur.next.val){
                cur=cur.next;
            }
            if(pre.next==cur){
                pre=pre.next;
            }
            else{
                pre.next=cur.next;
            }
            cur=cur.next;
        }
        return FakeHead.next;
    } */