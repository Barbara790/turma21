package classes;

import java.util.Scanner;

public class Tela2 extends Estudante {
	
	
	//tirar isso depois. coloquei só pra testar
	
	public Tela2(int matricula, String cpf, boolean status) {
		super(matricula, cpf, status);
		// TODO Auto-generated constructor stub
	}

	public Tela2(int matricula, String cpf, double pontos, boolean status) {
		super(matricula, cpf, pontos, status);
		// TODO Auto-generated constructor stub
	}

	public Tela2(int matricula, String cpf) {
		super(matricula, cpf);
		// TODO Auto-generated constructor stub
	}

	public void movimentosLeitura(char movimento, double valorMovimento) {
		Scanner leia=new Scanner(System.in);
		System.out.println("\nNota Atual:");//escreva("\nNota Atual: ", somaNotas)
		System.out.println("\nMovimento:");//escreva("\nMovimento: ", (indiceLaco+1))
		System.out.println("\nMOVIMENTO - I-inclusão de nota ou R-retirada nota: ");
		char movimentos=leia.nextLine().toUpperCase().charAt(0);	
		if(movimentos == 'I') {
			//adicionarNota(notas, indiceLaco, valorMovimento);
			super.adicionarNota(valorMovimento);;
		} 
		else if (movimentos == 'R'){
			   //tirarNota(notas, indiceLaco,  valorMovimento);
			   super.tirarNota(valorMovimento);;
			} 
		/*else {
				System.out.println("\nValor inválido! A nota não pode ficar negativada!");
			}
			Acho que esse aqui não precisa, vai ter como a nota ficar negativada daquele jeito que o Ed explicou?
			*/
		else {
			System.out.println("\nResposta inválida! Movimentos possíveis são inclusão ou retirada! ");
			//indiceLaco-- ver como resolver essa questão do indice laço
		} 
		} 
	
	}
	


	