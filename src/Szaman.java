package dziedziczenie.postacie;

public class Szaman extends Postac {

	public void atak (double predkoscAtaku, double atak, double kryt, double inteligencja, double zr�cznos�){
		this.predkoscAtaku = predkoscAtaku;
		this.atak = atak;
		this.kryt = kryt;
		this.inteligencja = inteligencja;
		this.zr�czno�� = zr�czno��;
		double damage = predkoscAtaku + atak + kryt + inteligencja + zr�czno��;
		System.out.println("Zadajesz: " + damage + " obra�e�");}
	
}

