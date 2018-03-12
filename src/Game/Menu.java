package Game;
import java.util.Scanner;

public class Menu {
    // case dla kazdego switcha danej instacji do wywoływania menu, mozna dodawac kolejne opcje

    public static void PlayerMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(e)ekwipunek/(p)wyposażenie/(s)statystyki/(x)wróć/(q)wyjdź z gry");
        String x = scanner.next();

        if(x.equals("s")) { //switchem czasami exit nie działa więc zostawiam ifa na razie
           Player.getStats();
            PlayerMenu();
        } else if (x.equals("e")) {
           // Player.Eq(); potem zrobie metode żeby całe eq wypisywała
            PlayerMenu();
        } else if (x.equals("p")) {
           // Eq.gearOn(); też dodam z mojej gry, do pokazywania co mamy "na sobie"
            PlayerMenu();
        } else if (x.equals("x")) {
            return;
        } else if(x.equals("q")){
            System.exit(1);
        }
    }
}
