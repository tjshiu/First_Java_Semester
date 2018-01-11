import java.util.*;

public class FindGrade
{
   public static void main (String [] args)
   {
      Scanner keyboard = new Scanner (System.in);
      String grade = "Z";
      System.out.print ("Enter the class percentage ");
      double percentage = keyboard.nextDouble();
      
      if (percentage >= 90)
         grade = "A";
      else if (percentage >= 80)
         grade = "B";
      else if (percentage >=70)
         grade = "C";
      else if (percentage >=60)
         grade = "D";
      else //using this else means that do not need initilize grade (no need for grade = "z")
         grade = "F";
      System.out.println ("Your letter grade is " + grade +".");
   
   //if you have n options, you will have n-2 else if's
   }
   
}