package exerciciosLogica;

import java.util.Scanner;

public class Aula13Ex4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double somaNota=0;
		double media=0;
		
		System.out.println("Digite uma nota:");
		double nota1=leia.nextDouble();
		System.out.println("Digite uma nota:");
		double nota2=leia.nextDouble();
		System.out.println("Digite uma nota:");
		double nota3=leia.nextDouble();
		System.out.println("Digite uma nota:");
		double nota4=leia.nextDouble();
		
		somaNota=nota1+nota2+nota3+nota4;
		media= somaNota/4;
		
		System.out.println("A média das notas digitadas é: " + media);
	}
}
