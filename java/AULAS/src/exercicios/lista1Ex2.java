package exercicios;

import java.util.Scanner;

public class lista1Ex2 {

	public static void main(String[] args) {
		int anos = 0;
		int meses = 0;
		int dias = 0;
		int idade = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a sua idade em dias:");
		idade = leia.nextInt();

		anos = idade / 365;
		meses = (idade % 365) / 30;
		dias = (idade % 365) % 24;

		System.out.println("Você tem: " + anos + " anos, " + meses + " meses e " + dias + " dias");
	}
}
