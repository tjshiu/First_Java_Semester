/* Tiffany Shiu
CSCI160 
Tuesday November 14th, 2017
Lab Test 2
*/

import java.util.*;

public class Tiffany_CSCI160_TuesdayLabTest2
{
   public static int count70OrGreater (int[] data) 
   {
      int count = 0;
      for (int i = 0; i<data.length; i++)
         if (data[i] >=70)
            count = count + 1; 
      
      return count; 
   }
   
   public static void updateScores (int[] data)
   {
      for (int i = 0; i<data.length; i++)
      {
         data[i] = data[i] + 3; 
      }
   }
   
   public static boolean hasPerfectScore (int[] data)
   {
      for (int i = 0; i<data.length; i++)
         if (data[i] >=100)
            return true; 
            
      return false; 
   }
   
   public static void main (String[] args)
   {
      //scanner add
      Scanner keyboard = new Scanner (System.in); 
      
      //declare arrays
      int [] array1 = {67,78,89,97,45};
      int [] array2 = {45,100,75,32,99,66,82};
      int [] array3 = new int [6];
      
      //fill array3
      System.out.println("Please enter the 6 quiz scores for the last list."); 
     
      for (int i = 0; i<array3.length; i++)
      {
         array3[i] = keyboard.nextInt(); 
         
         while (array3[i] <0) { //if array3 is negative
            System.out.println ("You inputed an invalid number. It's negative. Please try again."); 
            array3[i] = keyboard.nextInt(); 
         }
      } 
      
      System.out.println("The number of values in array1 that are greater than or equal to 70 are: " + count70OrGreater(array1));
      System.out.println("The number of values in array2 that are greater than or equal to 70 are: " + count70OrGreater(array2));
      System.out.println("The number of values in array3 that are greater than or equal to 70 are: " + count70OrGreater(array3));
      System.out.println(" "); 
      System.out.println("Any perfect scores BEFORE the update?"); 
      System.out.println(" "); 
      System.out.println("At least One Perfect score in array1: " + hasPerfectScore (array1)); 
      System.out.println("At least One Perfect score in array2: " + hasPerfectScore (array2));
      System.out.println("At least One Perfect score in array3: " + hasPerfectScore (array3));
      
      updateScores(array1); 
      updateScores(array2); 
      updateScores(array3); 
      
      
      System.out.println(" "); 
      System.out.println("The perfect scores AFTER the update?"); 
      System.out.println(" "); 
      System.out.println("At least One Perfect score in array1: " + hasPerfectScore (array1)); 
      System.out.println("At least One Perfect score in array2: " + hasPerfectScore (array2));
      System.out.println("At least One Perfect score in array3: " + hasPerfectScore (array3));
   }
   
   
}