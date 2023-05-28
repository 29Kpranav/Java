 /*
Java Wrapper Classes
Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

The table below shows the primitive type and the equivalent wrapper class:

Primitive Data Type	Wrapper Class

byte	Byte
short	Short
int	    Integer
long	Long
float	Float
double	Double
boolean	Boolean
char	Character 

ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid

To create a wrapper object, use the wrapper class instead of the primitive type. To get the value, you can just print the object:
*/
public class wrapClass {
    public static void main(String[] args) {
      Integer myInt = 5;
      Double myDouble = 5.99;
      Character myChar = 'A';
      System.out.println(myInt);  // Or myInt.intValue()   
      System.out.println(myDouble); // Or myDouble.doubleValue()
      System.out.println(myChar); // Or myChar.charValue()  output- 5,5.99,A
    }
}
  

  /*Another useful method is the toString() method, which is used to convert wrapper objects to strings.

In the following example, we convert an Integer to a String, and use the length() method of the String class to output the length of the "string":

Example
public class Main {
  public static void main(String[] args) {
    Integer myInt = 100;
    String myString = myInt.toString();
    System.out.println(myString.length());
  }
}
output - 3
 */