package lista4;

import java.util.Scanner;

/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.*/


public class ex2 {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int numero[] = new int[6];
		int pares=0;
		int imparesDigitados=0;
		int quantImpar=0;
		int somaPar=0;
		
		for(int x=0;x<numero.length;x++) {
			System.out.println("Digite um n�mero");
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
		System.out.println("qUANTIDADE �mpares:"+quantImpar);

	}

}
