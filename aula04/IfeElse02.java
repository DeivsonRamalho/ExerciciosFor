package aula04;

import java.util.Scanner;

public class IfeElse02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		int x;
		
		System.out.println(" Digite um Número: ");
		x = sc.nextInt();
		
		if (x == 0 ) {
			
			System.out.println("Seu número " + x + " é Nulo. ");
			
		}else if ( x < 0 ) {
			
			System.out.println("Seu número " + x + " é Negativo.");
			
		}else if (x > 0 ) {
			
			System.out.println("Seu número " + x + " é Positivo.");
		}
				
		
		
		sc.close();		
	}

}
