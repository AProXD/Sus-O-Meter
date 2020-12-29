//imports start
import java.util.Scanner;
import java.util.ArrayList;
//imports end
public class SelectCommands extends Commands{

public static Scanner fetch = new Scanner(System.in); 

   
  /*creating ArrayList of colors start*/
   public static  ArrayList<String> colors = new ArrayList<String>();
   static {
   colors.add("Red");
   colors.add("Blue");
   colors.add("Green");
   colors.add("Pink");
   colors.add("Orange");
   colors.add("Yellow");
   colors.add("Black");
   colors.add("White");
   colors.add("Purple");
   colors.add("Brown");
   colors.add("Cyan");
   colors.add("Lime");
   }
  /*ArrayList of colors end*/
   
   
   public static void userInputLoop(){
     //loop start :)
      while(true){
         System.out.print("enter command: ");
         String input = fetch.next().toLowerCase(); //makes input lowercase (:
         
         //FANCY ELSE/IF STATEMENT START
         switch(input){
            
            case "exit": Exit();
            break;
            
            case "remove": ColorRemove(colors);
            break;
            
            case "list": ColorList(colors);
            break;
            
            case "add": ColorAdd(colors);
            break;
            
            case "credits": Credits();
            break;
            
            case "help": Help();
            break;
            
            case "sus": ColorSus(colors);
            break;
            
            case "mycolor": MyColor();
            break;
            
            case "clear": RemoveAll(colors);
            break;
            
            default: Error("CommandNotFound");
            break;
         }
         //fancy else/if statement end :(
      }
     //loop end :(
      
   }
}