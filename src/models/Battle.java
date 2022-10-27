package models;

import interfaces.BattleMember;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Battle {
    Random random = new Random();
    private int round;

    public Battle(Monster monster, Player player){
        this.round = 0;
        int dice = random.nextInt(0, 1);
        List<Object> battleMembers = new ArrayList<>(){{
            add(monster);
            add(player);
        }};

        while(monster.getHealth() > 0 || player.getHealth() > 0){

            if(dice == 0) {
                this.attack(monster, player);
                dice++;
            } else if(dice == 1) {
                this.attack(player, monster);
                dice--;
            }

        }
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void attack(BattleMember attacker, BattleMember deffender) {
        int maxDamage = attacker.getDamage();
        int damage = random.nextInt(0,maxDamage);

        double deffenderHealth = deffender.getHealth();
        deffenderHealth -= damage;
        deffender.setHealth(deffenderHealth);
    }
}
