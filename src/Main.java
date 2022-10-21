import models.Monster;
import models.Player;
import models.Position;
import models.Square;

import java.awt.*;
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

                System.out.print("diga sua coordenada inicial \n x: :");
                int x = sc.nextInt();
                System.out.print("y:");
                int y = sc.nextInt();

                playersList.add(new Player(playerName, x, y));

                System.out.print("deseja continuar? Caso não queira digite n");
                continua = sc.nextLine();
                System.out.println(continua);
            }
        }
        Square square = new Square("1");
    }
}