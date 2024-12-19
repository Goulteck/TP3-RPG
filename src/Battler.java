import java.util.Random;

// Creation de la classe battler avec 4 parametre
public class Battler {
    public String name;
    public int hp;
    public int power;
    public int attackSpeed;

    public Battler(String name, int hp, int power) {
        this.name = name;
        this.hp = hp;
        this.power = power;
        this.attackSpeed = 0;
    }

    public void attack(Battler opponent) {
        System.out.println(this.name + " attaque " + opponent.name + " avec " + this.power + " de puissance !");
        opponent.looseHP(this.power);
    }

    public void looseHP(int amount) {
        this.hp -= amount;
        if (this.hp < 0) this.hp = 0;
        System.out.println(this.name + " perd " + amount + " HP. HP restant : " + this.hp);
    }
}