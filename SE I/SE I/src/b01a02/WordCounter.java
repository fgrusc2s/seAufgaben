/**
 * @author fgrusc2s
 */
package b01a02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
	
	public static void main(String[] args) {
		
		String fileName = "datei.txt";
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File(fileName));
		} catch(FileNotFoundException e) {
			System.out.println("Problem beim Einlesen von Datei");
		}
			
		int count = 0;
		
		while(sc.hasNext()) {
			count++;
			sc.next();
		}
		
		System.out.println(count);
	}
	
}