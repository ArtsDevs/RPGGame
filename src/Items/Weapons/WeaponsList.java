package Items.Weapons;

import Items.Weapons.Weapons;

import java.util.Scanner;


public class WeaponsList {


    public static Weapons Weapon0 = new Weapons(1, 1, "Raw steel", 1, 3,
            0, 0.3, 0, 5, 1, 1,
            1, 1, 1, 1, 1, 50);

    public static Weapons Weapon1 = new Weapons(1, 2, "Rust Sword", 2, 5,
            2, 0.6, 2, 2, 1, 1,
            1, 1, 1, 1, 1, 50);

    public static Weapons Weapon2 = new Weapons(1, 3, "Steel Sword", 3, 3,
            0, 0.3, 0, 0, 2, 1,
            1, 1, 1, 5, 1, 50);

    public static Weapons Weapon3 = new Weapons(1, 4, "Double Axe", 4, 3,
            0, 0.3, 0, 10, 3, 5,
            8, 12, 4, 5, 1, 50);

    public static Weapons Weapon4 = new Weapons(1, 5, "Staff of Fire", 5, 3,
            0, 0.3, 0, 0, 2, 5,
            6, 5, 4, 2, 1, 50);

    public static Weapons Weapon5 = new Weapons(1, 6, "Metal Claws", 6, 3,
            0, 0.3, 0, 0, 4, 8,
            4, 1, 1, 5, 1, 50);

    public static Weapons Weapon6 = new Weapons(1, 7, "Staff of Death", 7, 3,
            0, 0.3, 0, 0, 2, 8,
            12, 8, 2, 4, 1, 50);

    public static Weapons Weapon7 = new Weapons(1, 8, "Sword of Sorrows", 8, 3,
            0, 0.3, 0, 0, 11, 1,
            4, 5, 1, 4, 1, 50);

    public static Weapons Weapon8 = new Weapons(1, 9, "Kupa na kiju", 9, 3,
            0, 0.3, 0, 0, 45, 1,
            15, 1, 4, 5, 1, 50);
// Tablica obiektów.


   public static Weapons SwordsArray[] = {Weapon1, Weapon2, Weapon3, Weapon4, Weapon5, Weapon6, Weapon7, Weapon8};
    Scanner odczyt = new Scanner(System.in);

// METODY DO ZNAJDOWANIA OKRESLONYCH PARAMSÓW W TABLICY WEAPONS.

//-------------------------------------------------------------------------------------------------------
    // Wybierz indeks itemu który miał zostać wysłany
    public static void FindInArrayID(int iD) {

        for (int i = 0; i < SwordsArray.length; i++) {

            if (SwordsArray[i].id == iD) {
                System.out.println("Przedmiot o identyfikatorze: " + iD + " to:  " + SwordsArray[i].name);
            } else if (SwordsArray[i].id != iD) {
                System.out.println("Sout testowy gdy wartośc jest nieznaleziona ! Trzeba później wrzucić ją w wyjątek");
            }
        }

    }
    //-------------------------------------------------------------------------------------------------------



    public static void FindInArrayName(String newName) {

        newName.equals(newName);

        for (int i = 0; i < SwordsArray.length; i++) {

            if (SwordsArray[i].name.equals(newName) == true) {
                System.out.println("Przedmiot o nazwie: " + SwordsArray[i].name + " ma ID równe: " + SwordsArray[i].id);
            } else if (SwordsArray[i].name.equals(newName) == false) {
                System.out.println("nie znaleziono itema o takiej nazwie");
            }
        }



    }

    public static void GetAllWeaponParams(int iD) {
        iD = iD;

        for (int i = 0; i < SwordsArray.length; i++) {

            if (SwordsArray[i].id == iD) {
                System.out.println("");
                System.out.println("BASE");
                System.out.println("___________________________________________________");
                System.out.println("ID: " + SwordsArray[i].id);
                System.out.println("Name: " +SwordsArray[i].name);
                System.out.println("");
                System.out.println("IMPROVMENTS");
                System.out.println("___________________________________________________");
                System.out.println("Health: " +SwordsArray[i].improveHealth);
                System.out.println("Crit: " + SwordsArray[i].improveCrit);
                System.out.println("Attack: " +SwordsArray[i].improveAttack);
                System.out.println("Speed Attack: " +SwordsArray[i].improveSpeedAttack);
                System.out.println("Strength: " +SwordsArray[i].improveStrength);
                System.out.println("Agility: " +SwordsArray[i].improveAgility);
                System.out.println("Block: " +SwordsArray[i].improveBlock);
                System.out.println("Deffence: " +SwordsArray[i].improveDeffence);
                System.out.println("Intelligence: " +SwordsArray[i].improveIntelligence);
                System.out.println("Mana: " +SwordsArray[i].improveMana);
                System.out.println("Vitality: " +SwordsArray[i].improveVitality);
                System.out.println("");
                System.out.println("___________________________________________________");
                System.out.println("Require Strength: " +SwordsArray[i].requireStrength);
                System.out.println("Durablity: " +SwordsArray[i].durablity);

            } else if (SwordsArray[i].id != iD) {

            }
        }





}



}
