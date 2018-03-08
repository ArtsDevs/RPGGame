package Classes;

import Game.Player;

public class Mage extends Player {

	public Mage(double health, double healthMax, double mana, double manaMax, double speedAttack, double deffence, double attack, double agility, double intelligence, double vitality, double strength, String nameOfThePlayer) {
		super(health * 1.3, healthMax * 1.3, mana * 0.4, manaMax * 0.4, speedAttack, deffence + 5, attack + 5, agility, intelligence - 5, vitality + 3,  strength + 5, nameOfThePlayer);
	}

	//Kopia z wojownika
	
}

