package models;

import java.util.ArrayList;
import java.util.Random;

public class Monster {
    private int health;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
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
