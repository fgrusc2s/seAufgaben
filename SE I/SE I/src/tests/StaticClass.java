/**
 * @author fgrusc2s
 */
package tests;

public class StaticClass {
	
	public static void main(String[] args) {
	
		String[] s = {"hallo", "welt"};
		String[] m = s;
		
		m[0] = null;
		
		System.out.println("s[0] = " + s[0] + "s[1] = " + s[1] + '\n' + "m[0] = " + m[0] + "m[1] = " + m[1]);
		
		
	}
}
