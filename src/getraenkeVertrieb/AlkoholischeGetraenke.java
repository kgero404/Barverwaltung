package getraenkeVertrieb;
import java.lang.*;

public class AlkoholischeGetraenke extends Getraenk {
	private double promille;

	public AlkoholischeGetraenke(String name, double preis, int bestand, String kategorie, double promille) { /* erstellen der Konstruktoren plus Instanzierung */

		super(name, preis, bestand, kategorie);
		this.promille = promille;
	}
	public double getPromille() {
		return promille;
	}
}
