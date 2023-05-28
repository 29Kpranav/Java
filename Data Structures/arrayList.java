// Array store memory in continous form 
// Array always have fixed size once declare
//Array store primitives(int,float,..) or objects
// to add another no. in array it is not possible directly we need to copy that & make another array thus to overcppme this we have arrayList concept

// Arraylist have variable memory & in non continous form
// Arraylist store only objects
// Arraylist make in heap of memory
//Arraylist performs Add, Get, Modify, Delete, iterate operations

//import java.util.*;                you can use java.util* as well but it import other classes also which leads increase in size
import java.util.ArrayList;       // use this package always for arralist
import java.util.Collections;     // use for collections   
public class arrayList {
    public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();        
    
    //add elements
    list.add(0);
    list.add(2);
    list.add(3);

    System.out.println(list);

    //get elements
    int element = list.get(0);
    System.out.println(element);

    //add element in between
    list.add(1, 1);
    System.out.println(list);
    
    //set element
    list.set(0, 5);
    System.out.println(list);

    //delete element
    list.remove(3);
    System.out.println(list);
    
    //size
    int size = list.size();
    System.out.println(size);

    //loops
    for(int i=0; i<list.size(); i++){
        System.out.print(list.get(i));
    }
    System.out.println();

    //sorting
    Collections.sort(list);
    System.out.println(list);
    }
}
// ArrayList<Integer> list = new arrayList<Integer>();
// ArrayList<String> list = new arrayList<>();
// Float
// Boolean