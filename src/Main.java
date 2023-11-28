import Characters.NPC_Enemy;
import Characters.NPC_Neutral;
import Characters.PlayableCharacter;
import Classes.ArcherClass;
import Classes.MageClass;
import Classes.WarriorClass;

public class Main {
    public static void main(String[] args) {
        PlayableCharacter warriorPlayer = new PlayableCharacter("WarriorPlayer", 1, 20, 10, 100, 100, 0, 50, 0, new WarriorClass());
        PlayableCharacter archerPlayer = new PlayableCharacter("ArcherPlayer", 1, 15, 5, 80, 80, 0, 25, 0, new ArcherClass());
        PlayableCharacter magePlayer = new PlayableCharacter("MagePlayer", 1, 18, 8, 90, 90, 0, 10, 0, new MageClass());

        NPC_Enemy enemy = new NPC_Enemy("Inimigo 1", 1, 15, 5, 50, 50);
        NPC_Enemy enemy2 = new NPC_Enemy("Inimigo 2", 10, 20, 8, 70, 70);

        NPC_Neutral npc = new NPC_Neutral("NPC 1", 2, 20, 50, 25, 25);

        GameMaster gameMaster = new GameMaster();
        gameMaster.combate(warriorPlayer, enemy);

        System.out.println("Status após o 1ª combate:");
        warriorPlayer.checkStatus();
        enemy.checkStatus();

        gameMaster.combate(warriorPlayer, enemy2);

        System.out.println("Status após o 2ª combate:");
        warriorPlayer.checkStatus();
        enemy2.checkStatus();

        gameMaster.combate(archerPlayer, enemy2);

        System.out.println("Status após o 3ª combate:");
        archerPlayer.checkStatus();
        enemy2.checkStatus();

        gameMaster.combate(magePlayer, enemy2);

        System.out.println("Status após o 3ª combate:");
        magePlayer.checkStatus();
        enemy2.checkStatus();

        gameMaster.combate(warriorPlayer, npc);

    }
}