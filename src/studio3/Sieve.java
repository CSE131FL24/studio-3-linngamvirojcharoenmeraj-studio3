package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println ("How many total numbers are you wanting to find the prime of?: ");
		int n = in.nextInt ();
		
		boolean[ ] arrayN = new boolean [n+1];
		
		
		for (int i = 0; i < arrayN.length; i++) {
			 arrayN[i] = true;		}
				
		for(int i = 2; i < arrayN.length; i++) {
			for (int j = i; j < arrayN.length; j = j + i) {
				
			}
		}
	}
}

	
