
//Input: head = [0,3,1,0,4,5,2,0]
//Output: [4,11]
//Explanation: 
//The above figure represents the given linked list. The modified list contains
//- The sum of the nodes marked in green: 3 + 1 = 4.
//- The sum of the nodes marked in red: 4 + 5 + 2 = 11.
//

/*class Solution {
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode node  = head;
        ListNode ret  = head;
        while(node != null){
            if(sum > 0 && node.val == 0){
                ret.next = new ListNode(sum);
                ret = ret.next;
                sum = 0;
            }else {
                sum += node.val;
            }
            node = node.next;
        }
        return head.next;
    }
} */
