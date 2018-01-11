/*
Tiffany Shiu
CSCI160
December 5, 2017
Lab Final
*/

import java.util.*;
import java.io.*;

public class Tiffany_CSCI160_Tuesday_LabFinal {

   public static int count (int[] intArray, int valueToFind) {
      int count = 0; 
      
      for (int i = 0; i < intArray.length; i++) {
         if (intArray[i] == valueToFind) {
            count++;
         }
      }
      
      return count;
   }
   
   public static int inRange (int[] intArray, int lowerLimit, int upperLimit) {
      int between = 0; 
      
      for (int i = 0; i < intArray.length; i++) {
         if (intArray[i] >= lowerLimit && intArray[i] <= upperLimit) {
            between++;
         }
      }
      
      return between;
   }
   
   public static boolean isInAscOrder(int [] intArray) {
      for (int i = 0; i < intArray.length -1; i++) {
         if (intArray[i] > intArray[i+1]) {
            return false;
         }
      }
      
      return true;
   }
   
   public static int replace (int[] intArray, int currentValue, int newValue) {
      int replaceCounts = 0; 
   
      for (int i = 0; i < intArray.length; i++) {
         if (intArray[i] == currentValue) {
            intArray[i] = newValue;
            replaceCounts++;
         }
      }
      
      return replaceCounts;
   }
   
   public static void writeToFile (String filename, int [] intArray) {
      if (filename == null) {
         System.out.println("File name does not exist"); 
         System.exit(0); 
      }
      
      PrintWriter writer = null; 
      
      try {
         writer = new PrintWriter (new FileWriter (filename));
      }
      catch (Exception e) {
         System.out.println ("Can't open the data file. leaving the program");
         System.exit(0); 
      }
      
      Scanner keyboard = new Scanner (System.in); 
      for (int i = 0; i < intArray.length; i++) {
         writer.println (intArray[i]); 
      }
      
      writer.close();
   }
   
   public static void main (String[] args) throws FileNotFoundException {
      Scanner keyboard = new Scanner (System.in); 
      
      Scanner inFile = new Scanner (new File ("inputs.txt"));  //opens the file
      
      String line = inFile.nextLine(); 
      int[] newArray = new int[10];
      for (int i = 0; i < newArray.length; i++) {
         newArray[i] = Integer.parseInt(line.split(":")[i]);
      }
         
      
      inFile.close(); //closes the file
      
      //Count the number of times value to find is within the array
      System.out.println("Please enter a value to find within the array"); 
      int valueToFind = keyboard.nextInt();
      int occurence = count(newArray, valueToFind); 
      System.out.println("The Number " + valueToFind + " occurs in the array " + occurence + " time(s).");
      
      //count the number of times the value is within the range
      System.out.println("Please enter a lower limit for a range"); 
      int lower = keyboard.nextInt();
      System.out.println("Please enter a higher limit for a range"); 
      int higher = keyboard.nextInt();
      
      while (higher <= lower) {
         System.out.println("Invalid Higher, please try again.");
         higher = keyboard.nextInt();
      }
      int inRangecount = inRange(newArray, lower, higher);
      System.out.println("The number of values in the range is " + inRangecount); 
      
      //boolean for if each item in the array is less than or equal to the immediately foolllowing item in the array
      System.out.println();
      System.out.println("Are all the array values in ascending order?"); 
      System.out.println("     " + isInAscOrder(newArray)); 
      
      //replace = replaces each occurences of currentValue in the array with newValue and returns the number of replacements made
      System.out.println();
      System.out.println("Please enter a a value you would like to replace"); 
      int current = keyboard.nextInt();
      System.out.println("Please enter the value replacing that value"); 
      int newValue = keyboard.nextInt();
      int replaceCounts = replace(newArray, current, newValue); 
      System.out.println("The number of replacements with " + current + " to " + newValue + " total to " + replaceCounts); 

      //write to a newFile
      System.out.println("Please enter a fileName to write to the new array."); 
      String fileName = keyboard.next(); 
      writeToFile(fileName, newArray); 
      
   }
}