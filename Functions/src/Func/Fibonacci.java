package Func;
import java.util.*;

public class Fibonacci {
	public static void main (String[] args) {
		
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		
		
		System.out.println(fib(n));
		
	}



	static int fib (int n) {
	int fi = 0;
	if (n > 1) {
		fi = n - 1 + n - 2;
		}
	return fi;
	}
}