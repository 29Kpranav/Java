
// Queue using Linked List

public class queue3 {
   static class Node {    //static
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null; // if queue is empty isEmpty function return true
        }

        public static void add(int data) { // Enque (add element)
            Node newNode = new Node(data);
            if (tail == null) {
                tail = head = newNode;
                return;
            }
            tail.next = newNode;    // we always insert at rear in queue so tail.next
            tail = newNode;
        }

        // dequeue - O(n)
        public static int remove() { // Dequeue (remove element)
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            if(head == tail){
                tail = null;    // for single element
            }
            head = head.next;

            return front;
        }

        public static int peek() { // Front (peek top element)
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }
        public static void main(String[] args) {
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);

            while (!q.isEmpty()) {
                System.out.println(q.peek() + " ");
                q.remove();
            }
        }
}
