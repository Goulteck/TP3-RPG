import java.util.Arrays;

public class Main {
    // Création de combattants
    public static void main(String[] args) {
        Battler player = new Battler("Marchand", 100, 15);
        Battler enemy = new Battler("Truand", 80, 25);

        // Création des équipes
        Team playerTeam = new Team(Arrays.asList(player));
        Team enemyTeam = new Team(Arrays.asList(enemy));

        // Initialisation et lancement du jeux
        Game game = new Game(playerTeam, enemyTeam);
        game.play();
    }
}