import java.util.*;

public class Names
{
   public static void  printSortedContacts(HashMap <String, String> contacts)
   {
      String[] names = new String[contacts.size()];
      int index = 0; 
      for (String contact : contacts.keySet() ) // keySet allows for the keys to be access one
      {
         name[index] = contact;
         index++;
      }
      Array.sort (names);
      System.out.println("\nContact List\n");
      System.out.printf("%-15s %15s\n", "Contact", "Number");
      
      for (String contact : names ) //keySet allows for the keys to be accessed one
      {
         System.out.printf("%-15s %15s \n", contact, contacts.get(contact));
      }
   }
   
   public static void main(String[] args)
   {
      HashMap <String, String> contacts = new HashMap<String, String>(); //data types for the key 
      HashMap <Integer, String> employeeID = new HashMap<Integer, String>(); 
      Scanner keyboard = new Scanner (System.in);
      
      employeeID.put(12, "Nick"); //12 is not an integer, but an int. 
      employeeID.put(42, "Tom"); 
      int id = 42;
      String name = employeeID.get(42); 
      System.out.println("ID " + id + " Name " + name );
     
      contacts.put ("Tom's Office", "777-4107");
      contacts.put("CSci Office" , "777-3337");
      contacts.put("Fred", "746-000");
      contacts.put("Csci Fax", "Fax, really?");
      
      System.out.println("Tom's number: " + contacts.get("Tom's Office"));
      System.out.println("Number of entries: " + contacts.size() ); 
      
      contacts.put("Tom's Office", "701-777-3337");
      
      System.out.print("Enter contact to find = press ENTER to quit: ");
      String contactsToFind = keyboard.nextLine(); 
      
      while (!contactsToFind.equals(""))
      {
         String number = contacts.get (contactsToFind);
         if (number!= null)
            System.out.println("Number for " + contactsToFind + ": " + number);
         
         System.out.print("\nEnter the next contact to find: ");
         contactsToFind = keyboard.nextLine();
      }
      for (String contact: contacts.keySet() ) //keySet allows for the keys to be accessed one at a time
      {
         //System.out.println(contact + " " + contacts.get(contact));
         System.out.printf("%-15s %15s \n", contact, contacts.get(contact)); //(- makes it left justified)
      }
      
      
      
   }
}