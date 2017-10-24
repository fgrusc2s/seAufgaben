package doppelkopf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Doppelkopf {

	public static void main(String[] args) {
		
	/*
	 * Zwischenspeicher Layout:
	 * erste Zeile: Daten für das ganze Spiel (Reihenfolge):
	 * 
	 * dann:
	 * Geber:$geber;;$spieler1:$punkte1;;$spieler2:$punkte2;;$spieler3:$punkte3;;$spieler4:$punkte4
	 * 
	 * 
	 */
		
		
		String[] Zeile1;
		String[] ZeileE;
		
		try {
			String[] input = ersteUndLetzteZeileAusDatei(".DKtable");
			Zeile1 = input[0].split(";;");
			ZeileE = input[1].split(";;");
			
		} catch(IOException e) {
			File datei = new File(".DKtable.txt");
			Zeile1 = new String[4];
		}
		
		
		
		
		
		
		
	}
	private static String[] ersteUndLetzteZeileAusDatei(String name) throws IOException{

		BufferedReader br = new BufferedReader(new FileReader(name));
		String zeile = null;
		String drueber = null;
		
		/*erste Zeile mit Metadaten einlesen, die für das ganze
		* Spiel gelten
		*/ 
		String first = br.readLine();
		
		//letzte Zeile mit 
		while((drueber = br.readLine()) != null) {
			zeile = drueber;
		}
	
		br.close();
		
		//Ausgabearray zusammesetzen
		String[] aus = new String[2];
		aus[0] = first;
		aus[1] = zeile;
		return aus;
	}
}			
			
			
			
			
			
			
			
			
			
			
