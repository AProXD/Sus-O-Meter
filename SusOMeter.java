import java.util.Scanner;
public class SusOMeter{
   public static void main(String[] args){
      Scanner fetch = new Scanner(System.in);
      
      System.out.println("----------SUS-O-METER----------");
      System.out.print("type anything to start:");
      fetch.next();
      
      SelectCommands.userInputLoop();
   }
}
