package models;

import interfaces.BattleMember;

import java.util.ArrayList;
import java.util.Random;

public class Monster implements BattleMember {
    private double health;
    private int damage;
    private String name;
    private static ArrayList<Monster> monsters = new ArrayList<>();
    public Monster(String name, int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.name = name;
        monsters.add(this);
    }

    public static Monster randomizeMonster() {
        Random random = new Random();
        int index = random.nextInt(monsters.size());
        Monster monster = monsters.get(index);
        return monster;
    }

    public static int getMonstersSize(){
        return monsters.size();
    };

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Monster> getMonsters() {
        return this.monsters;
    }
}
