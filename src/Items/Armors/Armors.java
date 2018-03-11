package Items.Armors;

import Items.Items;

public class Armors extends Items {

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
    public static int ArmorsEq[] = new int[100];

    public Armors(int dimension_x, int dimension_y, String name, int id, double improveHealth, double improveMana,
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
    /* osobny eq dla każdego rodzaju itemu, inicjalizuje że kazdy slot ma wartosc -1, potem porównuje do tego -1 i wpisuje id itemu na dane miejsce
    na 0 to nie działa, bo id sie zaczynają od 0.     */
    public static void InitArmorsEq(){
        for(int x = 0;x<100;x++){
            ArmorsEq[x] = -1;
        }
    }
    public static void addShieldToEq(int addId){
        for(int x = 0; x <100;x++){
            if(ArmorsEq[x] == -1){
               ArmorsEq[x] = ArmorsList.ArmorsArray[addId].id;
                break;
            }
        }
    }

}
