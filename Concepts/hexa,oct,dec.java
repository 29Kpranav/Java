/*Convert from Binary, Octal or Hex to Decimal using Integer.parseInt(String input, int radix)
Use Integer.parseInt(String input, int radix) to convert from any type of number to an Integer.

String binaryNumber = "10101";
int decimal1 = Integer.parseInt(binaryNumber, 2);
 
System.out.println(binaryNumber + " in Base 10 : " + decimal1);
 
String octalNumber = "456";
int decimal2 = Integer.parseInt(octalNumber, 8);
 
System.out.println(octalNumber + " in Base 10 : " + decimal2);
 
String hexNumber = "ABCD";
int decimal3 = Integer.parseInt(hexNumber, 16);
 
System.out.println(hexNumber + " in Base 10 : " + decimal3);
 
Output:
 
10101 in Base 10 : 21
456 in Base 10 : 302
ABCD in Base 10 : 43981
Convert from Decimal to Binary, Octal or Hex using Integer.toString(int input, int radix)
Use Integer.toString(int input, int radix) to convert from an Integer to any type of base number.

Integer decimal1 = 21;
String binaryNumber = Integer.toString(decimal1, 2);
 
System.out.println(decimal1 + " in Base 2 : " + binaryNumber);
 
Integer decimal2 = 302;
String octalNumber = Integer.toString(decimal2, 8);
 
System.out.println(decimal2 + " in Base 8 : " + octalNumber);
 
Integer decimal3 = 43981;
String hexNumber = Integer.toString(decimal3, 16);
 
System.out.println(decimal2 + " in Base 16 : " + hexNumber);
 
Output:
 
21 in Base 2 : 10101
302 in Base 8 : 456
43981 in Base 16 : abcd
Convert from Decimal to Binary, Octal or Hex using Integer.toXXXString(int)
Integer class does provide lots of unitily methods to be consumed directly. Check out them in java doc.

Integer decimal1 = 21;
System.out.println(decimal1 + " in Base 2 : " + Integer.toBinaryString(decimal1));
 
Integer decimal2 = 302;
System.out.println(decimal2 + " in Base 8 : " + Integer.toOctalString(decimal2));
 
Integer decimal3 = 43981;
System.out.println(decimal3 + " in Base 16 : " + Integer.toHexString(decimal3));
 
Output:
 
21 in Base 2 : 10101
302 in Base 8 : 456
43981 in Base 16 : abcd
/* */