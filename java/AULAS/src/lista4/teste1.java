package lista4;

import java.util.Scanner;

public class teste1 {
	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		double matriz1[][] = new double[2][2]; //linha - coluna
		double matriz2[][] = new double[2][2];
		double matrizSoma[][] = new double[2][2];
		double matrizSubtrai[][] = new double[2][2];
		double auxConstante=0.00;
		char op=' ';
		//montagem da matriz
		for (int linha=0; linha<2; linha++) {
			for (int coluna=0; coluna<2; coluna++) {
				matriz1[linha][coluna]=2;
				System.out.printf("Valor da matriz1 na posi��o %d - %d : %.0f\n",linha,coluna,matriz1[linha][coluna]);
				//matriz1[linha][coluna]=leia.nextDouble();
				matriz2[linha][coluna]=2;
				System.out.printf("Valor da matriz2 na posi��o %d - %d : %.0f\n",linha,coluna,matriz2[linha][coluna]);
				//matriz2[linha][coluna]=leia.nextDouble();
				
			}
			System.out.println();
		}
		do {
			System.out.println("\n(1) somar as duas matrizes\n(2) subtrair a primeira matriz da segunda\n(3) adicionar uma constante as duas matrizes\n(4) imprimir as matrizes");
			System.out.println("Digite o numero da sua escolha :");
			op = leia.next().charAt(0);
			switch (op)
			{
				case '1':
				{
					for (int linha=0;linha<2; linha++) {
						for (int coluna = 0; coluna<2; coluna++) {
							matrizSoma[linha][coluna]=matriz1[linha][coluna]+matriz2[linha][coluna];
							System.out.printf("Soma de m1 + m2 na posi��o %d - %d = %.0f + %.0f --> %.0f\n",linha,coluna,matriz1[linha][coluna],matriz2[linha][coluna],matrizSoma[linha][coluna]);
						}
					}
				}
				break;
				case '2':
				{
					for (int linha=0;linha<2; linha++) {
						for (int coluna = 0; coluna<2; coluna++) {
							matrizSubtrai[linha][coluna]=matriz1[linha][coluna]-matriz2[linha][coluna];
							System.out.printf("A subra��o de m1 - m2 na posi��o %d - %d = %.0f - %.0f --> %.0f\n",linha,coluna,matriz1[linha][coluna],matriz2[linha][coluna],matrizSubtrai[linha][coluna]);
						}
					}
				}
				break;
				case '3':
				{
					System.out.print("Digite o valor da constante: ");
					final double VALOR = leia.nextDouble();
					for (int linha=0;linha<2; linha++) 
					{
						for (int coluna = 0; coluna<2; coluna++) 
						{
							matriz1[linha][coluna]+=VALOR;
							matriz2[linha][coluna]+=VALOR;
						}
					}
					
					
				}
				break;
				case '4':
				{
					System.out.println("MATRIZ 1");
					for (int linha=0;linha<2; linha++) 
					{
						for (int coluna = 0; coluna<2; coluna++) 
						{
							System.out.printf("%.0f\t",matriz1[linha][coluna]);
						}
						System.out.println();
					}
					System.out.println("MATRIZ 2");
					for (int linha=0;linha<2; linha++) 
					{
						for (int coluna = 0; coluna<2; coluna++) 
						{
							System.out.printf("%.0f\t",matriz2[linha][coluna]);
						}
						System.out.println();
					}
					System.out.println("MATRIZ SOMA");
					for (int linha=0;linha<2; linha++) 
					{
						for (int coluna = 0; coluna<2; coluna++) 
						{
							System.out.printf("%.0f\t",matrizSoma[linha][coluna]);
						}
						System.out.println();
					}
					System.out.println("MATRIZ SUBTRAI");
					for (int linha=0;linha<2; linha++) 
					{
						for (int coluna = 0; coluna<2; coluna++) 
						{
							System.out.printf("%.0f\t",matrizSubtrai[linha][coluna]);
						}
						System.out.println();
					}
				}
				break;
				default :
				break;	
				
			}
			
			
		} while (op!='4');
		
		System.out.println("fim do programa!!!");
	}

}
