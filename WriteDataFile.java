import java.io.*;
import java.util.*;

public class WriteDataFile
{
   public static void main(String[]args) 
   {
      String fileName = "javafile.txt";
      if (fileName == null)
         System.exit(0);
      else
         System.out.println ("User slected -> " + fileName);
      PrintWriter writer = null;
      //FileWriter fw = new FileWriter (fileName);
      //PrintWriter Writer = new PrintWriter (fw);
      //or 
      try { //don't crash. We will deal with this
         writer = new PrintWriter (new FileWriter (fileName));
      }
      catch (Exception e)
      { //Here we put the code that run IF something in the try block failed
      System.out.println("Can't open the data file - leaving the program");
      System.out.println ("The error message from java - " + e.getMessage() );
      System.exit(0); //leave the program
      }
      
      Scanner keyboard = new Scanner (System.in);
      System.out.print ("How many numbers should be written to the file? ");
      int target = keyboard.nextInt();
      
      for (int i = 1; i <= target; i++)
         writer.println (i);
         
      writer.close();
      
   }
}