package NBA;
import java.util.*;

public class teamSelector {
    

    public static void west(Scanner scnr){
        int teamPick;

        System.out.println("Please select a Division");
        System.out.println("1. North West\n2. Pacific\n3. South West");

        int userInput = scnr.nextInt();

        switch(userInput){
            case 1 -> {
                System.out.println("Please Pick a team");
                System.out.println("1. Denver Nuggets\n2. Minnesota Timberwolves\n3. Oklahoma City Thunder\n4. Portland Trail Blazers\n5. Utah Jazz");
                teamPick = scnr.nextInt();
                switch(teamPick){
                    //Loads the CSV File with the stats
                    case 1 -> System.out.println("Denver!");
                    case 2 -> System.out.println("Minnesota!");
                    case 3 -> System.out.println("OKC!");
                    case 4 -> System.out.println("Portland");
                    case 5 -> System.out.println("Utah");
                }
            }
            case 2 -> {
                System.out.println("Please Pick a team");
                System.out.println("1. Golden State Warriors\n2. LA Clippers\n3. Los Angles Lakers\n4. Phoenix Suns\n5. Sacremento Kings");
                teamPick = scnr.nextInt();
                switch(teamPick){
                    //Loads the CSV File with the stats
                    case 1 -> System.out.println("Warriors");
                    case 2 -> System.out.println("LA Clippers!");
                    case 3 -> System.out.println("Lakers!");
                    case 4 -> System.out.println("Suns!");
                    case 5 -> System.out.println("Kings");
                }
            }
            case 3 -> {
                System.out.println("Please Pick a team");
                System.out.println("1. Dallas Mavericks\n2. Houston Rockets\n3. Memphis Grizzlies\n4. New Orleans Pelicans\n5. San Antonio Spurs");
                teamPick = scnr.nextInt();
                switch(teamPick){
                    //Loads the CSV File with the stats
                    case 1 -> System.out.println("Mavs");
                    case 2 -> System.out.println("Rockets");
                    case 3 -> System.out.println("Grizzlies");
                    case 4 -> System.out.println("Pelicans");
                    case 5 -> System.out.println("Spurs");
                }
            }

        }
    }

    public static void east(Scanner scnr){
        int teamPick;

        System.out.println("Please select a Division");
        System.out.println("1. Atlantic\n2. Central\n3. South East");

        int userInput = scnr.nextInt();

        switch(userInput){
            case 1 -> {
                System.out.println("Please Pick a team");
                System.out.println("1. Boston Celtics\n2. Brooklyn Nets\n3. New York Knicks\n4. Philadelphia 76ers\n5. Toronto Raptors");
                teamPick = scnr.nextInt();
                switch(teamPick){
                    //Loads the CSV File with the stats
                    case 1 -> System.out.println("Denver!");
                    case 2 -> System.out.println("Minnesota!");
                    case 3 -> System.out.println("OKC!");
                    case 4 -> System.out.println("Portland");
                    case 5 -> System.out.println("Utah");
                }
            }
            case 2 -> {
                System.out.println("Please Pick a team");
                System.out.println("1. Chicago Bulls\n2. Cleveland Cavaliers\n3. Detroit Pistons\n4. Indiana Pacers\n5. Milwaulke Bucks");
                teamPick = scnr.nextInt();
                switch(teamPick){
                    //Loads the CSV File with the stats
                    case 1 -> PlayerSelector.selectPlayer("src/stats/East/Central Division/bulls_2024_25_stats.csv", scnr);
                    case 2 -> PlayerSelector.selectPlayer("src/stats/East/Central Division/cleveland_cavaliers_2024_25_stats_updated.csv", scnr);
                    case 3 -> PlayerSelector.selectPlayer("src/stats/East/Central Division/pistons_2024_25_stats.csv", scnr);
                    case 4 -> PlayerSelector.selectPlayer("src/stats/East/Central Division/indiana_pacers_2024_25_stats.csv", scnr);
                    case 5 -> PlayerSelector.selectPlayer("src/stats/East/Central Division/bucks_2024_25_stats.csv", scnr);
                }
            }
            case 3 -> {
                System.out.println("Please Pick a team");
                System.out.println("1. Dallas Mavericks\n2. Houston Rockets\n3. Memphis Grizzlies\n4. New Orleans Pelicans\n5. San Antonio Spurs");
                teamPick = scnr.nextInt();
                switch(teamPick){
                    //Loads the CSV File with the stats
                    case 1 -> System.out.println("Mavs");
                    case 2 -> System.out.println("Rockets");
                    case 3 -> System.out.println("Grizzlies");
                    case 4 -> System.out.println("Pelicans");
                    case 5 -> System.out.println("Spurs");
                }
            }
        }
    }
}
