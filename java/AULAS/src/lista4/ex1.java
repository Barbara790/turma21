package lista4;

public class ex1 {
	public static void main(String[] args) {
		int numero[] = { 1, 0, 5, -2, -5, 7 };
		int soma = 0;

		soma = numero[0] + numero[1] + numero[5];
		System.out.println("A soma dos valores é " + soma);
		numero[4] = 100;

		for (int i = 0; i < numero.length; i++) {
			System.out.println(numero[i]);

		}
	}

}
