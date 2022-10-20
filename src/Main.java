import models.Monster;
import models.Player;
import models.Square;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean trophy = false;

        new Monster("spider", 20, 20);
        new Monster("dragon", 50, 40);
        new Monster("snake", 10, 25);
        Scanner sc = new Scanner(System.in);
        String continua = "s";
        List<Player> playersList = new ArrayList<>();
        while(!trophy) {
            while(continua.equals("s")) {
                System.out.print("diga seu nome:");
                String playerName = sc.nextLine(); //reads string.

                System.out.print("diga sua coordenada inicial:");
                String position = sc.nextLine();

                playersList.add(new Player(playerName, position));

                System.out.print("deseja continuar? Caso não queira digite n");
                continua = sc.nextLine();
                System.out.println(continua);
            }
        }
        Square square = new Square("1");
    }
}