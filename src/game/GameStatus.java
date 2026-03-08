package game;
import java.util.ArrayList;

public class GameStatus {

    public static void printStatus(ArrayList<Territories> territories) {
        System.out.println("\n===== STATUS DO JOGO =====");
        for (Territories t : territories) {
            System.out.println("Jogador: " + t.playerName
                    + " | Território: " + t.territoryName
                    + " | Tropas: " + t.troops);
        }
        System.out.println("==========================\n");
    }

}