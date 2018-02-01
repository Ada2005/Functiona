package Func;
import java.util.*;

public class Golosovanie {
	public static void main (String[] args) {
		
		Vyborka v = new Vyborka();
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x, y, z (1 or 0): ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if (v.elect(x, y, z) == true) {
			System.out.println(1 + " = " + v.elect(x, y, z));
		}
		else System.out.println(0 + " = " + v.elect(x, y, z));
	}

}

class Vyborka {
	boolean elect (int x, int y, int z) {
	int t = 0, f = 0; 
	boolean rez;	
	if (x == 1) {
		t++;
	} else f++;
	if (y == 1) {
		t++;
	} else f++;
	if (z == 1) {
		t++;
	} else f++;
	if (t > f) {
		rez = true;
	} else rez = false;
			
	return rez;
	}
}