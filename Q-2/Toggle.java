/*Q2. Take as input S, a string. Write a function that toggles the case of all characters in the string. Print the value returned. 
For example is the string is AbcDEfG, it should become aBCdeFg.
*/

import java.util.*;

public class Toggle {
	
	private static final Scanner sc = new Scanner(System.in);
	private static char toggleCase(char i) {
		if ( i != ' ')
			return (i < 'a' && i != ' ') ? (char)(i+32):(char)(i-32);
		else
			return i;
	}
	public static void main(String args[]) {
		String toggle = sc.nextLine();
		for (char i: toggle.toCharArray())
			System.out.print(toggleCase(i));
		System.out.println();
	}
	
}