package aula04;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc = new Scanner(System.in);
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.println("");
		
		int i = 1;
		
		while(i <= 10) {
			System.out.println(nome + i);
			i++;
		}
		
		sc.close();
		}
	}


