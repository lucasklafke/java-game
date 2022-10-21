package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
  private Square[] squares = new Square[64];
  private List<Player> players = new ArrayList<>();

  private int currentPlayer;

  public Board(List<Player> players) {
    this.CreateSquares();
    this.players = players;
    this.currentPlayer = 0;
  }

  private void CreateSquares() {
    for (int i = 0; i < 64; i++) {
      Square square = new Square(String.format("%s", i));
      squares[i] = square;
    }
  };

  public void move() {
    Player player = players.get(currentPlayer);
    player.walk();
  }

  public void nextPlayer() {
    if (this.players.size() > this.currentPlayer) {
      this.currentPlayer++;
    } else {
      this.currentPlayer = 0;
    }
  }
}
