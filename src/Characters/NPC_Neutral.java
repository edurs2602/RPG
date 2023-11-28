package Characters;

public class NPC_Neutral extends NonPlayableCharacter{
    public NPC_Neutral(String name, int level, int attack, int defense, int currentHp, int totalHp) {
        super(name, level, attack, defense, currentHp, totalHp);
    }

    @Override
    public void defend() {
        System.out.println(this.name + " está se defendendo.");
    }
}
