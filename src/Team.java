import java.util.List;
import java.util.ArrayList;

class Team {
    private String name;
    private List<Player> players;
    private GameStrategy strategy;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
        System.out.println(player.name + " has been added to the team " + name);
    }

    public void setStrategy(GameStrategy strategy) {
        this.strategy = strategy;
        System.out.println("Team strategy has been set.");
    }

    public void playGame() {
        System.out.println("Team " + name + " is playing a game!");
        if (strategy != null) {
            strategy.execute();
        }
        for (Player player : players) {
            player.playMatch();
        }
    }
}