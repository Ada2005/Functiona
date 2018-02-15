package Func;
import java.util.*;


public class Superloto {
	public static void main (String[] args) {
		System.out.println("Enter 6 numbers (1-36): ");
		Scanner sc = new Scanner(System.in);
		String [] a = new String [6];
		int [] b = {};
/*		ArrayList arrlist = new ArrayList();	//Ostavleno dlja proverki
		arrlist.add("01");
		arrlist.add("11");
		arrlist.add("21");
		arrlist.add("16");
		arrlist.add("32");
		arrlist.add("36");
*/		
		String s = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36";
		
		int c = 0, counter = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLine();
		}
		
		for (int i = 0; i < a.length; i++) {
			if (s.contains(a[i])) {
				a[i] = a[i];
				c++;
				}
		}
		if (c < 6) {
			System.out.println("Enter numbers of diapozone: 1-36!");		// dodumat' kak nachat' zanovo?
		} 
		else {
						
		System.out.print("Numbers  of  User: ");
				
		System.out.print(Arrays.asList(a) + " ");
				
		System.out.println();
		System.out.print("Numbers of system: ");
		System.out.println(systema(b));
		
//		System.out.println(arrlist);
				
		for(int i = 0; i < Arrays.asList(a).size(); i++){
	        for(int j = 0; j < Arrays.asList(a).size(); j++){
	            if(Arrays.asList(a).get(i).equals(systema(b).get(j)) == true && i == j) {			//vmesto "systema(b)" vstavit' "arrlist"
	            	counter++;
	            } 
	        }
		} 
								
		System.out.println("Number of matches = " + counter);
		if (counter == 6) {
			System.out.println("Your winnings are = 1 000 000 tenge");
			}
			else if (counter == 5) {
				System.out.println("Your winnings are = 100 000 tenge");
			}
			else if (counter == 4) {
				System.out.println("Your winnings are = 10 000 tenge");
				}
			else if (counter == 3) {
				System.out.println("Your winnings are = 100 tenge");
			}
			else System.out.println("Sorry you did not win");
	}
	}
	
	static ArrayList systema (int [] arr) {
		final int N = 36;
	ArrayList<Integer> arrayList = new ArrayList<>(N);
	for (int i = 1; i < N; i++) {
	    arrayList.add(i);
	}
		Collections.shuffle(arrayList);
		arrayList.subList(6, arrayList.size()).clear();

	return arrayList;
	}	
}