package models;

import java.util.Random;

public class Trophy {
    private Position position;

    private boolean hidden = true;

    public Trophy() {
        Random random = new Random();
        int x = random.nextInt(8);
        int y = random.nextInt(8);
        position = new Position(x, y);
    }

    public Position getPosition() {
        return this.position;
    }

    public boolean getHidden() {
        return this.hidden;
    }

    public void setHidden(Boolean visible){
        this.hidden = visible;
    }

    public void showPosition() {
        System.out.println("x:" + this.getPosition().getX() + "y:" + this.getPosition().getY());
    }
    public String toString() {
        return("x:" + this.getPosition().getX() + "y:" + this.getPosition().getY());
    }
}
