package models;

import java.util.Random;

public class Potion {
    Random random = new Random();
    private int heal;

    public Potion() {
        this.heal = random.nextInt(100-50+1)+50;
    };
}
