 
// Implementation HashMap
// HashMap internally implemented as array of LinkedList
// hashing means data form change
import java.util.*;

public class hashmap1 {
    static class HashMap<K, V> { // generic - when we dont know data type of hashmap key & value use them as generic means genral 
       private class Node{
        K key;
        V value;

        public Node(K key, V value){
            this.key = key;
            this.value = value;
        }
       }
       
       private int n; //n - total no. of nodes
       private int N; // total no. of buckets
       private LinkedList<Node> buckets[]; // linkedlist<Node> is datatye of array of buckets
       
       @SuppressWarnings("unchecked")  // sometimes you will get warning to show type of linkedlist in some version to remove warning use this
       public HashMap(){
        this.N = 4;
        this.buckets = new LinkedList[4];
        for(int i=0; i<4; i++){
            this.buckets[i] = new LinkedList<>();       // create null linkedlist at every bucket 
        }
       }
       
       private int hashFuction(K key){  //0 to N-1
          int bi = key.hashCode(); 
          return Math.abs(bi) % N;   // for only positive value
       }

       private int searchInLL(K key, int bi){
        LinkedList<Node> ll = buckets[bi];

        for(int i=0; i<ll.size(); i++){
            if(ll.get(i).key == key){
                return i;
            }
        }

        return -1;
       }
       
       @SuppressWarnings("unchecked")
       private void rehash(){
        LinkedList<Node> oldBucket[] = buckets;
        buckets = new LinkedList[N*2];

        for(int i=0; i<N*2; i++){
            buckets[i] = new LinkedList<>();
        }

        for(int i=0; i<oldBucket.length; i++){
            LinkedList<Node> ll = oldBucket[i];
            for(int j=0; j<ll.size(); j++){
                Node node = ll.get(j);
                put(node.key, node.value);
            }
        }
    }

       public void put(K key, V value){
         int bi = hashFuction(key);
         int di = searchInLL(key, bi); // data index 

         if(di == -1){  //key doesn't exist
            buckets[bi].add(new Node(key, value));
            n++;
        } else { // key exists
            Node node = buckets[bi].get(di);
            node.value = value;
        }
        
        double lamda = (double)n/N;
        if(lamda > 2.0) {
            //rehashing
            rehash();
        }

       }

       public boolean containsKey(K key){
        int bi = hashFuction(key);
         int di = searchInLL(key, bi); // data index 

         if(di == -1){  //key doesn't exist
            return false;
        } else { // key exists
            return true;
        }
        
       }
       
       public V remove(K key){
        int bi = hashFuction(key);
         int di = searchInLL(key, bi); // data index 

         if(di == -1){  //key doesn't exist
          return null;
        } else { // key exists
            Node node = buckets[bi].remove(di);
            n--;
            return node.value; 
        }
        
       }

       public V get(K key) {
        int bi = hashFuction(key);
         int di = searchInLL(key, bi); // data index 

         if(di == -1){  //key doesn't exist
           return null;
        } else { // key exists
            Node node = buckets[bi].get(di);
            return node.value;
        }
        
       }

       public ArrayList<K> keySet() {
        ArrayList<K> keys = new ArrayList<>();

        for(int i=0; i<buckets.length; i++){  //bi
            LinkedList<Node> ll = buckets[i];
            for(int j=0; j<ll.size(); j++){  //di
                Node node = ll.get(j);
                keys.add(node.key);
            }
        }
        return keys;
       }

       public boolean isEmpty() {
        return n==0;
       }

    }
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("china", 140);
        map.put("us", 30);
        
        ArrayList<String> keys = map.keySet();
        for(int i=0; i<keys.size(); i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
    }
}

// worst case O(n) otherwise O(lamda)