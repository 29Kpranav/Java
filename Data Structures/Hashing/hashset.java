  package Hashing;
  import java.util.HashSet;
  import java.util.Iterator;
  /*set is structure where all elements are unique, to implement same property in ds of java we use hashset
    insert - O(1)
    search - O(1)
    delete - O(1)
    */

  public class hashset {
      public static void main(String[] args){
        //Creating
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);    // doesnt allow duplicates

        //Size
        System.out.println("Size of set is :"+set.size());
        
        //print all elements
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();
        // two functions of iterator - hasNext; next
        // hasNext return true or false for next element existed or not & next return next element of set..
        while(it.hasNext()){
          System.out.println(it.next());
        } // no guarrantees as to iteration order of set


        //Search
        if(set.contains(1)){
          System.out.println("set contains 1");
        }
        if(!set.contains(6)){
          System.out.println("does not contain");
        }
        
        //Delete
        set.remove(1);
        if(!set.contains(1)){
          System.out.println("deleted");
        }
      }
  }
