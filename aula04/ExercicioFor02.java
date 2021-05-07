package aula04;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double lanche;
		System.out.println("Qual o capital disponivel para compra lanche? ");
		lanche = sc.nextDouble();
		double valorDoLanche = 1.50;
				
		
		for(int i = 0; i <= lanche; i++) {
		System.out.printf("Quatidade comprada foi %.2f%n: ", lanche / valorDoLanche);
		}
		
		sc.close();
	}

}
