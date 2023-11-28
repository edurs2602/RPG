package Classes;
import Characters.PlayableCharacter;

public class MageClass implements CharacterClass{
    @Override
    public void applyLevelUpBonuses(PlayableCharacter player) {
        player.attack += 3;
        player.defense += 3;
        player.totalHp += 4;
    }
}
