package lista3;

import java.util.Scanner;

//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

public class ex3 {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int idade=0;
		int menosVinteUm=0;
		int maisCinquenta=0;
		
	
		while(idade != -99){
			System.out.println(" Digite a sua idade(Se você não deseja continuar, digite -99:");
			idade=leia.nextInt();
			
			if(idade<21) {
				++menosVinteUm;
			}
			if(idade>=50) {
				++maisCinquenta;
			}
		}
		System.out.println("O total de pessoas com mais de 50 anos é "+maisCinquenta);
		System.out.println("O total de pessoas com menos de 21 anos é "+menosVinteUm);
		
		leia.close();
		}
	}


