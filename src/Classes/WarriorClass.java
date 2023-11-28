package Classes;
import Characters.PlayableCharacter;

public class WarriorClass implements CharacterClass{
    @Override
    public void applyLevelUpBonuses(PlayableCharacter player) {
        player.defense += 5;
        player.totalHp += 5;
    }
}
