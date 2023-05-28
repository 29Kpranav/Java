// Java Program to find an element in a Linked List

// Importing the Linked List class
import java.util.LinkedList;

public class LL2 {
    public static void main(String[] args){
    // Intializing Linked List
    LinkedList<Integer> ll = new LinkedList<>();
    
    // Adding elements to the Linked List
    ll.add(1);
    ll.add(2);
    ll.add(3);
    ll.add(4);
    ll.add(5);
    ll.add(6);
    ll.add(7);
    
    // Element to be searched
    int ele =  4;

    // Initializing the answer to the index -1
    int ans = -1;

    // Traversing through the linked list
    for(int i=0; i<ll.size(); i++){

        //Eztractig each element in
        // the Linked List
        int llEle = ll.get(i);

        // Checking if the extracted element is equal to
       // the element to be searched
    if (llEle == ele) {

    // Assigning the index of the
    // element to answer
    ans = i;
    break;
   }
  }
    // Checking if the element is present in the Linked
    // List
    if (ans == -1) {
    System.out.println("Element not found");
  }
    else {
    System.out.println(
    "Element found in Linked List at " + ans);
  }
 }
}
 
 