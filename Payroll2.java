import java.util.*;

public class Payroll2
{
   public static double calcWeeklyPay (double hourlyWage, double hoursWorked)
   {
      double weeklyPay;
      if(hoursWorked <= 40)
         weeklyPay = hoursWorked*hourlyWage;
      else //if (hoursWorked >40)
      {         
         weeklyPay = (hoursWorked-40)*hourlyWage*1.5 + 40*hourlyWage;
      }
      
      return weeklyPay;
   
   }
   
   /*public static double getHourlyWage()
   {
      Scanner keyboard = new Scanner (System.in);
      System.out.print ("Enter the hourly wage "); 
      double hourlyWage = keyboard.next.Double():
      while (hourlyWage <= 0)
      {  
         System.out.print ("Please enter a valid hourly wage");
         hourlyWage = keyboard.nextDouble();
      }
      return hourlyWage;
   }
   */
      public static double getPositiveDouble(String prompt)
   {
      Scanner keyboard = new Scanner (System.in);
      System.out.print (prompt ); 
      double dblValue = keyboard.nextDouble();
      while (dblValue <= 0)
      {  
         System.out.print ("Please enter a positive value: ");
         dblValue = keyboard.nextDouble();
      }
      return dblValue;
   }
   
   public static void main (String[] args)
   {
      //variable declerations
      //start with a type - we will sneak in processing later on (string, char, and boolean)
      double hoursWorked, hourlyWage, weeklyPay = -1;
      //comma separated list - is what we see above, we must tell java about this
      String employeeName;
      Scanner keyboard = new Scanner (System.in);
      
      System.out.print ("What is the employee name? ");
      employeeName = keyboard.next(); //"Sean"
          
      //System.out.print ("Enter the hourly wage for " + employeeName + ": " );
      //hourlyWage = keyboard.nextDouble(); 
      hourlyWage = getPositiveDouble ("Please enter the hourly wage: ");
      
      //System.out.print ("Enter the hours worked for " + employeeName + ": " );
      //hoursWorked = keyboard.nextDouble(); //30.13
      hoursWorked = getPositiveDouble("Please enter hours worked for " + employeeName + ": ");
      weeklyPay = calcWeeklyPay (hourlyWage, hoursWorked);
         //purely positional!!!!
      
      /*
      if(hoursWorked <= 40)
         weeklyPay = hoursWorked*hourlyWage;
      else //if (hoursWorked >40)
      {         
         weeklyPay = (hoursWorked-40)*hourlyWage*1.5 + 40*hourlyWage;
      }

      */
      System.out.printf ("Weekly Pay is $ %.2f \n", weeklyPay);
      System.out.println ("Weekly pay for " + employeeName);
      
    


   }

}