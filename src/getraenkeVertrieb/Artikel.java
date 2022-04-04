package getraenkeVertrieb;

public class Artikel {
	public static final String KAUF_NICHT_ERFOLGREICH = "Die gewünschte Menge übersteigt den aktuellen Bestand\n";
	private String name;
	private double preis;
	private int bestand;
	private String kategorie;

	public Artikel(String name, double preis, int bestand, String kategorie) { /* erstellen der Konstruktoren plus Instanzierung */
		this.name = name;
		this.preis = preis;
		this.bestand = bestand;
		this.kategorie = kategorie;
	}

	public String getName() {
		return this.name;
	}

	public double getPreis() {
		return this.preis;
	}
	
	public int getBestand() {
		return this.bestand;
	} 
	public void setBestand(int bestand){
		this.bestand = bestand;
	}
	public String getKategorie() {
		return this.kategorie;
	}/* Übergabe für die Ausgabe */

	public void bestandErhoehen(int erhoehen) { /* Methode zum erhoehen des Bestandes */
		bestand = bestand + erhoehen;
	}

	public String kassenzettelAusgabe(int verkaufsmenge) { /* Methode zur Ausgabe des Kassenbelegs */
		String kassenzettel;
		double gesamtpreis;

		gesamtpreis = preis * verkaufsmenge;
		kassenzettel = "Name: " + name + "\n" + "Menge: " + verkaufsmenge + " Kisten" + "\n" + "Preis/Kiste: " + preis
				+ " €" + "\n" + "\nGesamtpreis: " + gesamtpreis + " €" + "\n";
		return kassenzettel;
	}

	public String verkaufen(int verkaufsmenge) { /* Methode zum verringern (verkaufen) des Bestandes */
		String verkaufcontrol;
//		if (bestand==verkaufsmenge) { /* Verzweigung zum prüfen, ob der Bestand ausreicht */
//			bestand = bestand - verkaufsmenge;
//			verkaufcontrol = kassenzettelAusgabe(verkaufsmenge) + "Bitte füllen Sie die Bestände auf: " + this.getName() + "\n";
//		} 
		if (bestand>=verkaufsmenge) {
			bestand = bestand - verkaufsmenge;
			verkaufcontrol = kassenzettelAusgabe(verkaufsmenge) + "\n";
		}
		else {
			verkaufcontrol = KAUF_NICHT_ERFOLGREICH;
		}
		return verkaufcontrol;
	}
}


