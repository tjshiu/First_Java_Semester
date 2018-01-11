import java.util.*;

public class ArraysExample2
{
   public static void updateValues (int[] array, int change)
   {
      for (int index = 0; index < array.length; ++index) {
         array [index] = array [index] + change;
      }

   }
   
      public static void updateValues2 (int[] array, int change)
   {
      for (int value: array){
      value = value + change;
      }

   }
   
   public static double calcAverage (int[] array)
   {
      return sumOfArray(array)/(double)array.length;
   }
   
   
   public static int sumOfArray(int[] array)
   {
   //array's are reference types: meaning that they store where the data is at. 
   int sum = 0; 
   for (int index = 0; index < array.length; ++index) {
      sum = sum + array[index];
   }
   
   return sum;
   }
   
   public static int [] createArray (int size)
   {
      int[] topArray = new int[size];
      for (int index = 0; index < topArray.length; ++index)
         topArray[index] = index;
      return topArray;
   }
   
   public static boolean isInArray (int[] array, int valueToFind)
   {
      for (int index = 0; index < array.length; ++index)
      {
         if (array[index] == valueToFind)
            return true;
      }
      return false;
   }
   
      public static boolean isInSortedArray (int[] array, int valueToFind)
   {
      for (int index = 0; index < array.length; ++index)
      {
         if (array[index] == valueToFind)
            return true;
         else if (valueToFind < array[index])
            return false;
      }
      return false;
   }
   
   public static void printArrays (String message, int[] array)
   {
      System.out.println (message);
      for (int value: array)
         System.out.print (value + " ");
         System.out.println("\n");
   }
   
   public static void main (String[] args)
   {
      int[] values1 = {5,6,1,4,10,7,3}; //unsorted array
      int[] values2 = {1,2,3,4,5,6,7,8,9,10}; //sorted array
      int[] values3 = createArray(10);
      
      
      
      System.out.println(isInArray(values1, 10));
      System.out.println(isInSortedArray(values2, 2000));
      
      int total = sumOfArray(values3);
      System.out.println("Total of values3: " + total);
      
 /*     int total = 0;
      for (int index = 0; index < values1.length; ++index) {
         total = total + values1[index];
      }
 */
      
      //updateValues (values1, 2); //counts through the indexes
      updateValues2(values1, 2); // uses the enhanced for loop
 
      total = sumOfArray (values1);
      System.out.println ("Total of values1: " + total );
      int total2 = sumOfArray (values2);
      System.out.println ("Total of values2: " + total2 );
      
      double average = calcAverage(values1);
      System.out.printf("Average for values1: %.3f\n", average);
      
      printArrays("Before Sort" , values1);
      Arrays.sort(values1);
      printArrays("After Sort", values1);
      

   }
}