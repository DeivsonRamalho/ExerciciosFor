package aula04;

import java.util.Scanner;

public class IfeElse02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		int x;
		
		System.out.println(" Digite um N�mero: ");
		x = sc.nextInt();
		
		if (x == 0 ) {
			
			System.out.println("Seu n�mero " + x + " � Nulo. ");
			
		}else if ( x < 0 ) {
			
			System.out.println("Seu n�mero " + x + " � Negativo.");
			
		}else if (x > 0 ) {
			
			System.out.println("Seu n�mero " + x + " � Positivo.");
		}
				
		
		
		sc.close();		
	}

}
