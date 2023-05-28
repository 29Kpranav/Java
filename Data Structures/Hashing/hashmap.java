
import java.util.*;
/*
 hashmap use for pairs like key <--> values where keys always be unique & 
 value can be same,unique and multiple values for diffrent keys
 */

public class hashmap {

 public static void main(String args[]){
   // country(key), population(value)
   HashMap<String, Integer> map = new HashMap<>();

   //Insertion
   map.put("india", 120);
   map.put("china", 140);
   map.put("us", 30);
   
   System.out.println(map);           //unordered map

   //search
   map.put("china", 150);  //if key exist update the value & if key doesn't exist new pair inserted
   if(map.containsKey("china")){
    System.out.println("key is present in map");
   }else{
    System.out.println("not present");
   }
   
   System.out.println(map.get("china")); 
   System.out.println(map.get("Indoneshia"));  // key not exist

   /*you can use for loop for array using 2 ways for(int i=0;i<n;i++) & for(int i : array) similarly..*/

   for( Map.Entry<String, Integer> e: map.entrySet()){  //Map.Entry interface in java provides certain methods to acscess the entry in Map & Iterate by entrySet 
      System.out.println(e.getKey());
      System.out.println(e.getValue()); 
   }
    
   Set<String> keys = map.keySet();  //create set of strings for keys Iterate by keyset
   for(String key : keys){
    System.out.println(key +" "+ map.get(key));
   }

   // remove pair
   map.remove("china");
   System.out.println(map);
 }    
}
