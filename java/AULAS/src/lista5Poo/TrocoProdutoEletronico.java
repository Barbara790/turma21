package lista5Poo;

import java.util.Scanner;

public class TrocoProdutoEletronico {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digite a cor do produto eletr�nico:");
		String cor=leia.next();
		System.out.println("Digite o tipo do produto eletr�nico:");
		String tipoProdutoEletronico=leia.next();
		System.out.println("Digite o valor do celular:");
		double pre�oProdutoEletronico=leia.nextDouble();
		System.out.println("Digite quantos celulares o cliente comprou:");
		double quantiProdutos=leia.nextDouble();
		System.out.println("Digite o valor recebido:");
		double valorRecebido=leia.nextDouble();
		
		ProdutoEletronico celular = new ProdutoEletronico(cor,pre�oProdutoEletronico,tipoProdutoEletronico,quantiProdutos,valorRecebido);
		
		System.out.println("O valor do troco �:");
		celular.valorTroco();
		
	}
	

}
