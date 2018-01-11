import java.io.*;
 
public class upper{
public static void main(String t[]){
    System.out.println("Hello, World!!");
    System.out.println("Tiffany Is The Cutest And A Girl   " +
             uppper("tiffany is the cutest and a girl"));
     
}
public static String uppper(String input){
    String output="";
    char temp= input.charAt(0);
    output+= Character.toUpperCase(temp); 
    for (int i = 1; i < input.length(); i++){
        if(input.charAt(i) ==' '){
            output+=input.charAt(i);
            i ++;
            output+=Character.toUpperCase(input.charAt(i));
        }else{
            output+=input.charAt(i);
        }
    }
        return output;  
 
}
     
}   
