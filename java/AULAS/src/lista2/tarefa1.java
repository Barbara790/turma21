package lista2;

import java.util.Locale;
import java.util.Scanner;

public class tarefa1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		
		System.out.print("Digite um n�mero:");
		n1=leia.nextInt();
		System.out.print("Digite um n�mero:");
		n2=leia.nextInt();
		System.out.print("Digite um n�mero:");
		n3=leia.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("O maior n�mero �: "+n1);
		}
		if(n2>n1 && n2>n3) {
			System.out.println("O maior n�mero �: "+n2);
		}
		if(n3>n1 && n3>n2) {
			System.out.println("O maior n�mero �: "+n3);
		}
		
		leia.close();
		
	}
}
