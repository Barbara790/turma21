package lista4;

import java.util.Scanner;

/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/


public class ex2 {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int numero[] = new int[6];
		int pares=0;
		int imparesDigitados=0;
		int quantImpar=0;
		int somaPar=0;
		
		for(int x=0;x<numero.length;x++) {
			System.out.println("Digite um número");
			numero[x]= leia.nextInt();
			
			if(numero[x]%2==0) {
				System.out.println(numero[x]);
				somaPar=somaPar+numero[x];
			}
			if(numero[x]%2>=1) {
				imparesDigitados=numero.length;
				quantImpar++;
				
			}
			
		}
		
		System.out.println("Soma par"+somaPar);
		System.out.println("Impares digitados"+imparesDigitados);//travei em como mostrar os digitados, esqueci como faz
		System.out.println("qUANTIDADE ímpares:"+quantImpar);

	}

}
