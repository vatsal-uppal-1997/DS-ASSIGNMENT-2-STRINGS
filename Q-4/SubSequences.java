//**Q4. Take as input S, a string. Write a function that prints all its subsequences.
import java.util.*;


public class SubSequences {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		char arr[] = str.toCharArray();
		int numOfSubSequences = (int) Math.pow(2,arr.length);
		System.out.println(numOfSubSequences);
		for (int i=1;i<numOfSubSequences;i++) {
			for (int j=0;j<arr.length;j++) {
				
				if ((i & (1 << j)) != 0){
					sb.append(arr[j]+" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}