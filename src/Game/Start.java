package Game;

/**
 * Created by Przykład Jan on 27.10.2017.
 */
public class Start {

    public static void main(String[] args) {
        System.out.println("Witaj w Gothic 8 nie arkania");

        MakePlayer.setName();

        System.out.println("Twoja przygoda zaczyna sie w zrujnowanym obozowisku,");
        System.out.println("Byles jencem wojennym a obozowisko Twoich wrogow zostalo zaatakowane.");
        System.out.println("Budzisz sie rano i jedyne co pamietasz to tajemnicza postac w kapturze,");
        System.out.println("ktora Cie oswobodzila.");
        System.out.println("Co robisz ?");

        //Lokacja startowa
        Move.Camp();
    }
}











