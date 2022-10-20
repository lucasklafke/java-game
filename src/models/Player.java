package models;

public class Player {
    private double health = 300.0;
    private String position;
    private String name;

    public Player(String name, String position) {
        this.position = position;
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

}
