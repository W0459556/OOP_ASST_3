package ca.nscc.Classes;
import javax.swing.*;

public class Player extends Entity {
    private String playerName;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Player(Weapon weapon, Armour armour, String species, int attack, int health, String playerName) {
        super(weapon, armour, species, attack, health);
        this.playerName = playerName;
    }

    public Player() {
    }
}