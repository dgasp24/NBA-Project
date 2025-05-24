package NBA;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class loader {

    public static List<Player> loadStat(String filename){
        List<Player> players = new ArrayList<>();
    try (BufferedReader read = new BufferedReader(new FileReader(filename))){
        String line;
        while((line = read.readLine()) != null){
            String[] data = line.split(",");
            if(data.length == 11){
                String name = data[0];
                int gp = Integer.parseInt(data[1]);
                double mpg = Double.parseDouble(data[2]);
                double ppg = Double.parseDouble(data[3]);
                double rpg = Double.parseDouble(data[4]);
                double apg = Double.parseDouble(data[5]);
                double spg = Double.parseDouble(data[6]);
                double bpg = Double.parseDouble(data[7]);
                double fgp = Double.parseDouble(data[8]);
                double tpp = Double.parseDouble(data[9]);
                double ftp = Double.parseDouble(data[10]);
                players.add(new Player(name, gp, mpg, ppg, rpg, apg, spg, bpg, fgp, tpp, ftp));
            }
        }
    }catch(IOException e){
        System.out.println("Could not access File");
    }
    return players;

}

}
