import java.util.*;

public class arrayStuff
{

   public static void main (String[] args)
   {
      Scanner sc = new Scanner (System.in);
      
      int [] values = {3,5, 7, 9, 10};
      int [] scores = new int [12];
      int index;
      
      System.out.println ("First value: " + values[0]);
      System.out.println ("Last Value: " + values[values.length -1]);
      
      System.out.println ("Which integer should be printed? ");
      index = sc.nextInt();
      
      for (index = 0; index<scores.length; ++ index)
      {
         System.out.print ("Enter the score for student. " + scores[index]);
      }
      
   }
}