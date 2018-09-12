//Q3. Take as input S, a string. Write a function that returns the character with maximum frequency. Print the value returned.
import java.util.*;
public class MaxFreq {
	private static final Scanner sc = new Scanner(System.in);
	private static final int arr[] = new int['z'+1];
	private static char maxFreq(String arg) {
		for (char i: arg.toCharArray())
			arr[i]++;
		int max = 0;
		for (int i=0;i<='z';i++)
			if (arr[i] > arr[max])
				max = i;
		return (char)max;
	}
	public static void main(String []args) {
		String temp="";
		temp+=maxFreq(sc.nextLine());
		System.out.println(temp+" has the maximum frequency and occured "+arr[temp.toCharArray()[0]]+" number of times");
	}
}