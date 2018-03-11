import Game.Player;
import Items.Weapons.WeaponsList;

import Items.Armors.ArmorsList;
import Items.Jawelery.JeweleryList;

public class Main {

    public static void main(String args[]) {
        
        /*
        TO DO:
        1. Zrobić ekwipunek.
        2. Zrobić lvlowanie postaci.
        3. Program się sypie, jeśli ziomek wybierze klasę z poza listy.
        4. Łotrowi nie daje bonusowego crita.
        5. Zrobić jakiś warunek w booleanie, żeby sprawdzał czy zabiliśmy już tego przeciwnika. np. idę na wschód, zabiję Zombie
            i chcę żeby było coś w stylu isZombieDead = true;
         */

    }

    /*public static void getItem(int weaponId){
        double improveHealth;
        double improveMana;
        double improveSpeedAttack;
        double improveAttack;
        double improveBlock;

        double improveAgility;
        double improveIntelligence;
        double improveStrength;
        double improveCrit;


        int x = 1; //Dimension X z items
        

        if(x == 1){
            improveHealth = WeaponsList.SwordsArray[weaponId].improveHealth;
            improveMana = WeaponsList.SwordsArray[weaponId].improveMana;
            improveSpeedAttack = WeaponsList.SwordsArray[weaponId].improveSpeedAttack;
            improveAttack = WeaponsList.SwordsArray[weaponId].improveAttack;
            improveBlock = WeaponsList.SwordsArray[weaponId].improveBlock;
            improveAgility = WeaponsList.SwordsArray[weaponId].improveAgility;
            improveIntelligence = WeaponsList.SwordsArray[weaponId].improveIntelligence;
            improveStrength = WeaponsList.SwordsArray[weaponId].improveStrength;
            improveCrit = WeaponsList.SwordsArray[weaponId].improveCrit;


            Player.setHealth(Player.getHealth(), Player.getHealthMax() + improveHealth);
            Player.setMana(Player.getMana(), Player.getManaMax() + improveMana);
            Player.setSpeedAttack(improveSpeedAttack);
            Player.setAttack(improveAttack);
            Player.setBlock(improveBlock);
            Player.setAgility(improveAgility);
            Player.setIntelligence(improveIntelligence);
            Player.setStrength(improveStrength);
            Player.setCrit(improveCrit);
        }
        else if (x == 2){
            improveHealth = ArmorsList.ArmorsArray[weaponId].improveHealth;
            improveMana = ArmorsList.ArmorsArray[weaponId].improveMana;
            improveSpeedAttack = ArmorsList.ArmorsArray[weaponId].improveSpeedAttack;
            improveAttack = ArmorsList.ArmorsArray[weaponId].improveAttack;
            improveBlock = ArmorsList.ArmorsArray[weaponId].improveBlock;
            improveAgility = ArmorsList.ArmorsArray[weaponId].improveAgility;
            improveIntelligence = ArmorsList.ArmorsArray[weaponId].improveIntelligence;
            improveStrength = ArmorsList.ArmorsArray[weaponId].improveStrength;
            improveCrit = ArmorsList.ArmorsArray[weaponId].improveCrit;

            Player.setHealth(Player.getHealth(), Player.getHealthMax() + improveHealth);
            Player.setMana(Player.getMana(), Player.getManaMax() + improveMana);
            Player.setSpeedAttack(improveSpeedAttack);
            Player.setAttack(improveAttack);
            Player.setBlock(improveBlock);
            Player.setAgility(improveAgility);
            Player.setIntelligence(improveIntelligence);
            Player.setStrength(improveStrength);
            Player.setCrit(improveCrit);
        }
        else if (x == 3){
            improveHealth = JeweleryList.JeweleryArray[weaponId].improveHealth;
            improveMana = JeweleryList.JeweleryArray[weaponId].improveMana;
            improveSpeedAttack = JeweleryList.JeweleryArray[weaponId].improveSpeedAttack;
            improveAttack = JeweleryList.JeweleryArray[weaponId].improveAttack;
            improveBlock = JeweleryList.JeweleryArray[weaponId].improveBlock;
            improveAgility = JeweleryList.JeweleryArray[weaponId].improveAgility;
            improveIntelligence = JeweleryList.JeweleryArray[weaponId].improveIntelligence;
            improveStrength = JeweleryList.JeweleryArray[weaponId].improveStrength;
            improveCrit = JeweleryList.JeweleryArray[weaponId].improveCrit;

            Player.setHealth(Player.getHealth(), Player.getHealthMax() + improveHealth);
            Player.setMana(Player.getMana(), Player.getManaMax() + improveMana);
            Player.setSpeedAttack(improveSpeedAttack);
            Player.setAttack(improveAttack);
            Player.setBlock(improveBlock);
            Player.setAgility(improveAgility);
            Player.setIntelligence(improveIntelligence);
            Player.setStrength(improveStrength);
            Player.setCrit(improveCrit);
        }
    }
    */
}
