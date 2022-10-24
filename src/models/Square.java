package models;

import java.util.Random;

public class Square {
    public static int counter;
    private int quantityLayer;
    private int currentLayer;

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

    public Boolean randomizeMonster() {
        Random random = new Random();
        int number = random.nextInt(100);
        if(number <= 10) {
            return true;
        }
        return false;
    }


}
