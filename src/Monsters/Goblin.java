package Monsters;

import Additional.Random;
import Fighting.MonsterMagic;

public class Goblin extends Monster {

    public Goblin(int health, int healthMax, int mana, int manaMax, double speedAttack, int lvl, String nameOfTheMonster, int expMin, int expMax, int coinDropMin, int coinDropMax, int damageMin, int damageMax, int minMagicDmg, int maxMagicDmg) {
        super(health, healthMax, mana, manaMax, speedAttack, lvl, nameOfTheMonster, expMin, expMax, coinDropMin, coinDropMax, damageMin, damageMax, minMagicDmg, maxMagicDmg);
    }

    public static void fight(){
        double randomAttack = Random.RInt(1,2);

        if (randomAttack == 1){
            if (getMana() >= 15){
                dealMagicDamage();
            }
            else {
                dealDamage();
            }
        }
        else {
            dealDamage();
        }


    }

    static void dealDamage(){
        physicAttack(getDamageMin(), getDamageMax()); //Normalny atak
    }

    static void dealMagicDamage(){
        MonsterMagic.useStealHealth();
    }
}
