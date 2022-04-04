package getraenkeVertrieb;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;

public class IDzugang implements ActionListener{
	JFrame frzugang = new JFrame();
	JLabel lbzugang = new JLabel();
	JPanel panzugang = new JPanel();
	JTextPane text = new JTextPane();
	JPasswordField pwfield = new JPasswordField();
	ImageIcon logo = new ImageIcon("logo.png");
	JButton login = new JButton();
	JButton close = new JButton();
	private ArrayList<Getraenk> getraenkeListe;
	private ArrayList<Snack> snackListe;
	private ArrayList<AlkoholischeGetraenke> alkListe;
	
	
	IDzugang(ArrayList<Getraenk> getraenkeListe, ArrayList<Snack> snackListe, ArrayList<AlkoholischeGetraenke> alkListe){		
		this.getraenkeListe = getraenkeListe;
		this.snackListe = snackListe;
		this.alkListe = alkListe;
		
		login.setBounds(140,100,70,30);
		login.addActionListener(this);
		login.setFocusable(false);
		login.setText("login");
		login.setForeground(new Color(0x2A3D47));
		login.setBackground(new Color(70,15,10));
		login.setFont(new Font("MV Boli",Font.BOLD,15));
		login.setBorder(null);
		
		close.setBounds(240,100,100,30);
		close.addActionListener(this);
		close.setFocusable(false);
		close.setText("abbrechen");
		close.setForeground(new Color(0x2A3D47));
		close.setBackground(new Color(70,15,10));
		close.setFont(new Font("MV Boli",Font.BOLD,15));
		close.setBorder(null);

		panzugang.setBounds(0,200,500,150);
		panzugang.setBackground(new Color(0x081C15));
		panzugang.add(lbzugang);
		
		pwfield.setBounds(120,50,240,40);
		pwfield.setPreferredSize(new Dimension(260,50));
		pwfield.setVisible(true);
		
		text.setBounds(120,150,240,40);
		text.setText("die Eingabe ist falsch");
		text.setPreferredSize(new Dimension(260,50));
		text.setBackground(new Color(0x081C15));
		text.setForeground(new Color(10,150,75));
		text.setFont(new Font("MV Boli",Font.PLAIN,20));
		text.setEditable(false);
		text.setVisible(false);
		
		lbzugang.setText("Bitte gib deine MitarbeiterID ein");
		lbzugang.setHorizontalAlignment(JLabel.CENTER);
		lbzugang.setVerticalAlignment(JLabel.TOP);
		lbzugang.setForeground(new Color(10,150,75));
		lbzugang.setFont(new Font("MV Boli",Font.PLAIN,20));
		
		frzugang.setTitle("Zugangsüberprüfung");							//Titel des Fensters
		frzugang.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			// exit
		frzugang.setResizable(false);		
		frzugang.setSize(500,250);											// Breite und Höhe
		frzugang.setIconImage(logo.getImage());								// Austausch des Logos
		frzugang.getContentPane().setBackground(new Color(0x081C15));		//Hintergrundfarbe (new Color(70,15,10)
		frzugang.setVisible(true);
		frzugang.add(login);
		frzugang.add(close);
		frzugang.add(text);
		frzugang.add(pwfield);
		frzugang.add(panzugang);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== login) {
			int wert;
			int [] nuarray = new int[5];
			nuarray[0] = 17;
			nuarray[1] = 32;
			nuarray[2] = 45;
			nuarray[3] = 53;
			nuarray[4] = 61;
			wert = Integer.parseInt(pwfield.getText());
			for(int i = 0; i <= nuarray.length - 1; i++) {
				if(nuarray[i] == wert) {
					Option optionen = Option.BESTELLEN;
					new Inventur(getraenkeListe, snackListe, alkListe, optionen);
					frzugang.dispose();
				}
				else { 
					text.setVisible(true);
				}
			}
		}
		if(e.getSource()== close) {
			new Startfenster(getraenkeListe, snackListe, alkListe);
			frzugang.dispose();
		}
	}

}
