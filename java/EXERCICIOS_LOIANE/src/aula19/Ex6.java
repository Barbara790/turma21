package aula19;

import java.util.Scanner;

public class Ex6 {
		public static void main(String[] args) {
			Scanner read = new Scanner(System.in);
			
			double[] vA = new double[10];
			double[] vB = new double[vA.length];
			double[] vC = new double[vA.length];
			
			for(int i =0; i<vA.length;i++) {
				System.out.println("Digite o número "+(i+1)+":");
				vA[i] = read.nextDouble();
				
				vB[i]= vA[i];
				vC[i]=vA[i]+vB[i];
			}
			
			System.out.println("Vetor A:");
			for(int i =0; i<vA.length;i++) {
				System.out.println(vA[i]);
			}
			System.out.println("Vetor B:");
			for(int i =0; i<vB.length;i++) {
				System.out.println(vB[i]);
			}
			System.out.println("Vetor C:");
			for(int i =0; i<vC.length;i++) {
				System.out.println(vC[i]);
			}
		}
	}
