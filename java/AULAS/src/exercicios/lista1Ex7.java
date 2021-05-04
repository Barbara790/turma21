package exercicios;

import java.util.Scanner;

public class lista1Ex7 {
	public static void main(String[] args) {

		double a, b, c, d, e, f, x, y = 0.0;

		Scanner leia = new Scanner(System.in);

		System.out.println("digite o coeficiente a: ");
		a = leia.nextDouble();
		System.out.println("digite o coeficiente b: ");
		b = leia.nextDouble();
		System.out.println("digite o coeficiente c: ");
		c = leia.nextDouble();
		System.out.println("digite o coeficiente d: ");
		d = leia.nextDouble();
		System.out.println("digite o coeficiente e: ");
		e = leia.nextDouble();
		System.out.println("digite o coeficiente f: ");
		f = leia.nextDouble();

		x = c * e - b * f / a * e - b * d;
		y = a * f - c * d / a * e - b * d;

		System.out.println("Os valores de x e y são, respectivamente, " +Math.round(x) + " e " +Math.round(y) );

	}
}
