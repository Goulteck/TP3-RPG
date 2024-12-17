import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Battler player = new Battler("Marchand", 100, 20);
        Battler enemy = new Battler("Truand", 80, 25);

        Team playerTeam = new Team(Arrays.asList(player));
        Team enemyTeam = new Team(Arrays.asList(enemy));

        Game game = new Game(playerTeam, enemyTeam);
        game.play();
    }
}