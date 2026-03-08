package game;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Battle {

    public static int roll() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static void startBattle(ArrayList<Territories> territories, Scanner input) {

        input = new Scanner(System.in);
        int skipCounter = 0;
        int currentPlayer = 0;

        while (true) {

            Territories current = territories.get(currentPlayer);

            System.out.println("\n===== " + current.playerName + "'s TURN =====");
            String choice;

            do {
                System.out.print("Do you want to [ATTACK] or [SKIP]? ");
                choice = input.nextLine().toUpperCase();
                if (!choice.equals("ATTACK") && !choice.equals("SKIP")) {
                    System.out.println("Invalid choice. Please type ATTACK or SKIP.");
                }
            } while (!choice.equals("ATTACK") && !choice.equals("SKIP"));

            if (choice.equals("SKIP")) {
                skipCounter++;
                System.out.println(current.playerName + " skipped their turn.");
                if (skipCounter >= territories.size() * 3) {
                    System.out.println("\nEveryone skipped the game 3 times in a row. Game over!");
                    break;
                }
            }

            if (choice.equals("ATTACK")) {
                skipCounter = 0;

                System.out.println("Choose a defender:");
                for (int i = 0; i < territories.size(); i++) {
                    if (i != currentPlayer) {
                        System.out.println("[" + i + "] " + territories.get(i).playerName + " - " + territories.get(i).territoryName);
                    }
                }

                System.out.print("Defender index: ");
                int defenderIndex = input.nextInt();
                input.nextLine();
                Territories defender = territories.get(defenderIndex);

                int attackRoll = roll();
                int defenseRoll = roll();

                System.out.println("\n" + current.playerName + " rolled: " + attackRoll);
                System.out.println(defender.playerName + " rolled: " + defenseRoll);

                if (attackRoll > defenseRoll) {
                    System.out.println("Result: ATTACKER wins! " + defender.playerName + " lost a troop.");
                    defender.troops--;
                } else if (defenseRoll > attackRoll) {
                    System.out.println("Result: DEFENDER wins! " + current.playerName + " lost a troop.");
                    current.troops--;
                } else {
                    System.out.println("Result: DRAW! " + current.playerName + " lost a troop.");
                    current.troops--;
                }
            }

            territories.removeIf(t -> t.troops <= 0);
            GameStatus.printStatus(territories);

            if (territories.size() == 1) {
                System.out.println("\n " + territories.getFirst().playerName + " is the Winner!");
                break;
            }

            currentPlayer = (currentPlayer + 1) % territories.size();
        }
    }
}