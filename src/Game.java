// Création de la classe Game qui contient deux attributs
public class Game {
    public Team playerTeam;
    public Team enemyTeam;

    // initialisation des deux équipes
    public Game(Team playerTeam, Team enemyTeam) {
        this.playerTeam = playerTeam;
        this.enemyTeam = enemyTeam;
    }

    public void play() {
        System.out.println("Le combat commence !");

        // Initialisation des combattants
        Battler player = playerTeam.battlers.get(0);
        Battler enemy = enemyTeam.battlers.get(0);

        // Boucle de combat
        while (!playerTeam.isLoose() && !enemyTeam.isLoose()) {
            player.attack(enemy); // Le joueur attaque l'ennemi
            if (enemy.hp > 0) {
                enemy.attack(player); // L'ennemi attaque si encore vivant
            }
        }

        // Détermination du vainqueur
        Team winner = getWinnerTeam();
        System.out.println("L'équipe gagnante est : " +
                (winner == playerTeam ? "Player Team" : "Enemy Team"));
    }
    // Retourne le vainqueur
    public Team getWinnerTeam() {
        return playerTeam.isLoose() ? enemyTeam : playerTeam;
    }
}