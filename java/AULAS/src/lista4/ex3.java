package lista4;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int m[][] = new int[3][3];
		int maior10 = 0;

		for (int linha = 0; linha < m.length; linha++) {
			for (int coluna = 0; coluna < m.length; coluna++) {
				System.out.print("Digite um número: ");
				m[linha][coluna] = leia.nextInt();

				if (m[linha][coluna] > 10) {
					maior10++;

				}
			}
		}

		for (int linha = 0; linha < m.length; linha++) {
			for (int coluna = 0; coluna < m.length; coluna++) {
				System.out.print(m[linha][coluna] + " ");

			}
			System.out.println("\t");

		}

	}
}
