package Func;
import java.util.*;

public class Chislo1IzN {
	public static void main (String[] args) {
		System.out.println("Enter n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
				
		if (recurs(n) != 1) {
			System.out.println("NO");
		} else 
			System.out.println("YES");
	}
	
	static int recurs (int n) {
		int result;
		if (n < 9)
			return n;
		else result = recurs(n - 5 - 3);
		return result;
	}
}