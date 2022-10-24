package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Battle {
    Random random = new Random();
    private int round;
    private int dice;
    public Battle(Monster monster, Player player){
        this.round = 0;
        this.dice = random.nextInt(0,1);

        List battleMembers = new ArrayList<>();
        battleMembers.add(monster);
        battleMembers.add(player);

        while(monster.getHealth() > 0 || player.getHealth() > 0){
            if(round == 0) {
                battleMembers.get(dice);

            } else{

            }

        }
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
