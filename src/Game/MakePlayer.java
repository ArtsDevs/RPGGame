package Game;

import Classes.Mage;
import Classes.Rogue;
import Classes.Warrior;
import Additional.InvalidClassRange;

import java.util.Scanner;

public class MakePlayer {

    static Scanner scanner = new Scanner(System.in);
    
    static String name;
    
    public static String setName(){
        System.out.println("Podaj imie bohatera");
        name = scanner.nextLine();

        System.out.println("Wybierz klasę (Podaj numer): ");
        System.out.println("1 - Warrior: Zdrowie * 1.3, Mana * 0.4, Obrona + 5, Atak + 5, Inteligencja - 3, Witalność + 2");
        System.out.println("2 - Łotr: Zdrowie * 0.8, Prędkość ataku: * 1.1, Obrona - 3, Atak + 1, Zręczność + 5, Witalnośc - 2");
        System.out.println("3 - Szaman");
        
        setClass();
        
        return name;
    }
        
    public static String getName() {
		return name;
	}




	public static void setClass() {
    	int playerClass = scanner.nextInt();
        Player.setMyClass(playerClass);

        	if (Player.getMyClass() == 1 ){
                Warrior warrior = new Warrior(100, 100, 30, 30, 0.8, 5, 10, 3, 5, 5, 5, getName());
                System.out.println("Wybrałeś/aś wojownika, powodzenia!");
            }
            else if (Player.getMyClass() == 2){
                Rogue rogue = new Rogue(100, 100, 30, 30, 1, 5, 5, 5, 5, 5, 5, getName());
                System.out.println("Wybrałeś/aś łotra, powodzenia!");
            }
            else if (Player.getMyClass() == 3){
                Mage mage = new Mage(70, 70, 80, 80, 1, 3, 7, 3, 8, 4, 2, getName());
                System.out.println("Wybrałeś/aś maga, powodzenia z maną zią!");
            }
            else if(Player.getMyClass() > 3){


				try {
					throw new InvalidClassRange("Wybierz ponownie");
				} catch (InvalidClassRange e) {
					// TODO Auto-generated catch block
					System.out.println("Wybrałes klasę z poza listy, wybierz jeszcze raz");
					setClass();
				}
        	Move.Camp();
        }
           
   }}
