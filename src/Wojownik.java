package dziedziczenie.postacie;

public class Wojownik extends Postac{
	
	public void atak (double predkoscAtaku, double atak, double kryt, double si�a){
		this.predkoscAtaku = predkoscAtaku;
		this.atak = atak;
		this.kryt = kryt;
		this.si�a = si�a;
		double damage = predkoscAtaku + atak + kryt + si�a;
		System.out.println("Zadajesz: " + damage + " obra�e�");}

}
