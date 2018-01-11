import java.util.*;
import java.io.*;

public class SongList
{
   public static void printSongs (String message, String [] songs)
   {
      System.out.println (message);
      for (String song: songs) 
         if (song != null)
            System.out.println (song);
      System.out.println();
   }
   
   public static void findText (String [] songs)
   {
      Scanner keyboard = new Scanner (System.in);
      System.out.print ("Enter search ");
      String textToFind = keyboard.nextLine();
      while (!textToFind.equals(""))
      {
      /*
         boolean foundSong = false;
         
         for (String song: songs)
            if (songToFind.equalsIgnoreCase(song)) {
               System.out.println ("Found " + songToFind + " in the playlist");
               foundSong = true; 
            }

         if (foundSong == false) //foundSong is still false
         System.out.println ("Unable to Find " + songToFind + " in the playlist");
      */
         int numOfMatches = 0;
         System.out.println ("Songs containing " + textToFind);       
         for (String song: songs)
         {
            if (song != null) //do I have a song or is it null?
            {
               if (song.toLowerCase().contains (textToFind.toLowerCase()))
               {
                  System.out.println(song);
                  numOfMatches++;
               }
            }
               
         }
         if (numOfMatches ==0) //original value, so no matches
            System.out.println ("Unable to find any songs containing " + textToFind);
         else
            System.out.println ("Found " + numOfMatches + " match(es)");
               
         System.out.print ("Enter next song to find ");
         textToFind = keyboard.nextLine();
      }
   }
   
   public static boolean saveSongs (String [] songs, String fileName)
   {
      try {
      PrintWriter writer = new PrintWriter (new FileWriter (fileName));
      for (String song: songs)
         if(song != null)
            writer.println (song);
      writer.close();
      return true;
      }
      catch (Exception e) {
         System.out.println ("Unable to open data file");
         return false;
      }
   }
   
   public static void main (String[] args)
   {
      String[] songs = new String[10];
      songs[0] = "The Who - Squeeze Box";
      songs[1] = "Men Without Hats - Safety Dance";
      songs[2] = "Nena - 99 Balloons";
      songs[3] = "Beach Boys - Surfing in the USA";
      
      printSongs ("initial list", songs);
      
      findText(songs);
      
      String fileName = CS160FileUtils.getSaveFileName("Select data file");
      boolean fileSaved = saveSongs (songs, fileName);
      if (fileSaved = false)
         {
         System.out.println("Unable to find a file.");
         }
   }
   
   
   
}