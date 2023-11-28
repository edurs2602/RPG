package Characters;

public abstract class NonPlayableCharacter extends Character{
    public NonPlayableCharacter(String name, int level, int attack, int defense, int currentHp, int totalHp) {
        super(name, level, attack, defense, currentHp, totalHp);
    }

    public abstract void defend();
}
