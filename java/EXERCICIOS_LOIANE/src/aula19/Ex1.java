package aula19;

import java.util.Scanner;


public class Ex1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		double[] vA = new double[5];
		double[] vB = new double[5];
		
		for(int i=0; i<vA.length; i++) {
			System.out.println("Digite o número "+ (i+1));
			vA[i]=leia.nextDouble();
			
			vB[i]=vA[i];	
		}
		
	    System.out.println("O vetor A: ");
	    for(int i=0; i<vA.length;i++) {
	    	System.out.println(vA[i]);
	    }
	    System.out.println("O vetor B: ");
	    for(int i=0; i<vB.length;i++) {
	    	System.out.println(vB[i]);
	    }
		
		
		
	}

}
