package lista5Poo;

import java.util.Scanner;

public class informacoesCliente {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		String nome=leia.next();
		System.out.println("Digite o seu nome:");
		String rg=leia.next();
		System.out.println("Digite o seu ano de nascimento:");
		int anoNascimento=leia.nextInt();
		System.out.println("Digite o seu genero(M/F/O)");
		char genero=leia.next().toUpperCase().charAt(0);
		
		Cliente fulano=new Cliente(nome,rg,anoNascimento,genero);
		
		System.out.println("A idade do cliente é:");
		fulano.idade();
		
	}
}
