
// Print all the subsets of a set of first n natural numbers

import java.util.*;
public class Adrecursion5 {
    public static void printSubset(ArrayList<Integer> subset){
    for(int i=0; i<subset.size(); i++){
        System.out.println(subset.get(i)+" ");
    }
    System.out.println();
    }

    public static void findSubset(int n,ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }

        //add hoga 
    }
}
