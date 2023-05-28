/*import java.util.*;;

//Check if a linked list is a palindrome

// find middle of LL
// reverse second half
// check 1st half & 2nd 

public class LL6 {
    
public Node reverse(Node head){
    Node prevNode = null;
    Node curr = head;

    while(curr != null){
        Node nextNode = curr.next;
        curr.next = prevNode;
        prevNode = curr;
        curr = nextNode;
    }
    return prevNode; 
}
public Node findMiddle(Node head){   // hare & turtle approch for find middle.. hare jump two steps and turtle takes 1 step , turtle stops whre middle lies
    Node hare = head;                // if there are even nodes then this functon will return 1st middle i.e for 1 2 3 4 5 6 = 3
    Node turtle = head;

    while(hare.next != null && hare.next.next != null){
        hare = hare.next.next;
        turtle = turtle.next;
    }
    return turtle;
}    
public boolean isPalindrome(Node head){
    if(head == null || head.next == null){
        return true;
    }

    Node middle = findMiddle(head);
    Node secondHalfStart = reverse(middle.next);

    Node firstHalfStart = head;
    while(secondHalfStart != null){
        if(firstHalfStart.data != secondHalfStart.data){
            return false;
        }
        firstHalfStart = firstHalfStart.next;
        secondHalfStart = secondHalfStart.next;
    }
    return true;
}
}
*/