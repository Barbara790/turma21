package aula19;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] vA = new int[10];
		int somaVA = 0;
		
		for(int i=0; i<vA.length;i++) {
			System.out.println("Entre com o número "+(i+1));
			vA[i]=read.nextInt();
			
			somaVA +=vA[i];
			
		}
			System.out.println("A soma é: "+somaVA);
			System.out.println("Os numeros somados foram: ");
			for(int i=0; i<vA.length;i++) {
				System.out.println(vA[i]);
				
			}
			
		
		
	
	}

}
