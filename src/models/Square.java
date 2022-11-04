package models;

import java.util.Random;

public class Square {
    Random random = new Random();

    public static int counter;
    private final  int quantityLayer;
    private int currentLayer;

    private Position position;

    public Square(){
        this.quantityLayer = random.nextInt(6)+1;
        setCurrentLayer(getQuantityLayer());
    }
    public int getQuantityLayer() {
        return quantityLayer;
    }

    public int getCurrentLayer() {
        return currentLayer;
    }

    public void setCurrentLayer(int currentLayer) {
        if(currentLayer >= 0){
            this.currentLayer = currentLayer;
        }
    }

    public Boolean randomizeMonster() {
        if(this.getCurrentLayer() > 0) {
            this.currentLayer--;
            int number = random.nextInt(100);
            return number <= 50;
        } else{
            return false;
        }
    }


}
