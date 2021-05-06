package lista3;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 ano
*/

public class ex4 {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		final int TOTAL=2;
		int estadoPsicologico=0;
		int mulheresNervosas=0;
		int homensAgressivos=0;
		int nerFMais40=0;
		int calFMenos18=0;
		int idade=0;
		int genero=0;
		int pessoasCalmas=0;
		int informacoes=0;
		int pessoasNervosas=0;
		int outrosCalmos=0;
		
		while(informacoes<TOTAL) {
			informacoes++;
			
			System.out.println("Pessoa "+informacoes);
			System.out.println("Digite a sua idade:");
			idade=leia.nextInt();
			System.out.println("Digite o seu genero(1-feminino / 2-masculino / 3-Outros):");
			genero=leia.nextInt();
			System.out.println("Digite como você se sente(1-calme / 2-nervose / 3-agressive):"); 
			estadoPsicologico=leia.nextInt();
			if(estadoPsicologico==1) {
				pessoasCalmas++;
				if(pessoasCalmas<19) {
					calFMenos18++;		
				}
				if(genero==3) {
					outrosCalmos++;
				}
			}
			if(estadoPsicologico==2) {
				pessoasNervosas++;
				if(pessoasNervosas>39) {
					pessoasNervosas++;
				}
				if(genero==1) {
					mulheresNervosas++;
				}
			}
			if(estadoPsicologico==3 && genero==2) {
				homensAgressivos++;
			}
			
			
		}
			
			
			
			
		System.out.println("O número de mulheres nervosas é: "+mulheresNervosas);
		System.out.println("O número de homens agressivos é: "+homensAgressivos);
		System.out.println("O número de outros calmos é: "+outrosCalmos);
		System.out.println("O número de pessoas calmas é: "+pessoasCalmas);
		System.out.println("O número de pessoas calmas com menos de 18 anos é: "+calFMenos18);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: "+pessoasNervosas);

			
	
			}
	  
			
				
	}


