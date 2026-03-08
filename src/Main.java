import game.Battle;
import game.Territories;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args){

        System.out.println("============");
        System.out.println("WAR THE GAME");
        System.out.println("============");

        Scanner input = new Scanner(System.in);

        System.out.println("How many players will play ?: ");
        int players = input.nextInt();

        while(players < 2 || players > 4){
            System.out.println("\nThe minimum of players is 2 and the max is 4, pleas select between 2 and 4 players!");
            System.out.println("How many players will play ?: ");
            players = input.nextInt();
        }

        ArrayList<Territories> territories = Territories.generateTerritories(players, input);
        Battle.startBattle(territories, input);

        input.close();
    }

}