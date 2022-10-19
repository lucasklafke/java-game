import models.Board;
import models.Monster;
import models.monsters.Spider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        boolean trophy = false;
        while(!trophy) {

        }
        Monster monster = new Monster("spider", 20,20);
        System.out.println(monster.getMonsters().get(0).getName());
    }
}