package aula19;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] vA = new int[10];
		int cont=0;
		
		for(int i =0; i<vA.length;i++) {
			System.out.println("Entre o n�mero "+(i+1)+" :");
			vA[i]=read.nextInt();
			
			if(vA[i] %2 == 0) {
				cont++;
			}
		}
	
		System.out.println("A quantidade de n�meros pares �: "+cont+" \nS�o eles");
		for(int i =0; i<vA.length;i++) {
			if(vA[i] %2 == 0) {
				System.out.println(vA[i]);
			}
		}
	}

}
