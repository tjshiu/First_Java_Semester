import java.util.*;

public class Testing {

   public boolean hello () {
   
      String prompt = "yes";
      if (prompt.equalsIgnoreCase ("yes"))
         return true;
      if (prompt.equalsIgnoreCase ("no"))
         return false;
         
     return true;
}
   
   public static void main (String[] args) {
   System.out.println(hello());
   }
   
   
}
		
 
