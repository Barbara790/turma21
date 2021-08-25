package aula19;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] vA = new int[15];
		int[] vB = new int[15];
		
		for(int i=0;i<vA.length;i++) {
			System.out.println("Digite o número"+(i+1)+":");
			vA[i]=read.nextInt();
			
			vB[i]=vA[i]*vA[i];
		}
		
		System.out.println("Vetor A:");
		for(int i =0; i<vA.length;i++) {
			System.out.println(vA[i]);
		}
		System.out.println("Vetor B:");
		for(int i =0; i<vA.length;i++) {
			System.out.println(vB[i]);
		}
		
		
	}

}
