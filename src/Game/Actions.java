
package Game;
import Eq.Equip;

public class Actions {

    public static void Sleep() {

        System.out.println("Kontynuujesz gre za 5s");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Regenerujesz część MP i HP");
        Player.setHealth(0.1 * Player.getHealthMax(), 0);//można zmienić przemnożnik, bo mało hapsów regeneruje
        if (Player.getHealth() > Player.getHealthMax()) {
            Player.setHealth(Player.getHealthMax() - Player.getHealth(), 0);
        }
        Player.setMana(0.1 * Player.getManaMax(), 0);
        if (Player.getMana() > Player.getManaMax()) {
            Player.setHealth(Player.getMana() - Player.getManaMax(), 0);
        }
    }

    public static void UseHPPots() {
        if (Player.getHealth() < Player.getHealthMax()) {
            if (Equip.getHPPots() > 0) {
                System.out.println("Wypijasz miksturę i regenerujesz część hp");

                Player.setHealth(0.05 * Player.getHealthMax(), 0);//tutaj tak samo
                Equip.HPPots--;
                if (Player.getHealth() > Player.getHealthMax()) {
                    Player.setHealth(Player.getHealthMax() - Player.getHealth(), 0);

                }
            } else if (Equip.getHPPots() <= 0) {
                System.out.println("Nie masz żadnej mikstury");
            }
        } else if (Player.getHealth() == Player.getHealthMax()) {
            System.out.println("Twoje życie jest pełne");
        }
    }

    public static void UseManaPots() {
        if (Player.getMana() < Player.getManaMax()) {
            if (Equip.getMPPots() > 0) {
                System.out.println("Wypijasz miksturę i regenerujesz część MP");
                Equip.MPPots--;
                Player.setMana(0.05 * Player.getHealth(), 0);
                if (Player.getMana() > Player.getManaMax()) {
                    Player.setMana(Player.getManaMax() - Player.getMana(), 0);
                }
            } else if (Equip.getMPPots() <= 0) {
                System.out.println("Nie masz żadnej mikstury");
            }
        } else if (Player.getMana() == Player.getManaMax()) {
            System.out.println("Twoja mana jest pełna");
        }
    }
}
