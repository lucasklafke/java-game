package models;

import java.util.Random;

public class Trophy {
    private Position position;

    private boolean hidden = true;

    public Trophy() {
        Random random = new Random();
//        int x = random.nextInt(8);
//        int y = random.nextInt(8);
        position = new Position(2, 2);
    }

    public Position getPosition() {
        return this.position;
    }

    public boolean getHidden() {
        return this.hidden;
    }

    public void setHidden(){
        this.hidden = false;
    }
}
