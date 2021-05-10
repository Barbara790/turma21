package lista5Poo;

import java.util.Scanner;

public class AssentosAviao {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		
		
		System.out.println("Digite o número de passageiros do aviao:");
		int numeroPassageiros=leia.nextInt();
		System.out.println("Digite o número máximo de passageiros que o aviao comporta:");
		int numeroMaximoPassageiros=leia.nextInt();
		System.out.println("Digite a marca do avião");
		String marca=leia.next().toUpperCase();
		System.out.println("Digite a velocidade máxima do avião:");
		int velocidadeMaxima=leia.nextInt();
		
		Aviao av1= new Aviao(numeroMaximoPassageiros,numeroPassageiros,velocidadeMaxima,marca);
		
		
		System.out.println("O número de assentos vazios do avião foi:");
		av1.assentosVazios();
	}

}
