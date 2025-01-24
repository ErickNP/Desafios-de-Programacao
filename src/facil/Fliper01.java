package facil;

import java.util.Scanner;

public class Fliper01 {

	public static void main(String[] args) {
		
		//Forçar o Eclipse a abrir o console
		System.out.println("escreva");
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] numbers = input.split(" ");
		
		if(numbers[0].equals("0") ) {
			System.out.println("C");
			
		} else if (numbers[0].equals("1") && numbers[1].equals("0")) {
			System.out.println("B");
			
		} else if (numbers[0].equals("1") && numbers[1].equals("1")) {
			System.out.println("A");
		}
		
		
		
		sc.close();
	}

}
