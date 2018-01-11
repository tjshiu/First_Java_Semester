import java.util.*;

public class MethodExample
{
   /* there are method headers or method bodies
   public (or private)
   static -> always use in Java
   return type, if any
   method name (parameters, if any)
      parameters are aa way of a method to ask a question
   method header
   {
   //body of method
   }
   
   nameing rules - no reserved words, a-z, 0-9, _, first character cannot be a digit, 
      case specific
      -suggested rules - camel case, be descriptive
      
   Scope has something where things exist
   
   */
   public static double areaOfCircle(double radius)
   {
      double area = Math.pow (radius,2)*Math.PI;
      return area;
      //System.out.printf("The area is %.5f", area);
      //System.out.println("");
   }
   
   public static void main (String[] args)
   {
      Scanner keyboard = new Scanner (System.in);
      System.out.print ("Enter the radius of the circle ");
      double radius = keyboard.nextDouble();
   
      double area = areaOfCircle(radius);
      System.out.println ("The area is " + area);
      
      area = areaOfCircle(10);
      System.out.println("The area is " + area);
   
   }
}