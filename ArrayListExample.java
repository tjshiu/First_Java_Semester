import java.util.*;

public class ArrayListExample
{
   public static void main (String[] args) 
   {
      ArrayList<Integer> array = new ArrayList <Integer> (5);
      array.add (100);
      array.add (200);
      array.add (300);
      System.out.println ("Firt item " + array.get(0));
      int firstValue = array.get(0) + 20;
      System.out.println (firstValue); 
   }
}