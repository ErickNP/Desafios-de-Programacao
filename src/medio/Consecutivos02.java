package medio;

import java.util.Scanner;

public class Consecutivos02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int repeat = sc.nextInt();
		sc.nextLine();

		int[] numbers = new int[repeat];
		String[] values = sc.nextLine().split(" ");

		for (int i = 0; i < repeat; i++) {
			numbers[i] = Integer.parseInt(values[i]);
		}

		System.out.println(countPoints(numbers));

		sc.close();
	}

	public static int countPoints(int[] vector) {
		int points = 0;
		int pointsCount = 1;

		for (int i = 1; i < vector.length; i++) {
			if (vector[i] == vector[i - 1]) {
				pointsCount++;
			} else {
				if (pointsCount > points) {
					points = pointsCount;
				}
				pointsCount = 1;
			}
		}

		if (pointsCount > points) {
			points = pointsCount;
		}
		return points;
	}
}
