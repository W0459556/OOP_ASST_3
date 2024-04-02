package ca.nscc.Classes;

public class Weapon extends Object{
    private int userAttackBuff;

    public int getuserAttackBuff() {
        return userAttackBuff;
    }

    public void setuserAttackBuff(int userAttackBuff) {
        this.userAttackBuff = userAttackBuff;
    }

    public Weapon(String name, int userAttackBuff) {
        super(name);
        this.userAttackBuff = userAttackBuff;
    }
    
    @Override
    public String toString() {
        return  getName() + ": +" + this.getuserAttackBuff() + " Attack.";
    }
}