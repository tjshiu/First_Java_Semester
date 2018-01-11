import java.util.*;

public class WhileExample2
{
   public static void main (String[] args)
   {
      Scanner keyboard = new Scanner (System.in);
      int counter = 1;
      System.out.print ("How high should the program count? ");
      int endValue = keyboard.nextInt();
      while (counter <=endValue)
      {
         //reason for the loop
         if (counter % 10000 ==0)
            System.out.println (counter);
         
         counter++;
     }
     
   }
   
   
}