package lista3;

import java.util.Scanner;


public class ex2 {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int numero[] = new int[10];
		int somaPar=0;
		int somaImpar=0;
		
		
		for(int x=0;x<numero.length;x++) {
			
			System.out.print("Digite um numero:");
			numero[x]=leia.nextInt();
						
			if(numero[x]%2==0) {
				somaPar++;	
			}
			else {
				somaImpar++;
			}
		}
		System.out.println("A quantidade de números pares é de: "+somaPar);
		System.out.println("A quantidade de números impares é de: "+somaImpar);
		
		leia.close();
		}
		
		//System.out.println("A quantidade de números pares é de: "+somaPar);
		//System.out.println("A quantidade de números impares é de: "+somaImpar);
		
		//leia.close();
	}
		

