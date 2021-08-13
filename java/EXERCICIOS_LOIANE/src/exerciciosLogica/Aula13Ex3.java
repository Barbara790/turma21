package exerciciosLogica;

import java.util.Scanner;

public class Aula13Ex3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int somaNum=0;
		
		System.out.println("Digite um numero:");
		int numero1=leia.nextInt();
		System.out.println("Digite outro numero:");
		int numero2=leia.nextInt();
		
		somaNum = numero1+numero2;
		
		System.out.println("A soma dos números digitados é: " + somaNum );
		
		
		
	
}
}
