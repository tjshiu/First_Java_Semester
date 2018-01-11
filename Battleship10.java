import java.util.*;

public class Battleship10
{
   public static final int HIT = 1; 
   public static final int MISS = 2; 
   public static final int NO_GUESS = 0; 
   
   public static void printGrid(HashMap <Character, int[]> grid)
   {
      System.out.print("     "); 
      
      for (int index = 1; index <=10; ++index) {
      System.out.printf("%3d ", index);
      }
      System.out.println();
      for (char letter = 'A'; letter <= 'J'; ++letter) 
      {
         System.out.print ("  " + letter + "  |");
         for (int index = 0; index < 10; ++index)
         {
            if (grid.get(letter)[index] == NO_GUESS)
               System.out.print("   |");
            else if (grid.get(letter)[index] == HIT)
               System.out.print("  X|");
            else
               System.out.print("  0|");
         }
         System.out.println();
      }
   }
   
   public static void addShip (HashMap <String, HashMap<String, Character>> ships, 
                                String ship, String startLocation, String endLocation) {
      ships.put(ship, new HashMap <String, Character>()); 
      ships.get(ship).put("startLocation", startLocation.charAt(0)); 
      ships.get(ship).put("endLocation", endLocation.charAt(0)); 
      ships.get(ship).put("startNumber", startLocation.charAt(1)); 
      ships.get(ship).put("endNumber", endLocation.charAt(1)); 


   }
   
   public static boolean guessHitShip (HashMap <String, HashMap <String, Character>> ships, String guess)
   {
      char letter = guess.charAt(0); 
      char number = guess.charAt(1); 
      for (String ship: ships.keySet())
      {
         ships.get(ship);
      }
      return true; 
   }
   
   
   public static void main (String[] args)
   {
      HashMap <Character, int[]> myGuesses = new HashMap<Character, int[]>();
      for (char letter = 'A'; letter <= 'J'; ++letter) {
         myGuesses.put (letter, new int[10]); //create an array into the object key)
         
         HashMap <String, HashMap<String, Character>> ships = new HashMap <String, HashMap <String, Character>>();
         addShip (ships, "Destroyer", "B1", "E1");
         addShip (ships, "Carrer","F4", "F8");
         
         printGrid(myGuesses);
      }
          
   }
}