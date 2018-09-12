//Q1. Take as input S, a string. Write a function that returns true if the string is palindrome and false otherwise. Print the value returned.
import java.util.*;
public class Palindrome {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		StringBuilder s1 = new StringBuilder(sc.nextLine());
		StringBuilder s2 = new StringBuilder(s1.toString());
		s2.reverse();
		System.out.println((s1.toString()).equals(s2.toString()));
	}
}