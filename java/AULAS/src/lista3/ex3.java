package lista3;

import java.util.Scanner;

//Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

public class ex3 {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int idade=0;
		
	
		while(idade > 0){
			System.out.println(" Digite a sua idade");
			idade=leia.nextInt();
		}
		
		leia.close();
		}
	}

