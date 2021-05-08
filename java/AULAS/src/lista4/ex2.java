package lista4;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero[] = new int[6];
		int pares = 0;
		int imparesDigitados = 0;
		int quantImpar = 0;
		int somaPar = 0;

		for (int x = 0; x < numero.length; x++) {
			System.out.print("Digite um número:");
			numero[x] = leia.nextInt();

			if (numero[x] % 2 == 0) {
				somaPar = somaPar + numero[x];
			}
			if (numero[x] % 2 == 1) {
				quantImpar++;
			}
		}

		System.out.println("Os números impares são: ");
		for (int x = 0; x < numero.length; x++) {
			if (numero[x] % 2 == 1) {
				System.out.print(numero[x] + " ");
			}
		}
		System.out.println("\nOs números pares são: ");
		for (int x = 0; x < numero.length; x++) {
			if (numero[x] % 2 == 0) {
				System.out.print(numero[x] + " ");
			}
		}

		System.out.println("\nA soma dos números pares é: " + somaPar);
		System.out.println("A quantidade de números impares é: " + quantImpar);

	}
}
