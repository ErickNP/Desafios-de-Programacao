package facil;

import java.util.Scanner;

public class AreaDaCircunferencia03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer radius = sc.nextInt();
		
		Double area = 3.1416 * Math.pow(radius, 2);

		System.out.printf("%.2f", area);
		
		sc.close();
	}

}
