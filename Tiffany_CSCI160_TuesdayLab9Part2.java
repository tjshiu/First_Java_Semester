/*Tiffany Shiu
CSCI160
Sunday November 4th, 2017
Lab 9 part 2 (Writing files)
*/

import java.util.*;
import java.io.*;
import java.lang.*;


public class Tiffany_CSCI160_TuesdayLab9Part2
{

   public static int countArrayList (String fileName) throws FileNotFoundException
   {
      
      
      File file = new File (fileName);
      if (!file.exists()) {
         System.out.println("Sorry this file does not exist");
         System.exit(0); //leave the program
      }
      
      
      Scanner inFile = new Scanner (new File (fileName)); //opens the file  
      
      int count = 0;
      if (inFile.hasNextFloat()) 
      {
         while (inFile.hasNextFloat())
         {
            count = count + 1; 
            float value = inFile.nextFloat();
         }
      }
      else {
         System.out.println ("This file has no data");
         System.exit(0); // leave the program
      }
      
      return count;
   }
   
   public static double [] fileArray (String fileName, int count) throws FileNotFoundException {
      File file = new File (fileName);
      if (!file.exists()) {
         System.out.println("Sorry this file does not exist");
         System.exit(0); //leave the program
      }
      
      
      Scanner inFile = new Scanner (new File (fileName)); //opens the file  
      
      //create array
      double [] fileArray = new double [count];
      
      if (inFile.hasNextFloat()) 
      {
         while (inFile.hasNextFloat())
         {
            for (int i = 0; i < fileArray.length; i++)
            {
               fileArray [i] = inFile.nextFloat();
            }
         }
      }
            
      return fileArray;
   }

   public static double largestScore (double [] array) 
   {
      double largest = array[0];
      
      for (int i = 0; i < array.length ; i ++)
      {            
         if (array [i] > largest)
            largest = array [i];
      }
      
      return largest;
   }
   
   public static double smallestScore (double [] array) 
   {
      double smallest = array[0];
      
      for (int i = 0; i < array.length ; i ++)
      {            
         if (array [i] < smallest)
            smallest = array [i];
      }
      
      return smallest;
   }
   
   public static double averageScore (double [] array) 
   {
      double average = 0, sum = 0;
      
      for (int i = 0; i < array.length ; i ++)           
         sum = sum + array[i];

      average = sum / (array.length - 1);
      
      return average;
   }
   
   public static double [] matching (double [] array, double lower, double upper)
   {
      int count = 0; 
      for (int i = 0; i < array.length; i ++)
      {
         if ((array [i] <= upper) && (array [i] >= lower))
            count = count + 1;
      }
      
      double [] matched = new double [count];
      if (count > 0)
      {
         int j = 0; 
         for (int i = 0; i < array.length; i ++)
         {
            if ((array [i] <= upper) && (array [i] >= lower))
            {
               matched [j] = array [i];
               j= j+1; 
            }
            
         }
      }
      else {
         System.out.println ("No values mathced up in your bounds!");
         System.exit (0); 
      }
        
      return matched;
   }
   
   public static void main (String [] args) throws FileNotFoundException
   {
      Scanner keyboard = new Scanner (System.in);
      System.out.println("Please type a file that we will use.");
      //String fileName = "scores1";
      String fileName = keyboard.nextLine();
      
      int arrayCount = countArrayList(fileName);
      double [] array = fileArray (fileName, arrayCount);
      
      System.out.println ("The Largest Score: " + largestScore(array));
      System.out.println ("The Smallest Score: " + smallestScore(array));
      System.out.printf ("The average Score: %.2f \n" , averageScore(array));
      System.out.println("");
      
      System.out.println ("Let's look for some values.");
      System.out.println("Enter the lower limit: ");
      double lower = keyboard.nextDouble();
      
      System.out.println("Enter the upper limit: ");
      double upper = keyboard.nextDouble();
      
      while (upper < lower)
      {
         System.out.println ("Sorry your upper is not above the lower, please try again.");
         upper = keyboard.nextDouble();
      }
      
      double [] matchArray = matching(array, lower, upper); 
      
      System.out.println ("Here are your matched values");

      for (int i = 0; i < matchArray.length; i ++)
      {
         System.out.println (matchArray [i]); 
      }
   
   }
}