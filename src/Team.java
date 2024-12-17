import java.util.List;

public class Team {
    public List<Battler> battlers;

    public Team(List<Battler> battlers) {
        this.battlers = battlers;
    }

    public boolean isLoose() {
        for (Battler battler : battlers) {
            if (battler.hp > 0) {
                return false; // Un combattant a encore des HP
            }
        }
        return true; // Tous les combattants sont KO
    }
}