import models.Board;
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
    new Monster("spider", 25, 20);
    new Monster("dragon", 80, 40);
    new Monster("snake", 10, 25);

    Scanner sc = new Scanner(System.in);
    String continua = "s";
    List<Player> playersList = new ArrayList<>();
    Board board = new Board(playersList);
    while (board.getTrophy().getHidden()) {
      while (continua.equals("s")) {
        System.out.print("diga seu nome:");
        String playerName = sc.next(); // reads string.

        System.out.print("diga sua coordenada inicial \nx: ");
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();

        Player p = new Player(playerName, x, y);
        System.out.println("chegou aqui");
        playersList.add(p);

        System.out.print("deseja continuar? Caso não queira digite n");
        continua = sc.next();
        System.out.println(continua.equals("s"));
      }

      board.move();
    }
  }
}