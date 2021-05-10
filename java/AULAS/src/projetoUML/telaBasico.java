package projetoUML;

import java.util.Scanner;

public class telaBasico {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double nota[]=new double[10];
		int diaHoje=0;
		int diaAniversario=0;
		double notaComBonus=0.0;
		double somaNotas=0.0;
		double notaFinal=0.0;
		int mesHoje=0;
		int matricula=0;
		String cpf=" ";
		String status=" ";
		
		//imprimeDadosEscola()
    	//obterDadosEstudante(matricula,cpf,status)
		
		System.out.print("Que dia você faz aniversário? Escreva somente o número do dia \n");
		diaAniversario = leia.nextInt();
		System.out.print("Hoje é qual dia do mês?\n");
		diaHoje = leia.nextInt();
		
		/*for(int x=0;x<10;x++){		
			tela2(nota, x);
			somaNotas=somarNotas(nota);
			char resposta= ' ';
			
			if(x<9){
				System.out.print("Deseja continuar? S-sim; N-não\n");
				resposta = leia.next().charAt(0);
			}
			if(x==9  ou (resposta =='n' ou resposta =='N') ){
					if(diaAniversario==diaHoje){
					notaComBonus=Math.round((somaNotas*1.1),2);
					System.out.print("É seu aniversário! Sua pontuação teve um acréscimo de 10% e agora é:"+notaComBonus+"\n");
					adicionarNota(nota,x,notaComBonus);		
					}
					else{
						System.out.print("A nota final é "+somaNotas+"\n");
					}
					break			
			
				
				
	}
	}*/

}
}



