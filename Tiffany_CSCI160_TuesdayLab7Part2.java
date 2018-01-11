/* Tiffany Shiu
CSCI160 
Sunday October 22nd, 2017
Lab 7 part 2
*/

import java.io.*;
import java.util.*;
import java.lang.*;

public class Tiffany_CSCI160_TuesdayLab7Part2 
{

   public static void main (String[] args) throws FileNotFoundException
   {
   
   Scanner keyboard = new Scanner(System.in);
   System.out.println("Please type a file name.");
   String fileName = keyboard.next();
   //String fileName = "number1.txt";
   
   // Make sure the file exists
   File file = new File(fileName);
   if (!file.exists()) 
   {
         System.out.println("We are sorry. The file does not exist.");
         System.exit(0); //leave the program
   }
   
   float value, max, min, closest, closest2;
   int greater = 0 , less = 0;
   
   Scanner inFile = new Scanner (new File (fileName)); //opens the file     
      
   if (inFile.hasNextFloat())
   {
         value = inFile.nextFloat();
         max = value;
         min = value; 
         closest = value;
         closest2 = 70-value;
         float sum = value;
         int count = 1; 
         float avg=0;
         if (value >= 70)
            greater = greater + 1;
         if (value < 70)
            less = less + 1;
            
         if ((Math.abs(70 - value)) < Math.abs(70-closest))
            closest = value;
         
         if ((70-value >=0) && (Math.abs(70 - value) < Math.abs(70-closest2)))
            closest2 = value; 
         
         while (inFile.hasNextFloat())
      {
         value = inFile.nextFloat(); //reads to the first delimiter such as spaces
                                       //delimiter separates data - 
                                       //a good one would be something that could
                                       //not be data!!!!
                                       
         if (value > max)
            max = value; 
         if (value < min)
            min = value;
            
         sum = sum + value; 
         count = count + 1;
         avg = sum/count;
         
         if (value >= 70)
            greater = greater + 1;
         if (value < 70)
            less = less + 1;
            
         if ((Math.abs(70 - value)) < Math.abs(70-closest))
            closest = value;
            
         if ((70-value >=0) && (Math.abs(70 - value) < Math.abs(70-closest2)))
            closest2 = value; 
            
      }
   System.out.println("The minimum value = " + min);
   System.out.println("The maximum value = " + max); 
   System.out.printf("The average value = %.3f \n", avg);
   System.out.println ("The total number of values = " + count);
   System.out.println ("The total number of values greater than or equal to 70 = " + greater);
   System.out.println("The total number of values less than 70 = " + less);
   System.out.println("The closest value to 70 is = " + closest);
   if (closest2 <0)
      System.out.println("There is no value less than 70.");
   else
      System.out.println("The closest value to 70 and does not go over 70 = " + closest2);
   
   inFile.close();
   
   }
   else 
      System.out.println ("The file has no data.");
      inFile.close();
   
   }
}
