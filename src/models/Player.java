package models;

import interfaces.BattleMember;

import java.util.Scanner;

public class Player implements BattleMember {
  private double health = 300.0;
  private Position position;
  private String name;

  private int damage = 35;

  public Player(String name, int x, int y) {
    this.position = new Position(x, y);
    this.name = name;

  }

  public void walk() {
    Scanner sc = new Scanner(System.in);
    String nextStep;
    do {
      System.out.printf(
          "Vez do jogador %s, digite opção:"
              + "\ncima(w), direita(d), esquerda(a), baixo(s)."
              + "\nVocê está na posição: x: %d y: %d\nDigite o comando: ",
          this.name, this.position.getX(), this.position.getY());
      nextStep = sc.nextLine();
      boolean next = this.position.setPosition(nextStep);
      System.out.println("comando digitado: " + nextStep);
      if (!next) {
        System.out.println("Comando inválido, digite novamente");
      } else
        break;
    } while (true);
  }

  public double getHealth() {
    return health;
  }

  public Position getPosition() {
    return position;
  }

  public String getName() {
    return name;
  }

  public void setHealth(double health) {
    this.health = health;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDamage() {
    return this.damage;
  }

}
