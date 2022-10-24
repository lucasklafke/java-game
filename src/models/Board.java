package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
  private Square[][] squares = new Square[8][8];
  private List<Player> players = new ArrayList<>();

  private int currentPlayer;

  public Board(List<Player> players) {
    this.CreateSquares();
    this.players = players;
    this.currentPlayer = 0;
  }

  private void CreateSquares() {
    for (int i = 0; i < 64; i++) {
      for (int j = 0; j < 64; j++) {

        Square square = new Square();
        squares[i][j] = square;
      }
    }
  };

  public void move() {
    Player player = players.get(currentPlayer);
    player.walk();
    Position position = player.getPosition();
    Square square = squares[position.getX()][position.getY()];
    Boolean monsterExist = square.randomizeMonster();
    if(monsterExist) {
      Monster monster = Monster.randomizeMonster();
      Battle battle = new Battle(monster, player);
    }
//    square.randomizePotion();

  }

  public void nextPlayer() {
    if (this.players.size() > this.currentPlayer) {
      this.currentPlayer++;
    } else {
      this.currentPlayer = 0;
    }
  }
}
