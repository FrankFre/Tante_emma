import java.util.Scanner;

public class Tante_emma {

	public static void main(String[] args) {

		float playstation = 199f;
		float lakritz = 0.3f;
		float gummib = 0.05f;

		int steuer = 19;
		int esteuer = 7;

		Scanner eing = new Scanner(System.in);

		System.out.println(
				"Geben sie die Anzahl gefolgt von dem Artikel (Gummibaerchen, Lakritzstangen, Playstation) ein: ");

		try {
			int anz = eing.nextInt();
			String titel = eing.next();

			float steuerbetrag, preis;

			switch (titel) {

			case "Playstation":
				steuerbetrag = steuer;
				preis = playstation;
				break;
				
			case "Lakritz":
				steuerbetrag = esteuer;
				preis = lakritz;
				break;
				
			case "Gummibaerchen":
				steuerbetrag = esteuer;
				preis = gummib;
				break;
				
			default: 
				System.out.println("falsche Eingabe erfolgt !");
				return;
			}

//			if (titel.equals("Playstation")) {
//
//				steuerbetrag = steuer;
//				preis = playstation;
//
//			} else if (titel.equals("Lakritz")) {
//
//				steuerbetrag = esteuer;
//				preis = lakritz;
//			} else if (titel.equals("Gummibaerchen")) {
//
//				steuerbetrag = esteuer;
//				preis = gummib;
//			} else {
//				System.out.println("falsche Eingabe erfolgt !");
//				return;
//			}

			float zuzahlen = anz * preis;
			float mwst = (anz * preis * steuer) / 100;
			float netto = zuzahlen - mwst;

			System.out.println("zuzahlen\t" + zuzahlen);
			System.out.println("Netto Preis\t" + netto);
			System.out.println("Mehrwertsteuer\t" + mwst);
		}

		catch (Exception e) {
			System.out.println("falsche Eingabe erfolgt !");
		}

	}

}
