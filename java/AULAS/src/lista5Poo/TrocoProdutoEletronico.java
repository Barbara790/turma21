package lista5Poo;

import java.util.Scanner;

public class TrocoProdutoEletronico {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digite a cor do produto eletrônico:");
		String cor=leia.next();
		System.out.println("Digite o tipo do produto eletrônico:");
		String tipoProdutoEletronico=leia.next();
		System.out.println("Digite o valor do celular:");
		double preçoProdutoEletronico=leia.nextDouble();
		System.out.println("Digite quantos celulares o cliente comprou:");
		double quantiProdutos=leia.nextDouble();
		System.out.println("Digite o valor recebido:");
		double valorRecebido=leia.nextDouble();
		
		ProdutoEletronico celular = new ProdutoEletronico(cor,preçoProdutoEletronico,tipoProdutoEletronico,quantiProdutos,valorRecebido);
		
		System.out.println("O valor do troco é:");
		celular.valorTroco();
		
	}
	

}
