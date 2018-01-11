public class TimeSchedule
{
   public static void main(String [] args)
   {
   
   for (int hour = 8; hour <= 12; hour++) {
      for (int min = 0; min <60; min=min+15) {
      System.out.printf("%2d:%02d\n", hour, min);
      }
   }
   for (int hour = 1; hour <5; hour++)
   {
      for (int min = 0; min <60; min=min+15) {
      System.out.printf("%2d:%02d\n", hour, min);
      }      
   }
   
   System.out.printf("%2d:%02d\n", 5, 0);
   
   
   }
   
}