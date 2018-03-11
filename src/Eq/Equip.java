package Eq;

import Items.Weapons.Weapons;
import Items.Weapons.WeaponsList;

public class Equip {

    public static int HPPots = 0;//potki zostawiłabym jako stały item w eq, którego się zwiększa/zmniejsza ilość
    public static int MPPots = 0;
  public static Weapons Equip[][] = new Weapons[4][5];

    public static void setHPPots(int current){
        HPPots+=current;
    }
    public static void setMPPots(int current){
        MPPots+=current;
    }
    public static int getHPPots(){
        return HPPots;
    }
    public static int getMPPots(){
        return MPPots;
    }

/* To bym wyjebała public static void set_ItemInEQ() {

       Equip[0][0] = WeaponsList.Weapon0;

    }


    //Pokazuje wszystkie paramsy danej broni.

 public static void get_ItemEq(int id) {

    id = id;

  // WeaponsList.ShowAllWeaponParams(id);

 }*/




}
