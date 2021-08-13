package aula16e17;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		boolean notaValida =false;
		
		while(notaValida == false) {
		System.out.println("Digite o valor da nota:");
		double nota = leia.nextDouble();
		
		if(nota>=0 && nota<=10) {
			notaValida= true;
			System.out.println("Valor válido");
			
		}
		else {
			System.out.println("O valor digitado é inválido.Digite o valor da nota:");
			
		}
		}
		
	}

}
