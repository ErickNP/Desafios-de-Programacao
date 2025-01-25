package medio;

import java.util.Scanner;

public class Lampadas01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean lamp1 = false;
		boolean lamp2 = false;

		int repeat = sc.nextInt();
		sc.nextLine();

		int[] pressing = new int[repeat];

		String[] values = sc.nextLine().split(" ");

		for (int i = 0; i < repeat; i++) {
			pressing[i] = Integer.parseInt(values[i]);
		}

		for (Integer value : pressing) {

			if (value == 1) {
				lamp1 = !lamp1;
			} else {
				lamp1 = !lamp1;
				lamp2 = !lamp2;
			}

		}

		if (lamp1)
			System.out.println(1);
		else
			System.out.println(0);

		if (lamp2)
			System.out.println(1);
		else
			System.out.println(0);

		sc.close();
	}
}
