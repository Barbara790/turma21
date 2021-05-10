package lista4;
/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante
 deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.*/

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double m1[][]=new double[2][2];
		double m2[][]=new double[2][2];
		double mSub[][]=new double[2][2];
		double mSoma[][]=new double[2][2];
		char menu=' ';
		int constante=0;
		
		System.out.println("(1) somar as duas matrizes ");
		System.out.println("(2) subtrair a primeira matriz da segunda ");
		System.out.println("(3) adicionar uma constante as duas matrizes");
		System.out.println("(4) imprimir as matrizes ");
		System.out.println("Digite a opção de sua escolha:");
		menu=leia.nextLine().charAt(0);
		
		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 2; coluna++) {
				System.out.printf("Digite o número da matriz m1 na posição %d - %d : %.0f\\n\",linha,coluna,matriz1[linha][coluna]");
				m1[linha][coluna] = leia.nextDouble();
				System.out.printf("Digite o número da matriz m2 na posição %d - %d : %.0f\\n\",linha,coluna,matriz1[linha][coluna]");
				m2[linha][coluna] = leia.nextDouble();
			}
		
	}
		do {
		switch (menu)
		{
			case '1':
			{
				for (int linha=0;linha<2; linha++) {
					for (int coluna = 0; coluna<2; coluna++) {
						mSoma[linha][coluna]=m1[linha][coluna]+m2[linha][coluna];
						System.out.printf("Soma de m1 + m2 na posição %d - %d = %.0f + %.0f --> %.0f\n",linha,coluna,m1[linha][coluna],m2[linha][coluna],mSoma[linha][coluna]);
					}
				}
			}
			break;
			case '2':
			{
				for (int linha=0;linha<2; linha++) {
					for (int coluna = 0; coluna<2; coluna++) {
						mSub[linha][coluna]=m1[linha][coluna]-m2[linha][coluna];
						System.out.printf("A subração de m1 - m2 na posição %d - %d = %.0f - %.0f --> %.0f\n",linha,coluna,m1[linha][coluna],m2[linha][coluna],mSub[linha][coluna]);
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
						m1[linha][coluna]+=VALOR;
						m2[linha][coluna]+=VALOR;
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
						System.out.printf("%.0f\t",m1[linha][coluna]);
					}
					System.out.println();
				}
				System.out.println("MATRIZ 2");
				for (int linha=0;linha<2; linha++) 
				{
					for (int coluna = 0; coluna<2; coluna++) 
					{
						System.out.printf("%.0f\t",m2[linha][coluna]);
					}
					System.out.println();
				}
				System.out.println("MATRIZ SOMA");
				for (int linha=0;linha<2; linha++) 
				{
					for (int coluna = 0; coluna<2; coluna++) 
					{
						System.out.printf("%.0f\t",mSoma[linha][coluna]);
					}
					System.out.println();
				}
				System.out.println("MATRIZ SUBTRAI");
				for (int linha=0;linha<2; linha++) 
				{
					for (int coluna = 0; coluna<2; coluna++) 
					{
						System.out.printf("%.0f\t",mSub[linha][coluna]);
					}
					System.out.println();
				}
			}
			break;
			default :
			break;	
			
		}
		
		
	} while (menu!='4');
	}

}
