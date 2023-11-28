package Characters;

public class NPC_Enemy extends NonPlayableCharacter implements Attacker{
    private boolean isAlive;

    public NPC_Enemy(String name, int level, int attack, int defense, int currentHp, int totalHp) {
        super(name, level, attack, defense, currentHp, totalHp);
        this.isAlive = true;
    }

    public int calculateExperienceValue() {
        return 3 + this.level * 4;
    }

    @Override
    public void defend() {
        System.out.println(this.name + " está se defendendo.");
    }

    @Override
    public void attack(Character target) {
        int damage = Math.max(0, (int)(1.2 * this.attack) - target.defense);
        target.currentHp -= damage;
    }

    public void checkStatus(){
        System.out.println(name + " - Level: " + level + ", HP: " + currentHp + "\n");
        if (currentHp <= 0){
            System.out.println("Experiencia Adquirida: " + calculateExperienceValue() + "\n");
        }
    }

    @Override
    public boolean isAlive() {
        return isAlive;
    }
}
