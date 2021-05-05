package lista2;

import java.util.Locale;
import java.util.Scanner;


public class tarefa4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número:");
		numero=leia.nextInt();
		
		if(numero%2==0) {
			System.out.println("O número "+numero+ " é par e seu raiz quadrada é: "+Math.sqrt(numero));
		}
		else {
			System.out.println("O número "+numero+" é impar e elevado ao quadrado equivale a: "+Math.pow(numero, 2) );
		}
		
		leia.close();
}
}
