package facil;

import java.util.Scanner;

public class Fibonacci04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer n = sc.nextInt();

		System.out.println(fibonacci(n));

		sc.close();
	}

	public static int fibonacci(int n) {

		//The challenge asks for a variation of the Fibonacci formula
		if (n == 0 || n == 1) return 1;

		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
