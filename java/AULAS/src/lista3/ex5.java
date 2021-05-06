package lista3;
//Crie um programa que leia um número do 
//teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)

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
		
		System.out.print("A soma dos números digitados é :"+somaNumeros);
		
		
		
	}
	

}
