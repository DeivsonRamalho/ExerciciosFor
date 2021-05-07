package aula04;

import java.util.Scanner;

public class IfeElse03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println(" Digite um Número: ");
		x = sc.nextInt();
		
		System.out.println(" Boa Tarde");
			if(x == 4) {
				System.out.println(" Boa Noite");
			
		}else if (x > 3) {
			
			System.out.println(" Bom dia");
		}
		
		
		
		sc.close();
		
	}

}
