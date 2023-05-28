// Tower of Hanoi..

import java.util.*;

public class AdRecurrsion1 {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk " + n + " from "+ src + " to " +dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk " + n + " from "+ src + " to " +dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String [] args){
        int n= 3;
        towerOfHanoi(n, "S", "H", "D");
    }
}

// time complexity - O(2^n-1) ~ O(2^n)

