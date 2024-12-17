public class Game {
    public Team playerTeam;
    public Team enemyTeam;

    public Game(Team playerTeam, Team enemyTeam) {
        this.playerTeam = playerTeam;
        this.enemyTeam = enemyTeam;
    }

    public void play() {
        System.out.println("Le combat commence !");

        Battler player = playerTeam.battlers.get(0);
        Battler enemy = enemyTeam.battlers.get(0);

        while (!playerTeam.isLoose() && !enemyTeam.isLoose()) {
            player.attack(enemy); // Le joueur attaque l'ennemi
            if (enemy.hp > 0) {
                enemy.attack(player); // L'ennemi attaque si encore vivant
            }
        }

        Team winner = getWinnerTeam();
        System.out.println("L'équipe gagnante est : " +
                (winner == playerTeam ? "Player Team" : "Enemy Team"));
    }

    public Team getWinnerTeam() {
        return playerTeam.isLoose() ? enemyTeam : playerTeam;
    }
}