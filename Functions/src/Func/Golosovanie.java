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
			System.out.println(1);
		}
		else System.out.println(0);
	}

}

class Vyborka {
	boolean elect (int x, int y, int z) {
	int rez = x + y + z;
	if (rez >= 2) {
		return true;
		}
	else {
		return false;
		}
	}
}