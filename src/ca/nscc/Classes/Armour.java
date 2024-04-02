package ca.nscc.Classes;

public class Armour extends Object{
    private int enemyAttackDebuff;

    public int getEnemyAttackDebuff() {
        return enemyAttackDebuff;
    }

    public void setEnemyAttackDebuff(int enemyAttackDebuff) {
        this.enemyAttackDebuff = enemyAttackDebuff;
    }

    public Armour(String name, int enemyAttackDebuff) {
        super(name);
        this.enemyAttackDebuff = enemyAttackDebuff;
    }
    
    @Override
    public String toString() {
        return  getName() + ": +" + this.getEnemyAttackDebuff() + " Defense.";
    }
}