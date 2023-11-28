package Classes;
import Characters.PlayableCharacter;

public class ArcherClass implements CharacterClass{
    @Override
    public void applyLevelUpBonuses(PlayableCharacter player) {
        player.attack += 5;
        player.totalHp += 3;
    }
}
