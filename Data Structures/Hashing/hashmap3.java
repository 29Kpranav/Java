 
 // Find itinerary from Tickets

import java.util.HashMap;

public class hashmap3 {
    public static String getStart(HashMap<String, String> tick){
        HashMap<String, String> revMap = new HashMap<>();          // create new hashmap 

        for(String key : tick.keySet()){        
            revMap.put(tick.get(key), key);      // reverse the hashmap 
        }

        for(String key : tick.keySet()){     // if key doesn't exist it will return our starting point
            if(!revMap.containsKey(key)){        
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args){
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("chennai","Benguluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "chennai");
        tickets.put("Delhi", "Goa");
        
        String start = getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.print(start+"->");
            start = tickets.get(start);       // update the start..
        }
        System.out.println(start);
    }
}
