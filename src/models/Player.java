package models;

import java.util.Scanner;

public class Player {
    private double health = 300.0;
    private Position position;
    private String name;

    public Player(String name, int x, int y) {
        this.position = new Position(x, y);
        this.name = name;
    }
    public void walk() {
        Scanner sc = new Scanner(System.in);
        String nextStep;
        do{
            System.out.printf("Vez do jogador %s, ande para cima(w)\n direita(d)\n esquerda(a)\n baixo(s)\n Você está na posição:", this.name, this.position);
            nextStep = sc.nextLine();
        }while(!this.position.setPosition(nextStep));
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

}
