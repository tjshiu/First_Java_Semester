/*
Tiffany Shiu
CSCI 160
December 5th, 2017
Lab 11
*/

import java.util.*;
import java.io.*;

public class Tiffany_CSCI160_TuesdayLab11 
{

   public static void fillHashMap (String fileName, HashMap <Integer, String> birthdays) throws FileNotFoundException
   {
      int key; 
      String name;
      int index; 
      Scanner keyboard = new Scanner(System.in);
      File file = new File (fileName);
      
      while (!file.exists()) {
         System.out.println("File does not exist. Please try again."); 
         fileName = keyboard.nextLine();
         file = new File (fileName);
      }
      
      Scanner inFile = new Scanner (new File (fileName)); //opens the file
      
      while (inFile.hasNextLine()) {
         String line = inFile.nextLine(); 
         birthdays.put(Integer.parseInt(line.split(": ")[1]), line.split(": ")[0]);
      }
   }
   
   public static Boolean inHashMap (int day, HashMap <Integer, String> birthdays) {
      String person = birthdays.get(day);
      if (person != null) {
         return true;
      }
      
      return false;
   }

   public static void main (String[] args) throws FileNotFoundException {
      Scanner keyboard = new Scanner(System.in);
      HashMap<Integer, String> birthdays = new HashMap<Integer, String>(); 
      
      //Display the menu
      System.out.println("What would you like to do?");
      System.out.println("   1. Open a data file"); 
      System.out.println("   2. Add new names");
      System.out.println("   3. Search by date");
      System.out.println("   4. Display all birthdays for the month");
      System.out.println("   5. Exit Program");
      System.out.println("");
      System.out.println("Your choice?");
      int choice = keyboard.nextInt();
      String fileName = "";
      
      while (true) {
      
         if (choice == 1) {         
            System.out.println("What is the file that you want to open?"); 
            fileName = keyboard.next(); 
            
            fillHashMap(fileName, birthdays); 
             
         }
      
         if (choice == 2) {
            System.out.print("Name to add: ");
            String person = keyboard.next();
            System.out.println("Please type the day of the Birthday");
            System.out.print("Date to add: ");
            int day = keyboard.nextInt(); 
            
            if (inHashMap(day, birthdays)) {
               System.out.println("This date is already taken. Please try again with a different date");
            } else { 
               System.out.println("Great! the birthday is not taken.");
               birthdays.put(day, person); 
               System.out.println(person + " has been added to the list!");
            }
         }
         
         if (choice == 3) { //searches for the day and returns the birthday person
            System.out.print("Day you would like to search?" ); 
            int search = keyboard.nextInt(); 
            
            while ((inHashMap(search, birthdays) == false) && search != 0) {
               System.out.println("This date is empty. Please try again"); 
               search = keyboard.nextInt();
            }
            
            System.out.println("The searched day of " + search + " is for " + birthdays.get(search));
         }
         
         if (choice == 4) {//prints out all the birthdays
            for (Integer birthday : birthdays.keySet()) {
               System.out.println(birthdays.get(birthday) + ": " + birthday);
            }
         }
         
         if (choice == 5) {
            PrintWriter writer = null;
            try {
               writer =  new PrintWriter (new FileWriter (fileName));
            } catch (Exception e) {
               System.out.println("Cannot open file and write to it");
               System.exit(0);
            }
            
            for (Integer birthday : birthdays.keySet()) {
               writer.println(birthdays.get(birthday) + ": " + birthday);
            }
            writer.close(); 
         
            System.exit(0); 
         }
      
         System.out.println();
         System.out.println("What would you like to do?");
         System.out.println("   1. Open a data file"); 
         System.out.println("   2. Add new names");
         System.out.println("   3. Search by date");
         System.out.println("   4. Display all birthdays for the month");
         System.out.println("   5. Exit Program");
         System.out.println("");
         System.out.println("Your next choice?");
         choice = keyboard.nextInt();
      }
   
   
   }
}