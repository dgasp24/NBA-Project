package NBA;

public class Player {
    String name;
    int gp;
    double mpg;
    double ppg;
    double rpg;
    double apg;
    double spg;
    double bpg;
    double fgp;
    double tpp;
    double ftp;


    public Player(String name, int gp, double mpg, double ppg, double rpg, double apg, double spg, double bpg, double fgp, double tpp, double ftp){
        this.name = name;
        this.gp = gp;
        this.mpg = mpg;
        this.ppg = ppg;
        this.rpg = rpg;
        this.apg = apg;
        this.spg = spg;
        this.bpg = bpg;
        this.fgp = fgp;
        this.tpp = tpp;
        this.ftp = ftp;
    }

    public String getName(){
        return name;
    }

    public int getGamesPlayed(){
        return gp;
    }

    public double getMinutesPerGame(){
        return mpg;
    }

    public double getPointsPerGame(){
        return ppg;
    }

    public double getReboundsPerGame(){
        return rpg;
    }

    public double getAssistPerGame(){
        return apg;
    }

    public double getStealsPerGame(){
        return spg;
    }

    public double getBlocksPerGame(){
        return bpg;
    }

    public double getFieldGoal(){
        return fgp;
    }

    public double getThreePoint(){
        return tpp;
    }

    public double getFreeThrow(){
        return ftp;
    }

    @Override
public String toString() {
    return String.format(
        "GP: %d | MPG: %.1f | PPG: %.1f | RPG: %.1f | APG: %.1f | SPG: %.1f | BPG: %.1f | FG%%: %.1f | 3P%%: %.1f | FT%%: %.1f",
         gp, mpg, ppg, rpg, apg, spg, bpg, fgp, tpp, ftp
    );
}
}
