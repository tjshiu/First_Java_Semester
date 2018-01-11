import java.util.*;

public class Exam1Review
{
   public static void main(String[] args) 
   {
   //single line comments about code, multiline comments are to start about the file
   //tempC is above freezing (0 degrees)
   /*
      tempC > 0
      response is "yes"
      response.equals("yes")
      reaposne.equalsIgnoreCase("yes")
      response.compareTo("Yes") ==0
      
      type casting - avoid integer division - casting only for that line
      types of error - syntax (easiest and most common), 
         run time - look like we can do it, division by zero. or screw up printf
         logic error - we just did something wrong
         
      sentinal - same value for the type, but invalid for the context = -1
      escape sequences
         \n - new line
         \" = to make a double quote in a quote
         \t- columns for tabs
         
                
   
   */
   
   Scanner sc = new Scanner (System.in);
   int x;
   System.out.println("Please enter a number, and we will see if it is pos, neg, or zero.");
   x = sc.nextInt();
   if (x>0)
      System.out.println("x is positive.");
   else if (x<0)
      System.out.println("x is negative.");
   else
      System.out.println("x is zero.");
   System.out.println("");
   
   int i,j;
   for (i = 0; i <=100; i= i + 20) {
      System.out.println(i);
   }
   System.out.println("");
   
   j = 0;
   while (j<=100){
      System.out.println(j);
      j = j + 20;
   }
   
   
   }
   
}