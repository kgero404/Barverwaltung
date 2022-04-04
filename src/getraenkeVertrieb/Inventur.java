package getraenkeVertrieb;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Inventur implements ActionListener {
	
	JButton getraenke = new JButton();
	JButton snacks = new JButton();
	JButton alkgetraenke = new JButton();
	JButton btnwarenkorb = new JButton();
	JButton zurück = new JButton();
	VerkaufButton verkauf = new VerkaufButton();
	VerkaufButton bestellen = new VerkaufButton();
	
	JPanel panwa = new JPanel();
	JPanel panausgabe = new JPanel();
	JPanel panwarenkorb = new JPanel();
	JPanel panelGetraenk = new JPanel();
	JPanel panelSnackButton = new JPanel();
	JPanel panelAlkButton = new JPanel();
	
	JTextPane verkaufEingabe = new JTextPane();
	JTextPane txtWarenkorb = new JTextPane();
	
	JLabel lblogo = new JLabel();
	JFrame invframe = new JFrame();
	
	ImageIcon logo = new ImageIcon("logo.png");
	
	ArrayList<JButton> btngetraenke = new ArrayList<JButton>();
	ArrayList<JButton> btnsnacks = new ArrayList<JButton>();
	ArrayList<JButton> btnalkgetraenke = new ArrayList<JButton>();
	
	private ArrayList<Getraenk> getraenkeListe;
	private ArrayList<Snack> snackListe;
	private ArrayList<AlkoholischeGetraenke> alkListe;

	
	
	Inventur(ArrayList<Getraenk> getraenkeListe, ArrayList<Snack> snackListe, ArrayList<AlkoholischeGetraenke> alkListe, Option optionen) {
		this.getraenkeListe = getraenkeListe;
		this.snackListe = snackListe;
		this.alkListe = alkListe;
		
//Button
	//Getraenke										
		getraenke.setBounds(50,100,120,40);
		getraenke.addActionListener(this);
		getraenke.setFocusable(false);
		getraenke.setText("Getraenke");
		getraenke.setForeground(new Color(0x2A3D47));
		getraenke.setBackground(new Color(120,15,10));
		getraenke.setFont(new Font("MV Boli",Font.BOLD,20));
		getraenke.setBorder(null);
		getraenke.setVisible(true);

	//snacks
		snacks.setBounds(175,100,120,40);
		snacks.addActionListener(this);
		snacks.setFocusable(false);
		snacks.setText("Snacks");
		snacks.setForeground(new Color(0x2A3D47));
		snacks.setBackground(new Color(70,15,10));
		snacks.setFont(new Font("MV Boli",Font.BOLD,20));
		snacks.setBorder(null);
		snacks.setVisible(true);	
		
	//alkgetraenke
		alkgetraenke.setBounds(300,100,120,40);
		alkgetraenke.addActionListener(this);
		alkgetraenke.setFocusable(false);
		alkgetraenke.setText("alk. Getreanke");
		alkgetraenke.setForeground(new Color(0x2A3D47));
		alkgetraenke.setBackground(new Color(70,15,10));
		alkgetraenke.setFont(new Font("MV Boli",Font.BOLD,15));
		alkgetraenke.setBorder(null);
		alkgetraenke.setVisible(true);
		
	//Warenkorb
		btnwarenkorb.setBounds(700,100,120,40);
		btnwarenkorb.addActionListener(this);
		btnwarenkorb.setFocusable(false);
		btnwarenkorb.setText("Warenkorb");
		btnwarenkorb.setForeground(new Color(0x2A3D47));
		btnwarenkorb.setBackground(new Color(70,15,10));
		btnwarenkorb.setFont(new Font("MV Boli",Font.BOLD,20));
		btnwarenkorb.setBorder(null);
		btnwarenkorb.setVisible(true);
		
	//Hauptmenue
		zurück.setBounds(700,520,120,40);
		zurück.addActionListener(this);
		zurück.setFocusable(false);
		zurück.setText("zurück");
		zurück.setForeground(new Color(0x2A3D47));
		zurück.setBackground(new Color(70,15,10));
		zurück.setFont(new Font("MV Boli",Font.BOLD,20));
		zurück.setBorder(null);
		zurück.setVisible(true);	
	
		
	//BESTELLEN
		bestellen.setBounds(500,520,170,40);
		bestellen.addActionListener(this);
		bestellen.setFocusable(false);
		bestellen.setText("Bestellen");
		bestellen.setForeground(new Color(0x2A3D47));
		bestellen.setBackground(new Color(70,15,10));
		bestellen.setFont(new Font("MV Boli",Font.BOLD,20));
		bestellen.setBorder(null);
		bestellen.setVisible(false);	
		
	//Verkaufen
		verkauf.setBounds(500,520,170,40);
		verkauf.setFocusable(false);
		verkauf.setText("in den Warenkorb");
		verkauf.setForeground(new Color(0x2A3D47));
		verkauf.setBackground(new Color(70,15,10));
		verkauf.setFont(new Font("MV Boli",Font.BOLD,15));
		verkauf.setBorder(null);
		verkauf.setVisible(false);	
		
// Panel
	//Panel Ware
		panwa.setBackground(new Color(0x081C15));
		panwa.setBounds(0,0,900,180);
		
	//Panel ausgabe Ware
		panausgabe.setBackground(Color.white);		//new Color(0x081C15)
		panausgabe.setBounds(250,180,300,200);
		
	//Panel warenkorb ausgabe
		panwarenkorb.setBackground(Color.blue);		//new Color(0x081C15)
		panwarenkorb.setBounds(560,180,300,330);
		
//TextPane
	//Verkauf Eingabe
		verkaufEingabe.setBounds(280,520,200,40);
		verkaufEingabe.setPreferredSize(new Dimension(190,35));
		verkaufEingabe.setFont(new Font("MV Boli",Font.PLAIN,20));
		verkaufEingabe.setForeground(new Color(10,150,75));
		verkaufEingabe.setBackground(new Color(120,15,10));
		verkaufEingabe.setEditable(true);
		
	// TextPanel ausgabe
		JTextPane ausgabe = new JTextPane();
		ausgabe.setFont(new Font("MV Boli",Font.BOLD,20));
		ausgabe.setBackground(new Color(0x081C15));
		ausgabe.setForeground(new Color(10,150,75));
		ausgabe.setEditable(false);
		ausgabe.setVisible(true);
	
	//TextPanel Warenkorb ausgabe
		txtWarenkorb.setFont(new Font("MV Boli",Font.BOLD,15));
		txtWarenkorb.setPreferredSize(new Dimension(300,330));
		txtWarenkorb.setBackground((Color.black));
		txtWarenkorb.setForeground(new Color(10,150,75));
		txtWarenkorb.setEditable(false);
		txtWarenkorb.setVisible(true);
	
	//Panel Btn Getraenke
		panelGetraenk.setBounds(10,180,220,400);
		panelGetraenk.setBackground(new Color(0x081C15));
		panelGetraenk.setLayout(new GridLayout(9, 1));
//		panelGetraenk.setVisible(false);
		initBtnGetraenke(ausgabe, verkauf, bestellen, verkaufEingabe, txtWarenkorb);
		for(JButton buttonGe :btngetraenke) {
        	buttonGe.setFocusable(false);
        	buttonGe.setForeground(new Color(0x2A3D47));
        	buttonGe.setBackground(new Color(70,15,10));
        	buttonGe.setFont(new Font("MV Boli",Font.BOLD,20));
        	panelGetraenk.add(buttonGe);
        }
	//Panel Btn Snacks
		panelSnackButton.setBounds(10,180,220,400);
		panelSnackButton.setBackground(new Color(0x081C15));
		panelSnackButton.setLayout(new GridLayout(6, 1));
		panelSnackButton.setVisible(false);
		initBtnSnack(ausgabe, verkauf, bestellen, verkaufEingabe, txtWarenkorb);
		for(JButton buttonS :btnsnacks) {
        	buttonS.setFocusable(false);
        	buttonS.setForeground(new Color(0x2A3D47));
        	buttonS.setBackground(new Color(70,15,10));
        	buttonS.setFont(new Font("MV Boli",Font.BOLD,20));
        	panelSnackButton.add(buttonS);
        }

	//Panel Btn Alk
		panelAlkButton.setBounds(10,180,220,400);
		panelAlkButton.setBackground(new Color(0x081C15));
		panelAlkButton.setLayout(new GridLayout(6, 1));
		panelAlkButton.setVisible(false);
		initBtnAlkGetraenke(ausgabe, verkauf, bestellen, verkaufEingabe, txtWarenkorb);
		for(JButton buttonA :btnalkgetraenke) {
        	buttonA.setFocusable(false);
        	buttonA.setForeground(new Color(0x2A3D47));
        	buttonA.setBackground(new Color(70,15,10));
        	buttonA.setFont(new Font("MV Boli",Font.BOLD,20));
        	panelAlkButton.add(buttonA);
        	
    	if(optionen == Option.EINKAUFEN) {
			verkauf.setVisible(true);
		}
		if(optionen == Option.BESTELLEN) {
			bestellen.setVisible(true);
		}	
		}
	
//Label
	//label Logo
//		lblogo.setIcon(logo2);
//		lblogo.setHorizontalAlignment(JLabel.CENTER);
//		lblogo.setVerticalAlignment(JLabel.BOTTOM);
		
// Frame		
		invframe.setTitle("Ware");							
		invframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		invframe.setResizable(false);	
		invframe.setLayout(null);
		invframe.setSize(900,650);											
		invframe.setIconImage(logo.getImage());								
		invframe.getContentPane().setBackground(new Color(0x081C15));		//Hintergrundfarbe (new Color(70,15,10)
		invframe.setVisible(true);
		invframe.add(getraenke);
		invframe.add(snacks);
		invframe.add(alkgetraenke);
		invframe.add(btnwarenkorb);
		invframe.add(verkaufEingabe);
		invframe.add(verkauf);
		invframe.add(panwarenkorb);
		invframe.add(bestellen);
		invframe.add(zurück);
		panausgabe.add(ausgabe);
		panwarenkorb.add(txtWarenkorb);
		invframe.add(panelGetraenk);
		invframe.add(panelSnackButton);
		invframe.add(panelAlkButton);
		invframe.add(panausgabe);
		invframe.add(panwa);

	}
	private void initBtnGetraenke(JTextPane ausgabe,VerkaufButton verkauf, VerkaufButton bestellen, JTextPane verkaufEingabe, JTextPane txtWarenkorb) {
		
		for(Getraenk g : getraenkeListe) {																				// Für Objekt wird Button hinzugefügt
			btngetraenke.add(new BesterButtonVonWelt(g, ausgabe, verkauf, bestellen, verkaufEingabe, txtWarenkorb));
		}
	}
	private void initBtnSnack(JTextPane ausgabe, VerkaufButton verkauf, VerkaufButton bestellen, JTextPane verkaufEingabe, JTextPane txtWarenkorb) { 
		for(Snack g : snackListe) {		
			btnsnacks.add(new BesterButtonVonWelt(g, ausgabe, verkauf, bestellen,  verkaufEingabe, txtWarenkorb));
		}
	}
	private void initBtnAlkGetraenke(JTextPane ausgabe, VerkaufButton verkauf, VerkaufButton bestellen, JTextPane verkaufEingabe, JTextPane txtWarenkorb) { 
		for(AlkoholischeGetraenke g : alkListe) {		
			btnalkgetraenke.add(new BesterButtonVonWelt(g, ausgabe, verkauf, bestellen, verkaufEingabe, txtWarenkorb));
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== getraenke) {
			snacks.setBackground(new Color(70,15,10));
			alkgetraenke.setBackground(new Color(70,15,10));
			getraenke.setBackground(new Color(120,15,10));
			panelGetraenk.setVisible(true);
			panelSnackButton.setVisible(false);
			panelAlkButton.setVisible(false);
		}	
		if(e.getSource()== snacks) {
			getraenke.setBackground(new Color(70,15,10));
			alkgetraenke.setBackground(new Color(70,15,10));
			snacks.setBackground(new Color(120,15,10));
			panelGetraenk.setVisible(false);
			panelSnackButton.setVisible(true);
			panelAlkButton.setVisible(false);
		}	
		if(e.getSource()== alkgetraenke) {
			snacks.setBackground(new Color(70,15,10));
			getraenke.setBackground(new Color(70,15,10));
			alkgetraenke.setBackground(new Color(120,15,10));
			panelGetraenk.setVisible(false);
			panelSnackButton.setVisible(false);
			panelAlkButton.setVisible(true);
		}	
		if(e.getSource()== zurück) {
			new Startfenster(getraenkeListe, snackListe, alkListe);	
			invframe.dispose();												
		}
	}
}
//textArea.append(m.getTNr() + " - " + m.getName() + " - " + m.getVorname() + "\n");