 /* class Solution {
    public void deleteNode(ListNode node) {
        // Since we know input node is not last node, so nextNode will not be null
        ListNode nextNode = node.next;
        // Step 2
        node.val = nextNode.val;
        // Step 3
        node.next = nextNode.next;
        nextNode.next = null;
    }
}

Since we couldn't enter the preceding node, we can not delete the given node. We can just copy the next node to the given node and delete the next one.
*/