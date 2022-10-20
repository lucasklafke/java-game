package models;

import java.util.Random;

public class Square {
    public static int counter;
    private int quantityLayer;
    private int currentLayer;
    private String position;

    public Square(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

    public int getQuantityLayer() {
        return quantityLayer;
    }

    public void setQuantityLayer(int quantityLayer) {
        this.quantityLayer = quantityLayer;
    }

    public int getCurrentLayer() {
        return currentLayer;
    }

    public void setCurrentLayer(int currentLayer) {
        this.currentLayer = currentLayer;
    }

    public void randomizeMonsterOrPotion() {
        Random random = new Random();
        int number = random.nextInt(100);
        if(number <= 10) {
            if(number < Monster.getMonstersSize()) {
                Monster monster = Monster.randomizeMonster();
//                Battle battle = new Battle(monster);
            } else {
                Potion potion = new Potion();
            }
        }

    }

}
