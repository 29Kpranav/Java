/*
LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
DateTimeFormatter	Formatter for displaying and parsing date-time objects
*/

  import java.time.LocalDate; // import the LocalDate class
  //import java.time.LocalTime; // import the LocalTime class
  //import java.time.LocalDateTime; // import the LocalDateTime class

  //import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class *


public class date {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); // Create a date object
    //LocalTime myObj = LocalTime.now();
    //ocalDateTime myObj = LocalDateTime.now();

    //DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); *
    //String formattedDate = myDateObj.format(myFormatObj);
    
    System.out.println(myObj); // Display the current date
  }
}

/* .ofpattern --> yyyy-MM-dd	"1988-09-29"	
                  dd/MM/yyyy	"29/09/1988"	
                  dd-MMM-yyyy	"29-Sep-1988"	
                  E,MMM dd yyyy	"Thu, Sep 29 1988" 
*/  