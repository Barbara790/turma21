package exercicios;

import java.util.Scanner;

public class lista1Ex5 {
	public static void main(String[] args) { 

		double nota1=0.0;
		double nota2=0.0;
		double nota3=0.0;
		double media=0.0;
		double somaNotas=0.0;
		
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1= leia.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2= leia.nextDouble();
		System.out.println("Digite a terceira nota:");
		nota3= leia.nextDouble();
		
		somaNotas=nota1+nota2+nota3;
		media=somaNotas/3;
		
		System.out.println("Sua media é igual a: " + media);
		
	}

}
