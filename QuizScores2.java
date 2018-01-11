import java.util.*;

public class QuizScores2
{
   public static void main (String[] args)
   {
      Scanner keyboard = new Scanner (System.in);
      int studentNum = 1;
      int quizScore;
      int totalPoints = 0;
      int highScore = -1;
      int lowScore = 999;
      double average;
      System.out.print ("How many students took the quiz ");
      int numOfStudents = keyboard.nextInt();
      while (studentNum <= numOfStudents)
      {
         //reason for the loop
         System.out.print ("Enter the quiz score for student " + studentNum + " ");
         quizScore = keyboard.nextInt ();
         totalPoints = totalPoints + quizScore;
         
         if(quizScore > highScore) 
            highScore = quizScore;
         if (quizScore <lowScore)
            lowScore = quizScore;
         
         //average = (double) totalPoints / studentNum
         
         studentNum++;
      }
      if (numOfStudents > 0){
         average = (double) totalPoints / numOfStudents;
         System.out.printf ("Class average %-7.2f\n", average);
         System.out.printf ("High score %-7d\n",  highScore);
         System.out.printf ("Low Score %-7d\n", lowScore);
      }
      /*else
      {
         average = 0;
         System.out.println ("Class average " + average);
      }
      */
     
     /*System.out.printf*"One string with all text and placeholders" (format specificers, 
     one value for each placeholder
     
     with printf we often want to use tables
     
     \n = new line
     
     % totalwidth s
     % totalwidth d
     % totalwidth.placeleftdecimalpoint f
     
     "Placeholders"
     %s - string
     %f - floating point type
     &d - integer types
     
     */
     
   }
   
   
}