public class MySortExample
{
   public static void printArray (String message, int[] array)
   {
      System.out.println (message);
      for (int value : array)
         System.out.println (value); 
      System.out.println (); 
   }
   
   public static void sortArray (int[] array)
   {
      //bubblesort
      for (int j = 0; j < array.length-1; j++)
      {
         for (int index = j+1; index < array.length; ++index)
            if (array [j] > array[index])
               {
                  int temp = array[j];
                  array[j] = array [index];
                  array [index] = temp; 
               }
      }
         
      
   }
   
   public static boolean binarySearch (int[] array, int valueToFind)
   {
      int lowIndex = 0; 
      int highIndex = array.length -1;
      int middleIndex = (highIndex + lowIndex) / 2;
      
      while (lowIndex <= highIndex)
      {
         int middleIndex = (highIndex + lowIndex) /2;
         if (array[middleIndex == valueToFind)
            return true; 
         else if (array[middleIndex] > valueToFind)
            highIndex = middleIndex -1;
         else //else if (array[middleIndex < valueToFind)
            lowIndex = middleIndex + 1; 
      }
      return false; 
   }
   
   public static void main (String [] args)
   {
      int [] values = {6, 9, 12, 3, 0, -1, 5, 2, 26, -7, 34, -45, 6, -2, 7};
      printArray ("Initial values ", values); 
      sortArray (values); 
      printArray ("After values ", values);
   }
   
}