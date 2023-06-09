//To delete a file in Java, use the delete() method:

import java.io.File;  // Import the File class

public class deletefile {
  public static void main(String[] args) { 
    File myObj = new File("filename.txt"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the file: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
  } 
}

//The output will be:
//Deleted the file: filename.txt