package aula04;

import java.util.Scanner;

public class ExercicioFor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String nome;
		System.out.println("Digite seu Nome: ");
		nome = sc.nextLine();
		System.out.println("");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(nome + i);
		}
		sc.close();
						
	}
	
	
}
