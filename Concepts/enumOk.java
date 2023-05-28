 /*
 public class Main {
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) {
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar);
  }
}
The output will be: MEDIUM 
*/

enum Level {
    LOW,
    MEDIUM,
    HIGH
  }
  
  public class enumOk {
    public static void main(String[] args) {
      Level myVar = Level.MEDIUM;
  
      switch(myVar) {
        case LOW:
          System.out.println("Low level");
          break;
        case MEDIUM:
           System.out.println("Medium level");
          break;
        case HIGH:
          System.out.println("High level");
          break;
      }
    }
  }

  /*
   enum Level {
  LOW,
  MEDIUM,
  HIGH
}

public class Main { 
  public static void main(String[] args) { 
    for (Level myVar : Level.values()) {
      System.out.println(myVar);
    }
  } 
}

   */