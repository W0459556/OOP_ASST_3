package ca.nscc.Classes;
import javax.swing.*;

public class Wizard extends Player {
    private int magic;

    public int getmagic() {
        return magic;
    }

    public void setmagic(int magic) {
        this.magic = magic;
    }

    public Wizard(Weapon weapon, Armour armour, String species, int attack, int health, ImageIcon image, String attackName, int magic) {
        super(weapon, armour, species, attack, health, image, attackName);
        super.setImage(new ImageIcon("src/ca/nscc/Images/wizard.png"));
        this.magic = magic;
    }
}