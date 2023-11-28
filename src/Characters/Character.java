package Characters;

public abstract class Character {
    public String name;
    public int level;
    public int attack;
    public int defense;
    public int currentHp;
    public int totalHp;
    public boolean isAlive;

    public Character(String name, int level, int attack, int defense, int currentHp, int totalHp) {
        this.name = name;
        this.level = level;
        this.attack = attack;
        this.defense = defense;
        this.currentHp = currentHp;
        this.totalHp = totalHp;
        this.isAlive = true;
    }

    public abstract void defend();

    public boolean isAlive() {
        return isAlive;
    }
}
