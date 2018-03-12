package Game;

import java.util.Scanner;

/**
 * Created by Przykład Jan on 07.11.2017.
 */
public class Move {

    static int keyToMansion = 0;
    static int torch = 0;
    static int secretRoom = 0;

    static Scanner scanner = new Scanner(System.in);

    public static void Camp() {

        String a = scanner.nextLine();

        switch (a) {
            case "idz na polnoc":
                if(torch == 1){
                    System.out.println("Padpalasz pochodnia haszcze ktore blokowalay droge. Teraz mozesz przedostać sie dalej");
                    Forest();
                }else
                {
                    System.out.println("Droge blokuja haszcze, nie mozesz sie przedostac na druga strone");
                    Camp();
                }

            case "idz na poludnie":
                System.out.println("Idziesz na Battlefield");
                Battlefield();

            case "idz na zachod":
                System.out.println("Idziesz do Field1");
                Field1();

            case "idz na wschod":
                System.out.println("Idziesz do well");
                Well();

            case "statystyki":
                Player.getStats();
                Camp();

            case "wyjdz":
                System.exit(1);

            case "dodaj expa":
                Player.setExp(50);
                System.out.println("Dodałeś sobie 50 expa");
                Camp();

            case "m":
                Menu.PlayerMenu();

            default:
                System.out.println("Co Ty odpierdalasz?");
                Camp();
        }
    }

    public static void Well(){

        String a = scanner.nextLine();

        switch (a) {
            case "idz na polnoc":
                System.out.println("Nie da się tam iść");
                Well();

            case "idz na poludnie":
                System.out.println("Nie da się tam iść");
                Well();

            case "idz na zachod":
                System.out.println("Idziesz do Field2");
                Field2();

            case "idz na wschod":
                System.out.println("Wracasz do Camp");
                Camp();

            case "statystyki":
                Player.getStats();
                Well();

            case "wyjdz":
                System.exit(1);

            default:
                System.out.println("Co Ty odpierdalasz?");
                Well();
        }

    }

    public static void Field1(){

        String a = scanner.nextLine();

        switch (a) {
            case "idz na polnoc":
                System.out.println("Nie da się tam iść");
                Field1();

            case "idz na poludnie":
                System.out.println("Nie da się tam iść");
                Field1();

            case "idz na wschod":
                System.out.println("Idziesz do Camp");
                Camp();

            case "idz na zachod":
                System.out.println("Idziesz do Hut");
                Hut();

            case "statystyki":
                Player.getStats();
                Field1();

            case "wyjdz":
                System.exit(1);

            default:
                System.out.println("Co Ty odpierdalasz?");
                Field1();
        }

    }

    public static void Field2(){

        String a = scanner.nextLine();

        switch (a) {
            case "idz na polnoc":
                System.out.println("Nie da się tam iść");
                Field2();

            case "idz na poludnie":
                System.out.println("Nie da się tam iść");
                Field2();

            case "idz na wschod":
                System.out.println("Idziesz do Graveyard");
                Graveyard();

            case "idz na zachod":
                System.out.println("Idziesz do Well");
                Field2();

            case "statystyki":
                Player.getStats();
                Camp();

            case "wyjdz":
                System.exit(1);

            default:
                System.out.println("Co Ty odpierdalasz?");
                Camp();
        }

    }

    public static void Graveyard(){

        String a = scanner.nextLine();

        switch (a) {
            case "idz na polnoc":
                Mansion();

            case "idz na poludnie":
                System.out.println("tam nic nie ma");
                Graveyard();

            case "idz na wschod":
                System.out.println("tam nic nie ma");
                Graveyard();

            case "idz na zachod":
                Field2();

            case "statystyki":
                Player.getStats();
                Camp();

            case "wyjdz":
                System.exit(1);

            default:
                System.out.println("Co Ty odpierdalasz?");
                Graveyard();
        }

    }

    public static void Mansion(){

        String a = scanner.nextLine();

        switch (a) {
            case "idz na polnoc":
                System.out.println("tam nic nie ma");
                Mansion();

            case "idz na poludnie":
                Graveyard();

            case "idz na wschod":
                System.out.println("tam nic nie ma");
                Mansion();

            case "idz na zachod":
                System.out.println("tam nic nie ma");
                Mansion();

            case "statystyki":
                Player.getStats();
                Mansion();

            case "wyjdz":
                System.exit(1);


            default:
                System.out.println("Co Ty odpierdalasz?");
                Mansion();
        }

    }

    public static void Battlefield(){

        String a = scanner.nextLine();

        switch (a) {
            case "idz na polnoc":
                Camp();

            case "idz na poludnie":
                System.out.println("tam nic nie ma");
                Battlefield();

            case "idz na wschod":
                System.out.println("tam nic nie ma");
                Battlefield();

            case "idz na zachod":
                System.out.println("tam nic nie ma");
                Battlefield();


            case "statystyki":
                Player.getStats();
                Battlefield();

            case "wyjdz":
                System.exit(1);


            default:
                System.out.println("Co Ty odpierdalasz?");
                Battlefield();
        }

    }

    public static void Forest(){

        String a = scanner.nextLine();

        switch (a) {
            case "idz na polnoc":
                Dungeon();

            case "idz na poludnie":
                Camp();

            case "idz na wschod":
                System.out.println("tam nic nie ma");
                Forest();

            case "idz na zachod":
                System.out.println("tam nic nie ma");
                Forest();

            case "statystyki":
                Player.getStats();
                Forest();

            case "wyjdz":
                System.exit(1);

            default:
                System.out.println("Co Ty odpierdalasz?");
                Forest();
        }

    }

    public static void Dungeon(){

        String a = scanner.nextLine();

        switch (a) {
            case "idz na polnoc":
                System.out.println("tam nic nie ma");
                Dungeon();

            case "idz na poludnie":
                Forest();

            case "idz na wschod":
                System.out.println("tam nic nie ma");
                Dungeon();

            case "idz na zachod":
                System.out.println("tam nic nie ma");
                Dungeon();

            case "statystyki":
                Player.getStats();
                Dungeon();

            case "wyjdz":
                System.exit(1);

            default:
                System.out.println("Co Ty odpierdalasz?");
                Dungeon();
        }

    }

    public static void SecretRoom(){

        String a = scanner.nextLine();

        switch (a) {
            case "idz na polnoc":
                System.out.println("Cosik");
                SecretRoom();

            case "idz na poludnie":
                System.out.println("Cosik");
                SecretRoom();

            case "idz na wschod":
                System.out.println("Wyjdz na Field1");
                Field1();

            case "idz na zachod":
                System.out.println("Cosik");
                SecretRoom();

            case "statystyki":
                Player.getStats();
                Field1();

            case "wyjdz":
                System.exit(1);

            default:
                System.out.println("Co Ty odpierdalasz?");
                Field1();
        }

    }

    public static void Hut(){

        String a = scanner.nextLine();

        switch (a) {
            case "idz na polnoc":
                SwordPlace();

            case "idz na poludnie":
                System.out.println("tam nic nie ma");
                Hut();

            case "idz na wschod":
                Field1();

            case "idz na zachod":
                System.out.println("tu bedzie jakas zagadka albo klucz");
                Hut();

            case "statystyki":
                Player.getStats();
                Hut();

            case "wyjdz":
                System.exit(1);

            case "przeszukaj domek":
                System.out.println("Znalazles pochodnie!");
                torch = 1;
                Hut();

            default:
                System.out.println("Co Ty odpierdalasz?");
                Hut();
        }

    }

    public static void SwordPlace(){

        String a = scanner.nextLine();

        switch (a) {
            case "idz na polnoc":
                System.out.println("tam nic nie ma");
                SwordPlace();

            case "idz na poludnie":
                Hut();

            case "idz na wschod":
                System.out.println("tam nic nie ma");
                SwordPlace();

            case "idz na zachod":
                System.out.println("tam nic nie ma");
                SwordPlace();

            case "statystyki":
                Player.getStats();
                SwordPlace();

            case "wyjdz":
                System.exit(1);

            default:
                System.out.println("Co Ty odpierdalasz?");
                SwordPlace();
        }

    }
}


