/* The File class has many useful methods for creating and getting information about files. For example:

Method	             Type	    Description
canRead()	        Boolean	    Tests whether the file is readable or not
canWrite()	        Boolean	    Tests whether the file is writable or not
createNewFile()	    Boolean	    Creates an empty file
delete()	        Boolean	    Deletes a file
exists()	        Boolean	    Tests whether the file exists
getName()	        String	    Returns the name of the file
getAbsolutePath()	String	    Returns the absolute pathname of the file
length()	        Long	    Returns the size of the file in bytes
list()	            String[]    Returns an array of the files in the directory
mkdir()	            Boolean	    Creates a directory 

To create a file in Java, you can use the createNewFile() method. This method returns a boolean value: true if the file was successfully created, and false if the file already exists. Note that the method is enclosed in a try...catch block. This is necessary because it throws an IOException if an error occurs (if the file cannot be created for some reason):*/
 
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
  public static void main(String[] args) {
    try {
      CreateFile myObj = new CreateFile("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    }  catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace(); }
  }
}

//The output will be:
//File created: filename.txt