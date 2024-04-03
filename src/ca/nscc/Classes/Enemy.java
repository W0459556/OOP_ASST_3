package ca.nscc.Classes;

public class Enemy extends Entity {
    private String attackName;

    public String getattackName() {
        return attackName;
    }

    public void setattackName(String attackName) {
        this.attackName = attackName;
    }

    public Enemy(Weapon weapon, Armour armour, String species, int attack, int health, String attackName) {
        super(weapon, armour, species, attack, health);
        this.attackName = attackName;
    }
}