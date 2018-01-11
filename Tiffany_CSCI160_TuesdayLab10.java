/* Tiffany Shiu
CSCI160
Sunday November 12th, 2017
Lab 10 - Grades
*/

import java.util.*;

public class Tiffany_CSCI160_TuesdayLab10 
{
   public static final int num_labs = 12; 
   public static final int no_score = -1; 
   
   public static void initializeArray (int[]array) 
   {  //sets values of new arrays to -1
      for (int i = 0; i < array.length; i++)
         array [i] = no_score;
   }
   
   public static void setScore (int [] array, int labnumber, int score)
   {
      array [labnumber -1] = score; 
   }
   
   public static int totalPoints  (int [] array)
   {
      int sumOfEarnedPoints = 0; 
      for (int i = 0; i < array.length; i ++)
         if (array[i] != -1)
            sumOfEarnedPoints = sumOfEarnedPoints + array[i];
      return sumOfEarnedPoints;
   }
   
   public static int totalPossible (int [] array)
   { 
      int totalPossPoints = 0; 
      for (int i = 0; i < array.length; i ++)
         if (array[i] != -1)
            totalPossPoints = totalPossPoints + 10;
      return totalPossPoints;     
   } 
   
   public static double getLabAverage (int [] array)
   {
            
     if (totalPossible (array) == 0)
     {
      return no_score;
     }
     
     double average = (totalPoints (array)/ (double) totalPossible (array))*10;
     return average;     
   }
   
   public static double getOverallAverage (int [] inClass, int [] weekly)
   {
      int totalClassPointsEarned = totalPoints(inClass) + totalPoints (weekly); 
      int totalClassPossPoints = totalPossible (inClass) + totalPossible (weekly); 
      
      if (totalClassPossPoints == 0)
            return no_score;     
      
      double overallAverage = (totalClassPointsEarned / (double) totalClassPossPoints) *10;
      return overallAverage;
      
   }
   
   public static void printScores (int [] array)
   {
      System.out.println ("Labs    Scores");
      for (int i = 0; i < array.length; i++)
      {  
         if (array[i] != -1)
         {
            System.out.println ((i + 1) + "       " + array[i]);
         } 
         else
            System.out.println ((i + 1)); 
         
      }
   }
   
   
   public static void main (String args[])
   {
      Scanner keyboard = new Scanner (System.in); 
      int [] inClassLabs = new int [num_labs];
      int [] weeklyLabs = new int [num_labs];
      
      initializeArray (inClassLabs);
      initializeArray (weeklyLabs);
      
      setScore(inClassLabs, 1, 10);
      setScore (inClassLabs, 2, 9);
      
      System.out.println("Total points in Class = " + totalPoints(inClassLabs));
      System.out.println("Total points weekly labs = " + totalPoints(weeklyLabs));
      
      System.out.println("Total possible points in Class = " + totalPossible(inClassLabs));
      System.out.println("Total possible points weekly labs = " + totalPossible(weeklyLabs));

      System.out.println("In class lab average = " + getLabAverage(inClassLabs));
      System.out.println("weekly lab average = " + getLabAverage(weeklyLabs));
      
      
      System.out.println("the overall average = " + getOverallAverage(inClassLabs, weeklyLabs));
      
      System.out.println ("In class lab scores:");
      printScores(inClassLabs); 

   
   }
   
}