package lista3;
//Crie um programa que leia um n�mero do 
//teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int numero=0;
		int somaNumeros=0;
		
		do {
			numero++;
			System.out.print("Digite um numero:");
			numero=leia.nextInt();
			somaNumeros=somaNumeros+numero;
			
			
		
			
		}while(numero!=0);
		
		System.out.print("A soma dos n�meros digitados � :"+somaNumeros);
		
		
		
	}
	

}
