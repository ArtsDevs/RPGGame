package Items.Jawelery;

import Items.Items;

public class Jewelery extends Items{

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
    public double durablity = 0;
    public static int JewelleryEq[] = new int[100];

    public Jewelery(int dimension_x, int dimension_y, String name, int id, double improveHealth, double improveMana,
                   double improveSpeedAttack, double improveDeffence, double improveAttack, double improveBlock,
                   double improveAgility, double improveIntelligence, double improveVitality, double improveStrength,
                   double improveCrit, double requireStrength, double durablity){
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
    public static void InitJewelleryEq(){
        for(int x = 0;x<100;x++){
            JewelleryEq[x] = -1;
        }
    }
    public static void addJewelleryToEq(int addId){
        for(int x = 0; x <100;x++){
            if(JewelleryEq[x] == -1){
                JewelleryEq[x] =JeweleryList.JewelleryArray[addId].id
                break;
            }
        }
    }



}
