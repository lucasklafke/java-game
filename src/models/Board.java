package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
  private Square[][] squares = new Square[8][8];
  private List<Player> players = new ArrayList<>();
  private int currentPlayer;
  private final Trophy trophy;

  public Board(List<Player> players) {
    this.CreateSquares();
    this.players = players;
    this.currentPlayer = 0;
    this.trophy = new Trophy();
  }

  private void CreateSquares() {
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {

        Square square = new Square();
        squares[i][j] = square;
      }
    }
  };
  private void printBoard() {
    for (int i = 7; i >= 0; i--) {
      System.out.println();
      for (int j = 0; j < 8; j++) {
        if(j != 0){
          System.out.print("|");
        }
        int numberOfPlayers = 0;

        for(int k = 0; k < players.size(); k++){
          boolean playerExist = players.get(k).getPosition().comparePosition(new Position(j, i));
          if(playerExist){
            numberOfPlayers++;
            System.out.printf("J %d", k+1);
          }
        }
        if(numberOfPlayers == 0) {
          System.out.printf(" %d ", squares[j][i].getCurrentLayer());
        }

      }
    }
    System.out.println();
    System.out.println();
  }
  public void move() {
    printBoard();
    Player player = players.get(currentPlayer);
    player.walk();
    Position position = player.getPosition();
    Square square = squares[position.getX()][position.getY()];
    Boolean monsterExist = square.randomizeMonster();
    if(monsterExist) {
      Monster monster = Monster.randomizeMonster();
      Battle battle = new Battle(monster, player);
    }
    if (player.getPosition().comparePosition(trophy.getPosition()) && square.getCurrentLayer() == 0){
      trophy.setHidden(false);
    }
    nextPlayer();
  }

  public void nextPlayer() {
    if (this.currentPlayer < this.players.size()-1) {
      this.currentPlayer++;
    } else {
      this.currentPlayer = 0;
    }
  }

  public Trophy getTrophy() {
    return this.trophy;
  }
}
