package aula19;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double[] vA = new double[15];
		double[] vB = new double[15];
		
		for(int i =0; i<vA.length;i++) {
			System.out.println("Digite o número "+(i+1)+":");
			vA[i] = read.nextDouble();
			
			vB[i]= Math.sqrt(vA[i]);
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
