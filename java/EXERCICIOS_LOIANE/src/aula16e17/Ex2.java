package aula16e17;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		boolean loginInvalido= false;
		
		while(loginInvalido == false) {
			
			System.out.println("Nome:");
			String nome = leia.next();
			
			System.out.println("Senha:");
			String senha = leia.next();
			
			if(nome.equalsIgnoreCase(senha) ) {
				System.out.println("Login inválido. Digite novamente:");
			}
			else {
				loginInvalido= true;
				System.out.println("Login válido");
			}
			
			
			
		}
}
}