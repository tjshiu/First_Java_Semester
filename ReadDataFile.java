import java.util.*; //needed by Scanner
import java.io.*; //needed by File

public class ReadDataFile
{
   public static void main (String[]args) throws FileNotFoundException
                                          //tells the compiler that if the file
                                          //found, just crash
   {
      //File tmpFile = new File ("javafile.txt");
      //Scanner inFile = new Scanner (tmpFile);
      //or
      int value;
      Scanner keyboard = new Scanner(System.in);
//      System.out.print ("Open what file? ");
      String fileName = CS160FileUtils.getOpenFileName ("Select data file");
      
      //did the user actually select a file?
      if (fileName == null)
         System.exit(0); //leave the program
         
//      Scanner inFile = new Scanner (new File ("javafile.txt")); //opens the file
//      String fileName = keyboard.next();
      //String fileName = "javafile.txt";
      Scanner inFile = new Scanner (new File (fileName)); //opens the file     
      
      
      while (inFile.hasNextInt())
      {
         value = inFile.nextInt(); //reads to the first delimiter such as spaces
                                       //delimiter separates data - 
                                       //a good one would be something that could
                                       //not be data!!!!
         System.out.println(value);
      }

 //     int value2 = inFile.nextInt();
 //     System.out.println("The first two values are " + value1 + " and " + value2);

     
      
      inFile.close(); //closes the file 
   }
}