import java.util.*; //use something that java has provided for us.. always before public class

public class FindLabAverage
{
   public static void main (String[] args)
   {
      //to get info from the user- from the keyboard
      Scanner keyboard = new Scanner (System.in);
      
      System.out.print ("What is your name? ");
      String name = keyboard.next();
      
      System.out.print ("What is your gpa? ");
      double gpa = keyboard.nextDouble();
      
      int lab1Score;
      System.out.print ("What is your first lab score? ");
      lab1Score = keyboard.nextInt();
      
      System.out.print ("What is your second lab score? ");
      int lab2Score = keyboard.nextInt();
      
      double average = (double)(lab1Score +lab2Score) /2 ;
      System.out.println ();
      System.out.println ("Information for " + name);
      System.out.println ("Lab Average: " + average);
      
      double change = 5.17;
      int dollars = (int) change;
      System.out.println ("Change: " + change);
      System.out.println ("Dollars: " + dollars);
      
    
   }
}   