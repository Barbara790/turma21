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
		
		System.out.print("Digite um número:");
		n1=leia.nextInt();
		System.out.print("Digite um número:");
		n2=leia.nextInt();
		System.out.print("Digite um número:");
		n3=leia.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("O maior número é: "+n1);
		}
		if(n2>n1 && n2>n3) {
			System.out.println("O maior número é: "+n2);
		}
		if(n3>n1 && n3>n2) {
			System.out.println("O maior número é: "+n3);
		}
		
		leia.close();
		
	}
}
