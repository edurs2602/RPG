package Characters;
import Classes.ArcherClass;
import Classes.CharacterClass;
import Classes.MageClass;
import Classes.WarriorClass;

public class PlayableCharacter extends Character implements Attacker{
    private int currentExp;
    private int expNextLevel;
    private int totalExp;

    private CharacterClass characterClass;

    private boolean isAlive;

    public PlayableCharacter(String name, int level, int attack, int defense, int currentHp, int totalHp, int currentExp, int expNextLevel, int totalExp, CharacterClass characterClass) {
        super(name, level, attack, defense, currentHp, totalHp);
        this.currentExp = currentExp;
        this.expNextLevel = expNextLevel;
        this.totalExp = totalExp;
        this.characterClass = characterClass;
        this.isAlive = true;
    }

    public void levelUp() {
        this.level += 1;
        this.attack += 5;
        this.defense += 5;
        this.totalHp += 10;
        this.currentExp -= this.expNextLevel;
        this.expNextLevel = (125 * this.level^2 + 375 * this.level) / 10;
        characterClass.applyLevelUpBonuses(this);
    }

    @Override
    public void defend() {
        System.out.println(this.name + " está se defendendo.");
    }

    @Override
    public void attack(Character target) {
        int damage = Math.max(0, this.attack - (int)(target.defense * 1.2));
        target.currentHp -= damage;
        if (target.currentHp <= 0) {
            this.currentExp += ((NPC_Enemy) target).calculateExperienceValue();
            checkLevelUp();
        }
    }

    public void checkLevelUp() {
        if (this.currentExp >= this.expNextLevel) {
            levelUp();
        }
    }

    public void checkStatus(){
        System.out.println(name + " - Level: " + level + ", HP: " + currentHp + ", XP: " + currentExp);
    }

    @Override
    public boolean isAlive() {
        return isAlive;
    }

}
