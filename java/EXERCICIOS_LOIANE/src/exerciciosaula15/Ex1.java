package exerciciosaula15;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite um n�mero:");
		int num1=leia.nextInt();
		System.out.println("Digite um n�mero:");
		int num2=leia.nextInt();
		
		
		if(num1>num2) {
			System.out.println("O maior n�mero �: " + num1);
		}
		else {
			System.out.println("O maior n�mero �: "+ num2);
			
		}
	
}
}
