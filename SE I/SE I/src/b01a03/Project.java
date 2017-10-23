/**
 * @author fgrusc2s
 */
package b01a03;

public class Project {

	String[][] rel;	
	public Project(String[][] rel) {
		this.rel = rel;
	}
	
	public boolean isWellSorted(String[] sequence) {
		if(!isRightFormat(rel) || !keineDoppelungen(sequence)) {
			return false;
		}
		//Alle Bedingungen durchgehen:
		for(int i = 0; i < rel.length; i++) {
			if(!isBedingungErfuellt(rel[i], sequence)) {
				return false;
			}
		}
		return true;
		
	}
	
	private boolean isBedingungErfuellt(String[] bedingung, String[] sequence) {
		
		int j;
		boolean erstesEnthalten = false;
		for(j = 0; j < sequence.length; j++) {
			if(bedingung[0] == sequence[j]) {
				erstesEnthalten = true;
				break;
			}
		}
		if(!erstesEnthalten) {
			return false;
		}
		for(; j < sequence.length; j++) {
			if(bedingung[1] == sequence[j]) {
				return true;
			}
		}
		return false;
	}
	
	private boolean isRightFormat(String[][] rel) {
		for(int i = 0; i < rel.length; i++) {
			
			/*
			 * die folgende Bedingung ist Aequivalent zu folgendem Ausdruck
			 * rel[i][0] == rel[i][1] || rel[i].length != 2
			 * und schliesst aus dass es Bedingungen gibt die nicht
			 * zwei Elemente haben oder zwei mal dasselbe Element
			 */
			if(!(rel[i].length == 2 && rel[i][0] != rel[i][1])) {
				return false;
			}
		}
		return true;
	}
	private boolean keineDoppelungen(String[] sequence) {
		String s;
		for(int i = 0; i < sequence.length; i++) {
			s = sequence[i];
			for(int j = i + 1; j < sequence.length; j++) {
				if(s.equals(sequence[j])) {
					return false;
				}
			}
		}
		return true;
	}
}