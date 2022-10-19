package models;

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


}
