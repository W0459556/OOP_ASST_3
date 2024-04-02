package ca.nscc.Classes;
import javax.swing.*;

public class Enemy extends Entity {
    private String attackName;

    public String getattackName() {
        return attackName;
    }

    public void setattackName(String attackName) {
        this.attackName = attackName;
    }

    public Enemy(Weapon weapon, Armour armour, String species, int attack, int health, ImageIcon image, String attackName) {
        super(weapon, armour, species, attack, health, image);
        this.attackName = attackName;
    }
}