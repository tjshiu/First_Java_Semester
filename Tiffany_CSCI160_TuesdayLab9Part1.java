/*Tiffany Shiu
CSCI160
Sunday November 4th, 2017
Lab 9 part 1 (Writing files)
*/

import java.util.*;
import java.io.*;


public class Tiffany_CSCI160_TuesdayLab9Part1
{
   public static double [] createArrayList (String numberList) {
      String [] numbers = numberList.split(" ");
      double [] dblnumbers = new double [numbers.length]; //assigning size of the array
      for (int i = 0; i < dblnumbers.length; i++)
         dblnumbers [i] = Double.parseDouble(numbers [i]);
         
      return dblnumbers;
   }
   
   public static void writeToAFile (String fileName, double [] array) throws IOException
   {

      PrintWriter writer = new PrintWriter (new FileWriter (fileName));
      
      
      for (int i = 0; i < array.length; i++) 
      {
         writer.println(array[i]);
      }
      
      System.out.println("File writing to " + fileName + " is complete!");
      
      writer.close();
   }
   
   
   
   public static void main (String [] args) throws IOException
   {
   Scanner keyboard = new Scanner(System.in);
   System.out.println("Please enter some scores, separated by space");
   String numberstr = keyboard.nextLine();
   
   System.out.println("Enter a file name");
   String fileName = keyboard.nextLine();
   
   if (fileName == null)
      System.exit(0); //leave the program
      
   
   writeToAFile (fileName, createArrayList(numberstr));
  
   
   System.out.println("Would you like to create another file? yes or no?");
   String anotherFile = keyboard.nextLine();


      while (anotherFile.equalsIgnoreCase("yes"))
      {
         System.out.println("Please enter some scores, separated by space");
         numberstr = keyboard.nextLine();
         
         System.out.println("Enter a file name");
         fileName = keyboard.nextLine();
         
 
         
         writeToAFile (fileName, createArrayList(numberstr));
         
         System.out.println("Would you like to create another file? yes or no?");
         anotherFile = keyboard.nextLine();
         
     }

         
         
   
   


   
   }
}