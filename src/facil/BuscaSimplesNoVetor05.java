package facil;

import java.util.Scanner;

public class BuscaSimplesNoVetor05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Boolean found = false;

		Integer[] vector = new Integer[10];

		String[] valuesString = sc.nextLine().split(" ");

		int x = sc.nextInt();

		for (int i = 0; i < valuesString.length; i++) {
			vector[i] = Integer.parseInt(valuesString[i]);
		}

		for (Integer value : vector) {
			if (value == x) {
				found = true;
			}
		}
		
		
		if(found){
			System.out.println("SIM");
		} else if (!found) {
			System.out.println("NAO");
		}

		sc.close();
	}

}
