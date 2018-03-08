package Game;

import Additional.Random;
import Additional.Rounding;
import Fighting.HeroMagic;
import Monsters.Monster;

import java.util.Scanner;

public class Player {

	static Scanner scanner = new Scanner(System.in);

	private static String nameOfThePlayer;
	private static double health;
	private static double healthMax;
	private static double mana;
	private static double manaMax;
	private static double speedAttack;
	private static double deffence;
	private static double attack;
	private static double money;
	private static int level = 1;
	private static double exp = 0;
	private static double block;
	private static int myClass;

	private static double agility;
	private static double intelligence;
	private static double vitality;
	private static double strength;
	private static double crit;

	//GETTERS
	public static String getName(){
		return nameOfThePlayer;
	}

	public static double getHealth(){
		return health;
	}

	public static double getHealthMax(){
		return healthMax;
	}

	public static String getHealthBar(){
		return getHealth() + " / " + getHealthMax();
	}

	public static double getMana(){
		return mana;
	}

	public static double getManaMax(){
		return manaMax;
	}

	public static String getManaBar(){
		return getMana() + " / " + getManaMax();
	}

	public static double getSpeedAttack(){
		return speedAttack;
	}

	public static double getDeffence() {
		return deffence;
	}

	public static double getAttack(){
		return attack;
	}

	public static double getMoney(){
		return money;
	}

	public static double getLvl(){
		return level;
	}

	public static double getExp(){
		return exp;
	}

	public static double getBlock(){
		return block;
	}

	public static double getAgility() {
		return agility;
	}

	public static double getIntelligence(){
		return intelligence;
	}

	public static double getVitality() {
		return vitality;
	}

	public static double getStrength(){
		return strength;
	}

	public static double getCrit(){
		return crit;
	}

	public static double getAttackPower(){
		return attack*strength;
	}

	public static void getStats(){
		System.out.println("Imie: " + nameOfThePlayer);
		System.out.println("Zycie: " + getHealthBar());
		System.out.println("Mana: " + getManaBar());
		System.out.println("Predkosc ataku: " + Rounding.round(speedAttack, 2));
		System.out.println("Obrona: " + deffence);
		System.out.println("Atak: " + attack);
		System.out.println("Lvl: " + level);
		System.out.println("Exp: " + exp);
		System.out.println("Zrecznosc: " + agility);
		System.out.println("Inteligencja: " + intelligence);
		System.out.println("Witalnosc: " + vitality);
		System.out.println("Sila: " + strength);
		System.out.println("Szansa na uderzenie krytyczne: " + crit + "%");
	}

	public static int getMyClass() {
		return myClass;
	}

	//SETTERS
	public static void setName(String nameOfThePlayer){
		nameOfThePlayer = nameOfThePlayer;
	}

	public static void setHealth(double current, double max){
		health = current;
		healthMax = max;
	}

	public static void setMana(double current, double max){
		mana = current;
		manaMax = max;
	}

	public static void setSpeedAttack(double addSpeedAttack) {
		speedAttack += addSpeedAttack;
	}

	public static void setDeffence(double addDeffence){
		deffence += addDeffence;
	}

	public static void setAttack(double addAttack){
	    attack += addAttack;
    }

    public static void setMoney(double addMoney){
		money += addMoney;
	}

	public static void setLevel(double addLvl){
		level += addLvl;
		System.out.println("Gratulacje! Awansowałeś, masz teraz: " + level + " Twoje statystyki wzrosły.");
		if (myClass == 1){
			health += 20;
			healthMax += 20;
			speedAttack += 0.05;
			deffence += 2;
			attack += 2;
			strength += 1;
		}
		else if(myClass == 2){
			health += 10;
			healthMax += 10;
			speedAttack += 0.1;
			attack += 1;
			agility += 1;
			crit += 3;
		}
		else{
			health += 10;
			healthMax += 10;
			attack += 1;
			intelligence += 3;
		}
	}

	public static void setExp(double addExp){
    	exp += addExp;
    	playerLevelUp();
	}

	public static void setMyClass(int takenClass){
		myClass = takenClass;
	}

	public static void setBlock(double addBlock){
		block += addBlock;
	}

	public static void setAgility(double addAgility) {
		agility += addAgility;
	}

	public static void setIntelligence(double addIntelligence) {
		intelligence += addIntelligence;
	}

	public static void setVitality(double addVitality) {
		vitality += addVitality;
	}

	public static void setStrength(double addStrength){
		strength += addStrength;
	}

	public static void setCrit(double addCrit){
		crit += addCrit;
	}



	//Hero constructor
	public Player(double health, double healthMax, double mana, double manaMax, double speedAttack, double deffence, double attack, double agility, double intelligence, double vitality, double strength, String nameOfThePlayer){
		this.nameOfThePlayer = nameOfThePlayer;
		this.health = health;
		this.healthMax = healthMax;
		this.mana = mana;
		this.manaMax = manaMax;
		this.speedAttack = speedAttack;
		this.deffence = deffence;
		this.attack = attack;
		this.agility = agility;
		this.intelligence = intelligence;
		this.vitality = vitality;
		this.strength = strength;
	}


	//Other methods
	public static void playerLevelUp(){
		if (getExp() >= 0 && getExp() <= 100)
			Player.setLevel(1);
		else if(getExp() >= 100 && getExp() <= 200)
			Player.setLevel(1);
		else
			System.out.println("Osiągnąłeś maksymalny poziom");

	}
	public static int champLevel() {
		if (exp < 200) {
			System.out.println("Twoj level wynosi 1 ");
			return level = 1;
		}
		if (exp >= 200 && exp < 300) {
			System.out.println("Twoj level wynosi 2 ");
			return level = 2;
		}
		if (exp >= 300 && exp < 400) {
			System.out.println("Twoj level wynosi 3 ");
			return level = 3;
		}
		if (exp >= 400 && exp < 500) {
			System.out.println("Twoj level wynosi 4 ");
			return level = 4;
		}
		if (exp >= 500 && exp < 600) {
			System.out.println("Twoj level wynosi 5 ");
			return level = 5;
		}
		if (exp >= 600 && exp < 700) {
			System.out.println("Twoj level wynosi 6 ");
			return level = 6;
		}
		if (exp >= 700 && exp < 800) {
			System.out.println("Twoj level wynosi 7 ");
			return level = 7;
		}
		if (exp >= 800 && exp < 900) {
			System.out.println("Twoj level wynosi 8 ");
			return level = 8;
		}
		if (exp >= 900 && exp < 1000) {
			System.out.println("Twoj level wynosi 9 ");
			return level = 9;
		}
		return 0;
	}

	public static boolean takeDamage(double damage) {

		if(Random.Block() == true) {
			damage *= 0.2;
			health = getHealth() - damage;
			System.out.println("Zablokowaleś część obrażeń. Masz teraz: " + getHealthBar() + " punktow zycia ");
		}
		else {
			health = getHealth() - damage;
			System.out.println("Masz teraz: " + getHealthBar() + " punktow zycia");
		}
		if (getHealth() <= 0) {
			System.out.println("Umarles");
			System.exit(1);
			return true;
		}
		return false;
	}

	public static void dealDamage() {
		System.out.println("Co chcesz teraz zrobic?");
		String fight = scanner.nextLine();

		if (fight.equals("atakuj")){
			physicAttack();
		}
		else if (fight.equals("magia") && mana > 15){
			System.out.println("Napierdalosz magia");
			magicAttack();
		}
		else if (fight.equals("magia") && mana < 15){
			System.out.println("Nie masz many na zaklecia");
			dealDamage();
		}
		else if (fight.equals("pomoc")){
			System.out.println("Dostepne komendy to: atakuj, magia");
			dealDamage();
		}
		else{
			System.out.println("Zla komenda");
			dealDamage();
		}


	}

	public static void magicAttack(){

		System.out.println("Jakiego zaklecia chcialbys uzyc?");
		String spell = scanner.nextLine();
		if (spell.equals("fireball")){
			Monster.takeDamage(HeroMagic.useFireBall());
		}
		else if (spell.equals("wzmocniony atak")){
			HeroMagic.useReinforcedAttack();
		}
		else if(spell.equals("leczenie")){
			HeroMagic.useHeal();
		}
		else if (spell.equals("help")){
			System.out.println("Dostepne zaklecia to: fireball, heal, wzmocniony atak");
			magicAttack();
		}
	}

	public static void physicAttack(){
		double damage = attack*strength;
		if(Random.Cryt() == true){
			damage *= 2;
			System.out.println("Zadales: " + damage + " punktow obrazen");
			Monster.takeDamage(damage);
		}
		else{
			System.out.println("Zadales: " + damage + " punktow obrazen");
			Monster.takeDamage(damage);
		}


	}
}

