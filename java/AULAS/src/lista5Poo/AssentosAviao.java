package lista5Poo;

import java.util.Scanner;

public class AssentosAviao {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		
		
		System.out.println("Digite o n�mero de passageiros do aviao:");
		int numeroPassageiros=leia.nextInt();
		System.out.println("Digite o n�mero m�ximo de passageiros que o aviao comporta:");
		int numeroMaximoPassageiros=leia.nextInt();
		System.out.println("Digite a marca do avi�o");
		String marca=leia.next().toUpperCase();
		System.out.println("Digite a velocidade m�xima do avi�o:");
		int velocidadeMaxima=leia.nextInt();
		
		Aviao av1= new Aviao(numeroMaximoPassageiros,numeroPassageiros,velocidadeMaxima,marca);
		
		
		System.out.println("O n�mero de assentos vazios do avi�o foi:");
		av1.assentosVazios();
	}

}
