import java.util.*;
public abstract class Commands{
   static Random rand = new Random();   
   static String commands = "sus:\ttells you who is acting suspicious\nadd:\tadds a custom color to the Color List!\nremove:\tRemoves a color\nClear:\tRemoves all colors\nlist:\tShows you the list of colors\nMyColor:\tlets you pick a color\nexit:\tExits the program\ncredits:\tshows you the program's credits\nhelp:\tgives you a list of commands\n";
   static String MyColor = "";
   static String SusMan = "";
   static String credits = "\n\t\t---CREDITS---\n\t\tmade by: AProXD\n";
   static boolean idk = false;
   public static Scanner fetch = new Scanner(System.in); 

   public static void susColor(ArrayList<String> colors){
      System.out.println(rand.nextInt(10));
   }
   
   /*--------------ERROR LIST START------------------*/
   public static void Error(String errorType){
      //arrays of da errrors start
      String[] CommandNotFound = {"console: you can type \"help\" to get a list of commands","console: please enter a valid command","error: command not found","console: command not found","console: da fuck? enter a valid command you dumb dumb","console: command wasn't found","jim: please enter a valid command.","stfu"};
      String[] ColorNotFound ={"console: that color does not exist","console: that color isnt on the list, Sorry.","console: please enter a valid color"};         
      //arrays of errrors end   
      
      
   //yandere dev else/if statements start
      if(errorType.equals("CommandNotFound")){
         System.out.println(CommandNotFound[rand.nextInt(CommandNotFound.length)]);
      }
      else if(errorType.equalsIgnoreCase("ColorNotFound")){
         System.out.println(ColorNotFound[rand.nextInt(ColorNotFound.length)]);
      }
   //yandere dev else/if statements end
   
   }
    /*--------------ERROR LIST END------------------*/

   
    /*--------------EXIT COMMAND START------------------*/
   public static void Exit(){
      System.out.println("goodbye dumbass!");
      System.exit(0);
   }
   /*--------------EXIT COMMAND START------------------*/
   
   
   
   /*----------help command start----------*/
   public static void Help(){
      System.out.println("-------------------------------------------------");
      System.out.println("list of commands:\t");
      System.out.println("-------------------------------------------------");
      System.out.println(commands);
      System.out.println("-------------------------------------------------");
   }
   /*----------help commmand end----------*/
   
   /*----------Sus Color start----------*/
   public static void ColorSus(ArrayList<String> colors){
   
   String[] SusMsg = {" is acting mad sus", " is " + rand.nextInt(100)+ "% sus"," is " + rand.nextInt(100)+ "% sus"," is " + rand.nextInt(100)+ "% sus", " is very sus", " is supa sus", " is sus af", " is da imposter", " is a poopoohead"};
   
      
      try{
         System.out.print("analyzing");
         Thread.sleep(300);
         System.out.print(".");
         Thread.sleep(400);
         System.out.print(".");
         Thread.sleep(500);
         System.out.print(".");
         Thread.sleep(300);
         System.out.println();
      } catch (Exception e){
         System.out.println("error: " + e);
      }
      String susColor = colors.get(rand.nextInt(colors.size()));
      
      if(MyColor.equals(susColor)){
         System.out.println("You are acting " + rand.nextInt(100) + "% sus!");
      }
      else{
         System.out.println(susColor + SusMsg[rand.nextInt(SusMsg.length)]);
      }
   
   
   }
   /*----------Sus color command end----------*/
   
   /*----------ADD COLOR START----------*/
   public static void ColorAdd(ArrayList<String> colorList){
      System.out.print("enter name of color you want to add:");
      String fart = fetch.next();
      String col = fart.substring(0, 1).toUpperCase() + fart.substring(1).toLowerCase();
      colorList.add(col);
      System.out.println(col + " was added to the color list!");
   }  
   /*----------ADD COLOR END----------*/ 
   
   
   /*----------Color List command start----------*/
   public static void ColorList(ArrayList<String> colors){
      System.out.println("---List of colors---");
      for(String e: colors){
         System.out.println("-" + e);
      }
   }
   /*----------Color list command end---------*/
   
   
   
   /*----------remove color command start---------------*/
   public static void ColorRemove(ArrayList<String> colors){
      ColorList(colors);
      System.out.print("enter color you want to remove:");
      String fart = fetch.next();
      String col = fart.substring(0, 1).toUpperCase() + fart.substring(1).toLowerCase();
      
      try{
         if(hasColor(col,colors,idk) == true){
            colors.remove(col);
            System.out.println(col + " was yeeted out off the the color list.");
         } 
         else{
            Error("ColorNotFound");
         }
         
      } catch(Exception e){
         System.out.println("error: " + e);
      }
   }
   /*----------remove color command end----------------*/
 
   /*------------------command that checks if there is a certain color in the color list (i need it for the "remove color" command---------------*/
   //BAD CODE ALERT!!!!!!
   public static boolean hasColor(String col, ArrayList<String> colorList, Boolean fart){
      for(String color: colorList){
         if(col.equals(color)){
            fart = true;
            return fart;
         }
      }
      fart = false;
      return fart;
   
   } 
   /*------------------------------command end-------------------------------------------------------------*/  
   
   /*----------CREDITS command start---------------*/
      public static void Credits(){
         System.out.println(credits);
      }
   /*----------CREDITS command end---------------*/
   
   
   /*----------Color Chooser command start---------------*/
      public static void MyColor(){
         System.out.print("please enter your current color:");
         String fart = fetch.next();
         MyColor = fart.substring(0, 1).toUpperCase() + fart.substring(1).toLowerCase();
         System.out.println("you are " + MyColor + ".");
         
      }
   /*----------Color Chooser command end---------------*/
   
   /*----------remove all command star----------*/
   public static void RemoveAll(ArrayList<String> colors){
      colors.clear();
      System.out.println("the entire list of colors has been cleared. You can add colors with \"add\"");
   }
  /*-----------remove all command end----------*/
   
}
//