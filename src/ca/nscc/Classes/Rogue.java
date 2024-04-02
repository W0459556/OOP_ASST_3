package ca.nscc.Classes;
import javax.swing.*;

public class Rogue extends Player {
    private int stealth;

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public Rogue(Weapon weapon, Armour armour, String species, int attack, int health, ImageIcon image, String attackName, int stealth) {
        super(weapon, armour, species, attack, health, image, attackName);
        this.stealth = stealth;
    }
}