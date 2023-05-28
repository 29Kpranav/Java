 /*
 This will generate an error, because myNumbers[10] does not exist.

public class Main {
  public static void main(String[ ] args) {
    int[] myNumbers = {1, 2, 3};
    System.out.println(myNumbers[10]); // error!
  }
}
The output will be something like this:

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
        at Main.main(Main.java:4)
         */

        public class trycatch {
            public static void main(String[ ] args) {
              try {
                int[] myNumbers = {1, 2, 3};
                System.out.println(myNumbers[10]);
              } catch (Exception e) {
                System.out.println("Something went wrong.");  //output
              }
              finally {   //<--
                System.out.println("The 'try catch' is finished.");  //The finally statement lets you execute code, after try...catch, regardless of the result
              }
            }
          }
          //The output will be:
          //Something went wrong.
          //The 'try catch' is finished.