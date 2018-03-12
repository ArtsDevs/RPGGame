package Items.Weapons;

import Items.Items;
import Game.Player;


public class Weapons extends Items {


    public double improveHealth;
    public double improveMana;
    public double improveSpeedAttack;
    public double improveDeffence;
    public double improveAttack;
    public double improveBlock;

    public double improveAgility;
    public double improveIntelligence;
    public double improveVitality;
    public double improveStrength;
    public double improveCrit;

    public double requireStrength;
    public double durablity;
    public int id;
    public static int WeaponsEq[] = new int[100];
    public static String currentWeaponName = WeaponsList.SwordsArray[currentWeapon].name;
    public static int currentWeapon;



    public Weapons(int dimension_x, int dimension_y, String name, int id, double improveHealth, double improveMana,
                   double improveSpeedAttack, double improveDeffence, double improveAttack, double improveBlock,
                   double improveAgility, double improveIntelligence, double improveVitality, double improveStrength,
                   double improveCrit,double requireStrength, double durablity){
        super(name, dimension_x, dimension_y, id);

        this.improveHealth = improveHealth;
        this.improveMana = improveMana;
        this.improveSpeedAttack = improveSpeedAttack;
        this.improveDeffence = improveDeffence;
        this.improveAttack = improveAttack;
        this.improveBlock = improveBlock;
        this.improveAgility = improveAgility;
        this.improveIntelligence = improveIntelligence;
        this.improveVitality = improveVitality;
        this.improveStrength = improveStrength;
        this.improveCrit = improveCrit;
        this.requireStrength = requireStrength;
        this.durablity = durablity;

    }
    public static void InitWeaponEq(){
        for(int x = 0;x<100;x++){
            WeaponsEq[x] = -1;
        }
    }
    public static void addWeaponToEq(int addId){
        for(int x = 0; x <100;x++){
            if(WeaponsEq[x] == -1){
                WeaponsEq[x] = WeaponsList.SwordsArray[addId].id;
                break;
            }
        }
    }

    //odejmuje staty z broni aktualnie ubranej i zwraca ją do ekwipunku

    public static void unequipWeapon(int current)
    {
        Player.setAttack( - WeaponsList.SwordsArray[current].improveAttack);
        Player.setHealth( - WeaponsList.SwordsArray[current].improveHealth,- WeaponsList.SwordsArray[current].improveHealth);
        Player.setDeffence(- WeaponsList.SwordsArray[current].improveDeffence);
        Player.setMana( -WeaponsList.SwordsArray[current].improveMana,-WeaponsList.SwordsArray[current].improveMana );
        Player.setAgility(-WeaponsList.SwordsArray[current].improveAgility);
        Player.setCrit(-WeaponsList.SwordsArray[current].improveCrit);
        Player.setIntelligence(-WeaponsList.SwordsArray[current].improveIntelligence);
        Player.setBlock(-WeaponsList.SwordsArray[current].improveBlock);
        Player.setVitality(-WeaponsList.SwordsArray[current].improveVitality);
        Player.setStrength(-WeaponsList.SwordsArray[current].improveStrength);
        Player.setSpeedAttack(-WeaponsList.SwordsArray[current].improveSpeedAttack);

        addWeaponToEq(current);
    }

    public static void setCurrentWeapon(int current){

        currentWeapon = current;
        currentWeaponName = WeaponsList.SwordsArray[currentWeapon].name;
        Player.setAttack(WeaponsList.SwordsArray[current].improveAttack);
        Player.setHealth(WeaponsList.SwordsArray[current].improveHealth,WeaponsList.SwordsArray[current].improveHealth);
        Player.setDeffence(WeaponsList.SwordsArray[current].improveDeffence);
        Player.setMana( WeaponsList.SwordsArray[current].improveMana,WeaponsList.SwordsArray[current].improveMana );
        Player.setAgility(WeaponsList.SwordsArray[current].improveAgility);
        Player.setCrit(WeaponsList.SwordsArray[current].improveCrit);
        Player.setIntelligence(WeaponsList.SwordsArray[current].improveIntelligence);
        Player.setBlock(WeaponsList.SwordsArray[current].improveBlock);
        Player.setVitality(WeaponsList.SwordsArray[current].improveVitality);
        Player.setStrength(WeaponsList.SwordsArray[current].improveStrength);
        Player.setSpeedAttack(WeaponsList.SwordsArray[current].improveSpeedAttack);

        //i jeszcze trzeba dodać żeby usunęło ubieraną broń z eq

    }
}

