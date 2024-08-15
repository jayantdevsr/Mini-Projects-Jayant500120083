package JAVA.experiment5;
class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayPlayerType() {
        System.out.println("Player type: Generic Player");
    }
}

class CricketPlayer extends Player {
    public CricketPlayer(String name) {
        super(name);
    }

    @Override
    public void displayPlayerType() {
        System.out.println("Player type: Cricket Player");
    }
}

class FootballPlayer extends Player {
    public FootballPlayer(String name) {
        super(name);
    }

    @Override
    public void displayPlayerType() {
        System.out.println("Player type: Football Player");
    }
}

class HockeyPlayer extends Player {
    public HockeyPlayer(String name) {
        super(name);
    }

    @Override
    public void displayPlayerType() {
        System.out.println("Player type: Hockey Player");
    }
}

public class code2 {
    public static void main(String[] args) {
        CricketPlayer cricketPlayer = new CricketPlayer("Jayant");
        FootballPlayer footballPlayer = new FootballPlayer("Jayesh");
        HockeyPlayer hockeyPlayer = new HockeyPlayer("Harsh");
        System.out.println("Jayantdev SAP:500120083");

        cricketPlayer.displayPlayerType();
        footballPlayer.displayPlayerType();
        hockeyPlayer.displayPlayerType();

        System.out.println("Jayantdev SAP:500120083");
    }
}
