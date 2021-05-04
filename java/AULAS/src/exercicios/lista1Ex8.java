package exercicios;

import java.util.Scanner;

/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor 
 * e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% 
 * e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
 * 
 */
public class lista1Ex8 {
		public static void main(String[] args) {
			double custoConsumidor=0.0;
			double custoFabrica=0.0;
			double percentagemDistribuidor=0.0;
			double impostos=0.0;
			double soma=0.0;
			
			Scanner leia= new Scanner(System.in);
	
			System.out.println("Digite o custo de fábrica:");
			custoFabrica= leia.nextDouble();
			
			impostos=(custoFabrica*0.45);
			percentagemDistribuidor=(custoFabrica*0.28);
			
			custoConsumidor=custoFabrica+impostos+percentagemDistribuidor;
			
			System.out.println("O custo do consumidor é: "+custoConsumidor);
			
			
}
}
