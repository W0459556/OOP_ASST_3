package ca.nscc.Classes;
import javax.swing.*;
import java.util.Random;

public abstract class Entity{
    private Weapon weapon;
    private Armour armour;
    private String species;
    private int attack;
    private int health;
    private ImageIcon image;
    Random rand = new Random();

    // random number generator
    public int diceRoll(){
        return (rand.nextInt(50)+51);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public Entity(Weapon weapon, Armour armour, String species, int attack, int health, ImageIcon image) {
        this.weapon = weapon;
        this.armour = armour;
        this.species = species;
        this.attack = attack;
        this.health = health;
        this.image = image;
    }

    @Override
    public String toString() {
        return "";
    }
}