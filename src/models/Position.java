package models;

import java.util.ArrayList;
import java.util.List;

public class Position {
  private static int maxPosition = 7;
  private static int minPosition = 0;
  private int x;
  private int y;

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Boolean setPosition(String direction) { // up down left right
    if (direction.equals("up")) {
      if (this.getY() + 1 <= maxPosition) {
        this.setY(this.getY() + 1);
        return true;
      } else
        return false;

    } else if (direction.equals("down")) {
      if (this.getY() - 1 >= minPosition) {
        this.setY(this.getY() - 1);
        return true;

      } else
        return false;

    } else if (direction.equals("right")) {
      if (this.getX() + 1 <= maxPosition) {
        this.setX(this.getX() + 1);
        return true;
      } else
        return false;

    } else if (direction.equals("left")) {
      if (this.getX() - 1 >= minPosition) {
        this.setX(this.getX() - 1);
        return true;
      } else
        return false;
    }

    return false;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    if (x >= 0 || x <= maxPosition) {
      this.x = x;
    } else {
      System.out.println("Error");
    }
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    if (y >= 0 || y <= maxPosition) {
      this.y = y;
    } else {
      System.out.println("Error");
    }
  }
}
