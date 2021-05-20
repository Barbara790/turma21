package app;

import java.util.Scanner;

import classes.ContaCorrente;

public class ProgramaContaCorrente {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		
	
		System.out.println("Digite o número da sua conta:");
		String numeroConta=leia.next();
		System.out.println("O que você deseja realizar?\n1-Deposito\n2-Saque\n3-Consulta de Saldo\n4-Sair");
		char acao=leia.next().charAt(0);
		
		ContaCorrente cc = new ContaCorrente(numeroConta,1500,1000,true);
		
			
		if(acao=='1') {
			System.out.println("Digite o valor a ser depositado:");
			double depositar=leia.nextDouble();
			cc.depositarDinheiro(depositar);
		} 
		else if(acao=='2') {
			System.out.println("Digite o valor do saque:");
			double valorSaque=leia.nextDouble();
			cc.realizarSaque(valorSaque);
		}
		else if(acao=='3') {
			System.out.println(cc.getSaldo());
		}
		else {
			System.out.println("Fim de programa");
		}
		
		
	}

}
