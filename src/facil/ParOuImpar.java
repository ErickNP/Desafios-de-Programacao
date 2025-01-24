package facil;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		Integer bino;
		Integer cino;
		
		Scanner sc = new Scanner(System.in);
		
		
		bino = sc.nextInt();
		
		cino = sc.nextInt();
		
// The challenge does not allow me to deal with this case, but I will leave it as training:
//		if(bino > 5 || bino < 0 || cino > 5 || cino < 0){
//			System.out.println("Invalid Input!");
//		}
		
		if ((bino + cino) %2 == 0) {
			System.out.println("Bino");
		}else if ((bino + cino) %2 != 0) {
			System.out.println("Cino");
		}
		
		
		
		sc.close();
	}

}
