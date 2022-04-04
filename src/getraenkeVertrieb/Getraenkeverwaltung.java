package getraenkeVertrieb;

import java.util.Scanner;

import javax.swing.JLabel;

import java.util.ArrayList;
public class Getraenkeverwaltung {

	public static void main(String[] args) {	
	
	// Fritz-Zitrone 
		Getraenk fritzzi = new Getraenk("Fritz-Zitrone", 14.99, 150, "Limonade");		
    // Fritz-Cola 
		Getraenk fritzco = new Getraenk("Fritz-Cola", 14.99, 200, "Limonade");
	// Fritz-Orange 
		Getraenk fritzor = new Getraenk("Fritz-Orange", 14.99, 100, "Limonade");
	// Apfelsaft 
		Getraenk saftapf = new Getraenk("Apfelsaft", 09.99, 70, "Saft");
	// Orangensaft
		Getraenk saftora = new Getraenk("Orangensaft", 09.99, 70, "Saft");
	// Multivitaminsaft 
		Getraenk saftmult = new Getraenk("Multivitaminsaft", 12.99, 50, "Saft");		
	// Bismarkwasser Still 
		Getraenk bisstill = new Getraenk("Bismark Still", 06.99, 120, "Wasser");
	// Bismarkwasser Medium
		Getraenk bismed = new Getraenk("Bismark Medium", 06.99, 120, "Wasser");
	// Bismarkwasser Classic 
		Getraenk biscla = new Getraenk("Bismark Classic", 06.99, 120, "Wasser");

	// Mars 
		Snack snackmars = new Snack("Mars", 0.99, 50, "Schokoriegel", 75, "25.03.2023");
	// Mr. Tom
		Snack snacktom = new Snack("Mr. Tom", 0.99, 50, "Nussriegel", 75, "15.07.2023");
	// Studentenfutter
		Snack snackstufu = new Snack("Studentenfutter", 3.99, 100, "Nussmischung", 150, "14.08.2023");
	// Minzkaugummi
		Snack snackkaumi = new Snack("Minzkaugummi", 1.49, 30, "Kaugummi", 20, "25.05.2024");
	// KirschKaugummi
		Snack snackkauki = new Snack("Kirschkaugummi", 1.49, 30, "Kaugummi", 20, "25.05.2024");
		
	// Sternburg
		AlkoholischeGetraenke biersterni = new AlkoholischeGetraenke("Sternburg", 07.99, 75, "Export", 4.9);
	// Jever
		AlkoholischeGetraenke bierjev = new AlkoholischeGetraenke("Jever", 12.99, 75, "Pilsener", 4.4);
	// Augustiner
		AlkoholischeGetraenke bieraug = new AlkoholischeGetraenke("Augustiner", 17.99, 50, "Lager", 5.2);
	// Jägermeister
		AlkoholischeGetraenke spijaegi = new AlkoholischeGetraenke("Jägermeister", 14.99, 15, "Kräuter", 42);
	// Roku Gin
		AlkoholischeGetraenke spigin = new AlkoholischeGetraenke("Roku Gin", 32.99, 15, "Gin", 43);
	// West Cork
		AlkoholischeGetraenke spiwest = new AlkoholischeGetraenke("West Cork", 42.99, 75, "Whisky", 40);
				
		
		
//		System.out.println("\nWas wollen Sie machen (1 = Bestand erhöhen, 2 = Verkauf, 3 = beenden)?");
//
//		Scanner tastatur = new Scanner(System.in);
//
//		int x = tastatur.nextInt();
//
//		switch (x) {
//		case 1:
//			/* Zitrone */
//			System.out.println("Fritz-Zitrone bestellen");
//			int bestellungZitrone;
//			bestellungZitrone = tastatur.nextInt();
//			fritzzi.bestandErhoehen(bestellungZitrone);
//			System.out.println("Neuer Bestand Zitrone" + ":		" + fritzzi.getBestand() + " Kisten" + "\n");
//			/* Cola */
//
//			System.out.println("Fritz-Cola bestellen");
//			int bestellungCola;
//			bestellungCola = tastatur.nextInt();
//			fritzco.bestandErhoehen(bestellungCola);
//			System.out.println("Neuer Bestand Cola" + ":		" + fritzco.getBestand() + " Kisten" + "\n");
//			/* Orange */
//
//			System.out.println("Fritz-Orange bestellen");
//			int bestellungOrange;
//			bestellungOrange = tastatur.nextInt();
//			fritzor.bestandErhoehen(bestellungOrange);
//			System.out.println("Neuer Bestand Orange" + ":		" + fritzor.getBestand() + " Kisten" + "\n");
//
//			break;
//			
//		case 2:
//			System.out.println("Fritz-Zitrone verkaufen");
//			int verkaufZitrone;
//			verkaufZitrone = tastatur.nextInt();
//			System.out.println(fritzzi.verkaufen(verkaufZitrone));
//
//			System.out.println("Fritz-Cola verkaufen");
//			int verkaufCola;
//			verkaufCola = tastatur.nextInt();
//			System.out.println(fritzco.verkaufen(verkaufCola));
//
//			System.out.println("Fritz-Orange verkaufen");
//			int verkaufOrange;
//			verkaufOrange = tastatur.nextInt();
//			System.out.println(fritzor.verkaufen(verkaufOrange));
//
//			break;
//
//		case 3:
//			break;
//
//		default:
//			System.err.println("Unbekannter Operator " + x);
//
//		}
//		tastatur.close();
		
		ArrayList<Getraenk> getraenkeListe = new ArrayList<Getraenk>();
		getraenkeListe.add(fritzzi);
		getraenkeListe.add(fritzco);
		getraenkeListe.add(fritzor);
		getraenkeListe.add(saftapf);
		getraenkeListe.add(saftora);
		getraenkeListe.add(saftmult);
		getraenkeListe.add(bisstill);
		getraenkeListe.add(bismed);
		getraenkeListe.add(biscla);
				
		ArrayList<Snack> snackListe = new ArrayList<Snack>();
		snackListe.add(snackmars);
		snackListe.add(snacktom);
		snackListe.add(snackstufu);
		snackListe.add(snackkaumi);
		snackListe.add(snackkauki);
		
		ArrayList<AlkoholischeGetraenke> alkListe = new ArrayList<AlkoholischeGetraenke>();
		alkListe.add(biersterni);
		alkListe.add(bierjev);
		alkListe.add(bieraug);
		alkListe.add(spijaegi);
		alkListe.add(spigin);
		alkListe.add(spiwest);		
		
		Startfenster start = new Startfenster(getraenkeListe, snackListe, alkListe);
//		IDzugang in = new IDzugang(getraenkeListe, snackListe, alkListe);
//		Option optionen = Option.BESTELLEN;
//		new Inventur(getraenkeListe, snackListe, alkListe, optionen);
	}
}


