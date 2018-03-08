package Eq;

import Items.Weapons.Weapons;
import Items.Weapons.WeaponsList;

public class Equip {

  public static Weapons Equip[][] = new Weapons[4][5];



 public static void set_ItemInEQ() {

       Equip[0][0] = WeaponsList.Weapon0;

    }


    //Pokazuje wszystkie paramsy danej broni.

 public static void get_ItemEq(int id) {

    id = id;

  // WeaponsList.ShowAllWeaponParams(id);

 }




}
