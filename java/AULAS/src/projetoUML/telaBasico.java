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
		
		System.out.print("Que dia voc� faz anivers�rio? Escreva somente o n�mero do dia \n");
		diaAniversario = leia.nextInt();
		System.out.print("Hoje � qual dia do m�s?\n");
		diaHoje = leia.nextInt();
		
		/*for(int x=0;x<10;x++){		
			tela2(nota, x);
			somaNotas=somarNotas(nota);
			char resposta= ' ';
			
			if(x<9){
				System.out.print("Deseja continuar? S-sim; N-n�o\n");
				resposta = leia.next().charAt(0);
			}
			if(x==9  ou (resposta =='n' ou resposta =='N') ){
					if(diaAniversario==diaHoje){
					notaComBonus=Math.round((somaNotas*1.1),2);
					System.out.print("� seu anivers�rio! Sua pontua��o teve um acr�scimo de 10% e agora �:"+notaComBonus+"\n");
					adicionarNota(nota,x,notaComBonus);		
					}
					else{
						System.out.print("A nota final � "+somaNotas+"\n");
					}
					break			
			
				
				
	}
	}*/

}
}



