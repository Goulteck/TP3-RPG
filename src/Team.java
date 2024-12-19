import java.util.List;

// Création de la Variable Team
public class Team {
    // Initialisation de la liste
    public List<Battler> battlers;
    // Prend en paramètre une liste de Battler  et l'attribut battlers
    public Team(List<Battler> battlers) {
        this.battlers = battlers;
    }
    // Variable qui controle si une equipe a perdu
    public boolean isLoose() {
        for (Battler battler : battlers) {
            if (battler.hp > 0) {
                return false; // Un combattant a encore des HP
            }
        }
        return true; // Tous les combattants sont KO
    }
}