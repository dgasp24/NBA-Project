package NBA;
import java.util.*;

public class Driver {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        boolean y = true;
        int userInput;

        while(y){
            System.out.println("----------------------Main Menu----------------------");
            System.out.println("Welcome to the NBA!\nPlease pick a conference to begin!");
            System.out.println("1. West");
            System.out.println("2. East");
            System.out.println("3. Quit");

        userInput = scnr.nextInt();
            
            switch(userInput){
                case 1:
                    teamSelector.west(scnr);
                    userInput = 0;
                    break;
                case 2:
                    teamSelector.east(scnr);
                    break;
                case 3:
                    System.out.println("Goodbye");
                    y = false;
                    break;
                default:
                System.out.println("Error. Please pick a valid option");
            }
            }
            scnr.close();
        }
}
