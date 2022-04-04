package getraenkeVertrieb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

public class BesterButtonVonWelt extends JButton  {			//gaaanz tolles ding!!!!!
	
	private Artikel artikel;
	
	JTextPane verkaufEingabe;
	JTextPane ausgabeTxt;
	JTextPane txtWarenkorb;
	VerkaufButton verkauf;
	VerkaufButton bestellen;
	
	public BesterButtonVonWelt(Artikel artikel, JTextPane ausgabeTxt, VerkaufButton verkauf, VerkaufButton bestellen, JTextPane verkaufEingabe, JTextPane txtWarenkorb) {
		this.ausgabeTxt = ausgabeTxt;
		this.artikel = artikel;
		this.verkauf = verkauf;
		this.bestellen = bestellen;
		this.verkaufEingabe = verkaufEingabe;
		this.txtWarenkorb = txtWarenkorb;
		setText(artikel.getName());
		addActionListener(e -> aktionButton(e));
	}

	private void aktionButton(ActionEvent e) {
		verkaufEingabe.setText("" + 0);
		verkauf.addActionListener(f -> aktionVerkauf(f));
		bestellen.addActionListener(f -> aktionBestellen(f));
		String outputText = "Ware: " + artikel.getName() + "\nPreis: " + artikel.getPreis() + " €"
		+ "\n" + "Bestand: " + artikel.getBestand() + " Kisten" + "\n" + "Kategorie: " + artikel.getKategorie();
		if(artikel instanceof Snack ) {
			outputText += "\nhaltbar bis: " + ((Snack)artikel).getMhd() + "\nGewicht: " + ((Snack)artikel).getMasse()+ " g" ;
		}
		else if(artikel instanceof AlkoholischeGetraenke ) {
			outputText += "\nAlkoholgehalt: " + ((AlkoholischeGetraenke)artikel).getPromille()+ " %";
		}
		ausgabeTxt.setText(outputText);
		
	}
	
	private void aktionVerkauf(ActionEvent e) {
		try {																	// immer wenn die eingabe nicht dem Datentyp entsprict
			int verkaufsmenge = Integer.parseInt(verkaufEingabe.getText());
			String verkaufenAntwort = artikel.verkaufen(verkaufsmenge);
			JOptionPane.showMessageDialog(null,verkaufenAntwort);				// Fehleranzeige, wenn der kauf den Bestand uebersteigt
			aktionButton(null);
			if(!Artikel.KAUF_NICHT_ERFOLGREICH.equals(verkaufenAntwort)) {
				updateWarenkorbVerkaufen(verkaufsmenge);	
			}
		}
		catch(NumberFormatException h) {										// zeigt fehler an: eingabe kein INT daher bitte zahl eingeben
			JOptionPane.showMessageDialog(null,"Gib nur Zahlen ein!");
		}
	}

	private void updateWarenkorbVerkaufen(int verkaufsmenge) {
		String inhalt = txtWarenkorb.getText();
		inhalt += verkaufsmenge + " " + artikel.getName()+ " " + artikel.getPreis()*verkaufsmenge + "€\n";
		txtWarenkorb.setText(inhalt);
	}
	
	private void aktionBestellen(ActionEvent f) {
			int bestellmenge = Integer.parseInt(verkaufEingabe.getText());
			artikel.bestandErhoehen(bestellmenge);
			aktionButton(null);
			updateWarenkorbBestellen(bestellmenge);
	}
	private void updateWarenkorbBestellen(int erhoehen) {
		String inhalt = txtWarenkorb.getText();
		inhalt += erhoehen + " " + artikel.getName()+ " " + (artikel.getPreis()-2)*erhoehen + " " + artikel.getBestand() + "€\n";
		txtWarenkorb.setText(inhalt);
	}

}
