import Characters.Attacker;
import Characters.Character;
import Characters.PlayableCharacter;

public class GameMaster{
    public void combate(Character character1, Character character2) {

        if (!character1.isAlive() || !character2.isAlive()) {
            System.out.println("Um ou ambos os personagens estão mortos e não podem participar do combate.");
            return;
        }

        if (character1 instanceof Attacker && character2 instanceof Attacker) {
            Attacker attacker1 = (Attacker) character1;
            Attacker attacker2 = (Attacker) character2;

            while (((Character) character1).currentHp > 0 && character2.currentHp > 0) {
                attacker1.attack(character2);
                attacker2.attack(character1);
            }

            if (character1.currentHp <= 0) {
                System.out.println(((Character) character2).name + " derrotou " + character1.name + "!");
                character1.isAlive = false;
                if (character1 instanceof PlayableCharacter) {
                    PlayableCharacter player = (PlayableCharacter) character1;
                    player.checkLevelUp();
                }


            } else {
                System.out.println(character1.name + " derrotou " + character2.name + "!");
                character2.isAlive = false;
                if (character2 instanceof PlayableCharacter) {
                    PlayableCharacter player = (PlayableCharacter) character2;
                    player.checkLevelUp();
                }
            }
        } else {
            System.out.println("Os personagens não podem se atacar.");
        }

    }
}
