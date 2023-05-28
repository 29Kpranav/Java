 // Queue
 // Queue using Array 
 // First In First Out
 // Operations - Enque (add element)              Dequeue (remove element)              Front (peek top element)
 
 // add-O(1) peak-O(n) remove-O(n)

public class queue1 {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;  // we dont need to make front as front = 0 is always default

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1;                // if queue is empty isEmpty function return true
        }

        public static void add(int data){   //Enque (add element)
            if(rear == size-1){
                System.out.println("full queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        
        // dequeue - O(n)
        public static int remove() {    //Dequeue (remove element)
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }                          // we shifted all elements to previos place 
            rear--;                    // this should be added as we shifted all elements to previos place so now our rear should also shift to its previos place
            return front;
        }

        public static int peek() {  //Front (peek top element)
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            return arr[0];
        }
    }
    public static void main(String[] args){
         Queue q = new Queue(5);
         q.add(1);
         q.add(2);
         q.add(3);

         while(!q.isEmpty()){
            System.out.println(q.peek()+" ");
            q.remove();
         }
         
    }
}
