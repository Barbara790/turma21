package lista2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class tarefa2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int numero[] = new int[3];

		for (int x = 0; x < numero.length; x++) {
			System.out.println("Digite um número: ");
			numero[x] = leia.nextInt();
		}
		Arrays.sort(numero);
		
		System.out.print("A ordem crescente dos números é: ");

		for (int x = 0; x < numero.length; x++) {
			System.out.print(numero[x] + " ");

		}
		leia.close();

	}
}
