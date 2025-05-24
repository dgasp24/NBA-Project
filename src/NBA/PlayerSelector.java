package NBA;
import java.util.*;

public class PlayerSelector {

    public static void selectPlayer(String fileName, Scanner scnr){
        List<Player> players = loader.loadStat(fileName);
        int i;
        boolean p = true;

        System.out.println("Please select the player you would like to choose");

        for(i = 0; i < players.size(); i++){
            System.out.println((i + 1) + ". " + players.get(i).getName());
        }
            
        int choice = scnr.nextInt();


        while(p){
       if (choice >= 1 && choice <= players.size()){
            Player selected = players.get(choice - 1);

            dashCreator(selected);

            System.out.println("\nPlease Select the stat you would like to see\n--------------------------------------------");
            System.out.println("1. Games Played\n2. Minutes Per Game\n3. Points Per Game\n4. Rebounds Per Game\n5. Assists Per Game\n6. Steals Per Game\n7. Blocks Per Game");
            System.out.println("8. Field Goal Percentage\n9. Three Point Percentage\n10. Free Throw Percentage\n11. Back to Main Menu");
            int userInput = scnr.nextInt();
            switch(userInput){
                
                case 1 -> System.out.println( selected.getName() + " played " + selected.getGamesPlayed() + " games.");
                case 2 -> System.out.println( selected.getName() + " played " + selected.getMinutesPerGame() + " minutes per game");
                case 3 -> System.out.println( selected.getName() + " had " + selected.getPointsPerGame() + " points per game");
                case 4 -> System.out.println(selected.getName() + " had " + selected.getReboundsPerGame() + " rebounds per game");
                case 5 -> System.out.println(selected.getName() + " had " + selected.getAssistPerGame() + " assists per game");
                case 6 -> System.out.println(selected.getName() + " had " + selected.getStealsPerGame() + " steals per game");
                case 7 -> System.out.println( selected.getName() + " had " + selected.getBlocksPerGame() + " blocks per game");
                case 8 -> System.out.println(selected.getName() + " had a " + selected.getFieldGoal() + " field goal percentage for the season");
                case 9 -> System.out.println(selected.getName() + " had " + selected.getThreePoint() + " three point percentage for the season");
                case 10 -> System.out.println(selected.getName() + " had " + selected.getFreeThrow() + " free throw percentage for the season");
                case 11 -> p = false;
                default -> System.out.println("Error. Please choose a number between 1-11");
            }
        }
    }
    } 

        public static void dashCreator(Player selected){
            int length = ((44 - selected.getName().length()) / 2);

            for(int j = 0; j < length; j++){
                System.out.print("-");
            }

               System.out.print(selected.getName());

            for(int j = 0; j < length; j++){
                System.out.print("-");
            }

            if ((44 - selected.getName().length()) % 2 != 0) {
                System.out.print("-");
            }
        }
    }

