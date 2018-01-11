import java.util.*;

public class StringCompare2
{
   public static void main(String[] args)
   {
      int x=1, y=1;
      String s1, s2;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println ("Setting the first string to \"Tom\"");
      s1 = "Tom";
      System.out.print ("Enter the second string ");
      s2 = keyboard.next();
      
      if (x < y)
         System.out.println ("x is less than y");
      else if (x>y)
         System.out.println ("x is greater than y");
      else
         System.out.println("x is equal to y");
      
      System.out.println(" ");
      
      //if (s1.equals(s2) == false) or if (!(s1.equals(s2)))
      if (s1.equalsIgnoreCase(s2)) // or if (s1.equals(s2) == true)
         System.out.println ("S1 is the same as S2");
      else
         System.out.println ("S1 is not the same as S2");
         
      System.out.println("");
         
      // Nothing is less than something
      if (s1.compareTo(s2) <0)
         System.out.println("s1 is less than s2");
      else if (s1.compareTo(s2) >0)
         System.out.println("s1 is greater than s2");
      else // or else if (s1.compareTo(s2) == 0)
         System.out.println("s1 is equal to s2");      

   }


}