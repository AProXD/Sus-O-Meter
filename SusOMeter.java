import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class SusOMeter{
   public static void main(String[] args){
	Random rand = new Random();
      String CommandList = "===COMMAND LIST===\n\"color\" to get a color that is acting sus\n\"col\" to choose your color\n\"rem\" to remove a color\n\"exit\" to exit program\n\"help\" to get list of commands\n==================";
      
      ArrayList<String> colors = new ArrayList<String>();
         colors.add("Yellow");
         colors.add("Orange");
         colors.add("Red");
         colors.add("Blue");
         colors.add("Cyan");
         colors.add("Purple");
         colors.add("Pink");
         colors.add("Lime ");
         colors.add("Green");
         colors.add("White");
         colors.add("Brown"); 
         colors.add("Black");
     String[] SusMsg = {" is acting mad sus", " is " + rand.nextInt(100)+ "% sus", " is very sus", " is supa sus", " is sus af", " is da imposter", " is a poopoohead"};
      
      int r;
      int Cnumb = rand.nextInt(colors.size());
      Scanner fetch = new Scanner(System.in);
      System.out.println("o|===SUS-O-METER===|o");
      System.out.println("type anything to start: ");
      fetch.nextLine();
      System.out.println(CommandList);
      while(true){      
         System.out.println("enter command:");
         String input = fetch.next();
            
         switch(input){
            
            //------------- COMMAND START (rem COMMAND)-------------//
            case "rem":{
               for(int i = 0; i < colors.size(); i++){
                  System.out.println(i + ":" + colors.get(i));
               }
               System.out.println("enter number of color you want to remove: ");
               int ReNum = fetch.nextInt();
               System.out.println(colors.get(ReNum) + " was banned from the lobby");
               colors.remove(colors.get(ReNum) );
               break;  
            }
            
            //------------- COMMAND END (rem COMMAND)-------------//
            
            //------------- COMMAND START (col COMMAND)-------------//   
            case "col":{
               System.out.println("===list of colors===");
               
               for(int i = 0; i < colors.size(); i++){
                  System.out.println( i + ": " + colors.get(i));
               }
               System.out.println("==================");
               System.out.println("enter your color number:");
               Cnumb = fetch.nextInt();
               System.out.println("You are " + colors.get(Cnumb));
               break;
            }
            //------------- COMMAND END (col COMMAND)-------------//
            
            //------------- COMMAND START (color COMMAND)-------------//   
            case "color":
               r = rand.nextInt(colors.size());
               if(r == Cnumb){
                  System.out.println("You are acting " + rand.nextInt(100) + "% sus.");
               }
               else{
                  System.out.println(colors.get(r) + SusMsg[rand.nextInt(SusMsg.length)]);
               }
               break;
              //------------- COMMAND END (rem COMMAND)-------------//
            
             //------------- COMMAND START (help COMMAND)-------------//
            case "help":
               System.out.println(CommandList);
               break;
             //------------- COMMAND END (help COMMAND)-------------// 
           
           
            //------------- COMMAND START (exit COMMAND)-------------//
            case "exit":
               System.out.println("Console: bye asshole");
               System.exit(0);
               break;
           //------------- COMMAND END (exit COMMAND)-------------//    
                     
            default:
               System.out.println("Console: please enter a valid command");
               break;
         }
      } 
     
   }
   
 }