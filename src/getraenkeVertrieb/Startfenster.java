package getraenkeVertrieb;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Startfenster implements ActionListener {
	JPanel panbu = new JPanel();
	JPanel panueber = new JPanel();
	JLabel einslb = new JLabel();											//O Button
	JTextPane uebertxt = new JTextPane();
	JTextPane kontxt = new JTextPane();
	JFrame einsfr = new JFrame();											//Objekt Frame
	ImageIcon logo = new ImageIcon("logo.png");								//create ImageIcon
	ImageIcon logo2 = new ImageIcon("logo 2.png");	
	JButton artikel = new JButton();
	JButton ueberuns = new JButton();
	JButton kontakt = new JButton();
	JButton inventur = new JButton();
	
	private ArrayList<Getraenk> getraenkeListe;
	private ArrayList<Snack> snackListe;
	private ArrayList<AlkoholischeGetraenke> alkListe;
	
	Startfenster(ArrayList<Getraenk> getraenkeListe, ArrayList<Snack> snackListe, ArrayList<AlkoholischeGetraenke> alkListe) {		
		this.getraenkeListe = getraenkeListe;
		this.snackListe = snackListe;
		this.alkListe = alkListe;
		
		//Button
	//Artikel										
		artikel.setBounds(20,50,120,40);
		artikel.addActionListener(this);
		artikel.setFocusable(false);
		artikel.setText("Angebot");
		artikel.setForeground(new Color(0x2A3D47));
		artikel.setBackground(new Color(70,15,10));
		artikel.setFont(new Font("MV Boli",Font.BOLD,20));
		artikel.setBorder(null);
		
	//ueber uns
		ueberuns.setBounds(145,50,120,40);
		ueberuns.addActionListener(this);
		ueberuns.setFocusable(false);
		ueberuns.setText("Ueber uns");
		ueberuns.setForeground(new Color(0x2A3D47));
		ueberuns.setBackground(new Color(70,15,10));
		ueberuns.setFont(new Font("MV Boli",Font.BOLD,20));
		ueberuns.setBorder(null);
		
	//Kontakt
		kontakt.setBounds(270,50,120,40);
		kontakt.addActionListener(this);
		kontakt.setFocusable(false);
		kontakt.setText("Kontakt");
		kontakt.setForeground(new Color(0x2A3D47));
		kontakt.setBackground(new Color(70,15,10));
		kontakt.setFont(new Font("MV Boli",Font.BOLD,20));
		kontakt.setBorder(null);
		
	//Inventur
		inventur.setBounds(395,50,120,40);
		inventur.addActionListener(this);
		inventur.setFocusable(false);
		inventur.setText("Inventur");
		inventur.setForeground(new Color(0x2A3D47));
		inventur.setBackground(new Color(70,15,10));
		inventur.setFont(new Font("MV Boli",Font.BOLD,20));
		inventur.setBorder(null);
		
//Panel
	//Button
		panbu.setBackground(new Color(0x081C15));
		panbu.setBounds(0,0,1200,180); 
	//ueber uns kontakt
		panueber.setBackground(new Color(0x081C15));
		panueber.setBounds(245,180,695,720); 
		panueber.setVisible(false);
//Label		
	//label Logo
		einslb.setIcon(logo2);
		einslb.setHorizontalAlignment(JLabel.CENTER);
		einslb.setVerticalAlignment(JLabel.BOTTOM);
		einslb.setForeground(new Color(10,150,75));
		einslb.setFont(new Font("MV Boli",Font.PLAIN,50));
		
//TextPane 
	//Kontakt
		kontxt.setBounds(250,180,650,720);		
		kontxt.setFont(new Font("MV Boli",Font.PLAIN,20));
		kontxt.setBackground(new Color(0x081C15));
		kontxt.setText("DER WEG ZU UNS!" + "\r" + "\r" + "Ein von uns besetztes Stück Erde:"  
				 + "\r" + "GetraenkeVertieb Kollektiv"
				 + "\r" + "Steil-Nach-Unten-Chausee 13 Q"
				 + "\r" + "23532 Unterholzgarmin"
				 + "\n"    
				 + "\r" + "Mit Wählscheibe, Fax oder unterwegs Erreichbar unter:" + "\r" + "Tel. +5230 45817445-81"
				 + "\r" + "Fax: +5230 45817445-83" + "\r" + "Mobil: 015274896681"
				 + "\r" + "E-Mail: trinkwas@getraenke.vertrieb.de"+ "\r" 
				 + "\r" + "An folgenden Tagen zu folgenden Zeiten geoeffnet:"
				 + "\r" + "Montag bis Sonntag:" + "\r" + "immer, wenn wir da sind");
		kontxt.setEditable(false);
		kontxt.setVisible(false);
		
	//ueber uns
		uebertxt.setBounds(250,180,650,720);		
		uebertxt.setFont(new Font("MV Boli",Font.PLAIN,25));
		uebertxt.setBackground(new Color(0x081C15));
		uebertxt.setText("MOIN UND GUTEN DURST!" + "\r" + "Dafür sorgen wir! Doch, wer sind wir?"
				 + "\r" + "Wir sind ein bunt zusammengewürfelter Haufen, welche"
				 + "\r" + "sich lediglich dem Vertrieb" + "\r" + "allerlei Genüsslichkeiten verschrieben haben, "
				 + "\r" + "und die ansonsten nicht viel zutun haben. "
				 + "\r" + "Daher ist eine Wahrnehmung unseres Kollektivs, " + "\r" + "nicht nur für uns eine Wonne, "
				 + "\r" + "sondern wird auch von unseren Kunden" + "\r" + "als eine stetige Bereicherung ihres Alltags"
				 + "\r" + "gewertet."  + "\r" + "Daher zoegere nicht und ruf uns an." + "\r" + "Wir helfen zu jeder Uhrzeit!");
		uebertxt.setEditable(false);
		uebertxt.setVisible(false);		
		
//Frame		
		einsfr.setTitle("Willkommen im Getränkehandel GetränkeVertrieb");	//Titel des Fensters
		einsfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				// exit
		einsfr.setResizable(false);		
		einsfr.setSize(1200,900);											// Breite und Höhe
		einsfr.setIconImage(logo.getImage());								// Austausch des Logos
		einsfr.getContentPane().setBackground(new Color(70,15,10));			//Hintergrundfarbe
		einsfr.setVisible(true);											// Fenster sichtbar				
		einsfr.add(artikel);
		einsfr.add(ueberuns);
		einsfr.add(kontakt);
		einsfr.add(inventur);
		panueber.add(uebertxt);
		panueber.add(kontxt);
		einsfr.add(panueber);
		einsfr.add(panbu);		
		einsfr.add(einslb);													// label = frame groeße
	}

// Aktionen der Buttons
	@Override
	public void actionPerformed(ActionEvent e) {							//Button Aktion wird ausgeführt
		if(e.getSource()== artikel) {
			Option optionen = Option.EINKAUFEN;
			new Inventur(getraenkeListe, snackListe, alkListe, optionen);								
			einsfr.dispose();
		}																		
								
		if(e.getSource()== ueberuns) {
			artikel.setBackground(new Color(70,15,10));
			kontakt.setBackground(new Color(70,15,10));
			ueberuns.setBackground(new Color(120,15,10));
			inventur.setBackground(new Color(70,15,10));
			panueber.setVisible(true);
			kontxt.setVisible(false);
			uebertxt.setVisible(true);
		}
		if(e.getSource()== kontakt) {
			artikel.setBackground(new Color(70,15,10));
			ueberuns.setBackground(new Color(70,15,10));
			kontakt.setBackground(new Color(120,15,10));
			inventur.setBackground(new Color(70,15,10));
			panueber.setVisible(true);
			uebertxt.setVisible(false);
			kontxt.setVisible(true);
		}
		if(e.getSource()== inventur) {
			artikel.setBackground(new Color(70,15,10));
			ueberuns.setBackground(new Color(70,15,10));
			kontakt.setBackground(new Color(70,15,10));
			inventur.setBackground(new Color(120,15,10));
			new IDzugang(getraenkeListe, snackListe, alkListe);
			einsfr.dispose();
		}
	}	
}
