package models;

import interfaces.BattleMember;
import org.w3c.dom.ls.LSOutput;

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
            if(monster.getHealth() < 0) {
                break;
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
        int damage = random.nextInt(maxDamage/2) + maxDamage/2;

        double deffenderHealth = deffender.getHealth();
        deffenderHealth -= damage;
        deffender.setHealth(deffenderHealth);
        attackMessage(attacker, deffender, damage);
        if(attacker.getHealth() <= 0) {
            getMembersHealth(attacker, deffender);
            battleRelatory(attacker, deffender);
        } else if(deffender.getHealth() <= 0) {
            getMembersHealth(attacker, deffender);
            battleRelatory(attacker, deffender);
        }else{
            getMembersHealth(attacker, deffender);
        }
    }

    public void battleRelatory(BattleMember winner, BattleMember loser) {
        System.out.printf("%s won the battle against %s \n" +
                "---------------------------------------\n", winner.getName(), loser.getName()).toString();
    }
    public String getMembersHealth(BattleMember attacker, BattleMember deffender) {
        return System.out.printf("%s health: %s \n%s health: %s \n" +
                "-----------------------------------------------\n", attacker.getName(), attacker.getHealth(), deffender.getName(), deffender.getHealth()).toString();
    }
    public String attackMessage(BattleMember attacker, BattleMember deffender, int  damage) {
        return System.out.printf("%s attacking %s with %s hitpoints \n", attacker.getName(), deffender.getName(), damage).toString();
    }
}
