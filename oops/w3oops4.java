// polymorphism

// compile-time polymorphism using method overloading..

//return type should diffn. OR
//The type of the parameters passed to the function should diffn. OR 
//The number of parameters passed to the function should diffn.

import java.util.*;
import java.util.Scanner;

class Helper {
    int a,b,c;
    // Method 1
    // Multiplication of 2 numbers
    public int Multiply(int a, int b)
    {
 
        // Return product
        return a * b;
    }
 
    // Method 2
    // // Multiplication of 3 numbers
    public int Multiply(int a, int b, int c)
    {
 
        // Return product
        return a * b * c;
    }
}
 
// Class 2
// Main class
public class w3oops4 {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Calling method by passing
        // input as in arguments
        Helper s1= new Helper();
        s1.a=2;
        s1.b=4;
        s1.c=7;
       System.out.println(s1.Multiply(s1.a,s1.b));
       System.out.println(s1.Multiply(s1.a,s1.b,s1.c));
    }
}