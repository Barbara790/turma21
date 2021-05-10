package entidades;

import java.util.Scanner;

public class cadastroCliente {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		classePessoa cliente=new classePessoa();
		char respostaVivo=' ';
		
		
		System.out.println("Digite o seu nome:");
		cliente.nome=leia.next();
		System.out.println("Digite o seu ano de nascimento:");
		cliente.anonascimento=leia.nextInt();
		System.out.println("Digite o seu genero(M/F/O)");
		cliente.gênero=leia.next().toUpperCase().charAt(0);
		System.out.println("Você está vivo ou morto?(V/M");
		respostaVivo=leia.next().toUpperCase().charAt(respostaVivo);
		
		if(respostaVivo=='V') {
			
		}
		else if(respostaVivo=='M') {
			
		}
		
		
		
	}

}
