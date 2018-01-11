/* Tiffany Shiu
CSCI160 
Sunday October 22nd, 2017
Lab 7 Part 1
*/

import java.io.*;
import java.util.*;

public class Tiffany_CSCI160_TuesdayLab7 
{

   public static void main (String[] args) 
   {
   
   Scanner keyboard = new Scanner (System.in);
   System.out.println("Please type a file name");
   String fileName = keyboard.next();
   //fileName = "number1.txt";
   File file = new File(fileName);
   if (!file.exists()) 
   {
         System.out.println("We are sorry. The file does not exist.");
         System.exit(0); //leave the program
   }
   
   PrintWriter writer = null;
   
   try {
         writer = new PrintWriter (new FileWriter (fileName));
      }
   catch (Exception e)
      { 
      System.out.println("Can't open the data file - leaving the program");
      System.out.println ("The error message from java - " + e.getMessage() );
      System.exit(0); 
      }
   
   System.out.println("Please type in a double value, and when you are done enter -1!");
   double target = keyboard.nextDouble();
   final double stop = -1;
   if (target != stop)
      writer.println (target);
   if (target == stop)
      System.out.println ("You didn't type any values into the file.");
   while (target != stop)
   {
      System.out.println("Please type in a double value, and when you are done enter -1!");
      target = keyboard.nextDouble();
      if (target != stop)
         writer.println (target);
      if (target == stop)
         System.out.println ("You are done entering values");
   }

   writer.close();
   

   
}
}
