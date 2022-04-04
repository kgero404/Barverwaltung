package getraenkeVertrieb;

public class Snack extends Artikel {
	private int masse;
	private String mhd;

	public Snack(String name, double preis, int bestand, String kategorie, int masse, String mhd) { /* erstellen der Konstruktoren plus Instanzierung */

		super(name, preis, bestand, kategorie);
		this.masse = masse;
		this.mhd = mhd;
	}
	public int getMasse() {
		return masse;
	}
	public String getMhd() {
		return mhd;
	}
}
