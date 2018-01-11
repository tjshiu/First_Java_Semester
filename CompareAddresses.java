public class CompareAddresses
{
   public static void main (String[] args)
   {
      String addr1 = "   3950 Campus Road";
      String addr2 = " 7000 Campus Road";
      
      addr1 = addr1.trim();
      addr2 = addr2.trim();
      
      
      int blankAt = addr1.indexOf(" ");
      String tempStr = addr1.substring(0, blankAt); //sbustring ends the last one afterwards
      int addr1Num = Integer.parseInt(tempStr);
      //double dblValue = Double.parseDouble(tempStr);
      
      blankAt = addr2.indexOf(" ");
      tempStr = addr2.substring (0, blankAt); 
      int addr2Num = Integer.parseInt(tempStr);

   
      if (addr1Num > addr2Num)
         System.out.println (addr1 + " is greater than " + addr2);
      else if (addr2Num > addr1Num)
         System.out.println (addr2 + " is greater than " + addr1);
      else 
         System.out.println (addr1 + " the same as " + addr2)double [
         
      double [] labSores = new double []   
         
        
   }
}