package Items.Shields;

import Items.Items;

public class Shields extends Items  {

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
    public boolean requireDualWielding;





    public Shields(int dimension_x, int dimension_y, String name, int id, double improveHealth, double improveMana,
                   double improveSpeedAttack, double improveDeffence, double improveAttack, double improveBlock,
                   double improveAgility, double improveIntelligence, double improveVitality, double improveStrength,
                   double improveCrit, double durablity, double requireStrength,boolean requireDualWielding){
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
        this.requireDualWielding = requireDualWielding;


    }

}
