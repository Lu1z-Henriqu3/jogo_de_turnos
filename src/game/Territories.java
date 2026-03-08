package game;
import java.util.ArrayList;
import java.util.Scanner;

public class Territories {

    public String playerName;
    public String territoryName;
    public int troops;

    public Territories(String playerName, String territoryName, int troops) {
        this.playerName = playerName;
        this.territoryName = territoryName;
        this.troops = troops;
    }

    public static ArrayList<Territories> generateTerritories(int numberOfPlayers, Scanner input) {
        input = new Scanner(System.in);

        ArrayList<Territories> territories = new ArrayList<>();

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.print("\n" + (i+1) + "º Territory\n");

            System.out.print("Enter player name: ");
            String playerName = input.nextLine();
            System.out.print("Enter territory name: ");
            String territoryName = input.nextLine();

            int troops = numberOfPlayers * 3;

            Territories t = new Territories(playerName, territoryName, troops);
            territories.add(t);
        }

        return territories;
    }
}