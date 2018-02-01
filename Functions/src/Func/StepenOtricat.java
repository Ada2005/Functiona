package Func;
import java.util.*;

public class StepenOtricat {
	public static void main (String[] args) {
		
		Step st = new Step();
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a, n (n can be negative): ");
		int a = sc.nextInt();
		int n = sc.nextInt();
				
		System.out.println(st.stepen(a, n));
	}
}

class Step {
	double stepen (int a, int n) {
	double rez = 1;
	
	if (n == 0) {
		rez = 1;
		}
	
	if (n > 0) {
		for (int i = 1; i <= n; i++) {
		rez *= a;
		}
	}
	
	 if (n < 0) {
		 n *= -1;
		for (int i = 1; i <= n; i++) {
		rez *= a;
		rez = 1/rez;
		}
	 }
	
	return Math.round(rez*1000.0)/1000.0;
	}
}
	