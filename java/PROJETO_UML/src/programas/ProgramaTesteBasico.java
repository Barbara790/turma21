package programas;

import java.util.Scanner;

import classes.Basico;

public class ProgramaTesteBasico {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		System.out.println("Digite o nome do alune:");
		String nome=leia.next();
		System.out.println("Digite o número da matrícula:");
		int matricula=leia.nextInt();
		System.out.println("Digite o cpf:");	
		String cpf=leia.next();
		System.out.println("Digite o dia do aniversário:");
		int dia=leia.nextInt();
		System.out.println("Digite a nota:");
		double nota=leia.nextDouble();
		
		Basico aluno1=new Basico(matricula,cpf,dia);
		aluno1.setNome(nome);
		aluno1.adicionarNota(nota);
		System.out.printf("Pontos atuais do alune %s = %.0f\n",aluno1.getNome(),aluno1.getPontos());
		aluno1.bonusAniversario(dia);
		System.out.println("Digite o dia atual:");
		int diaHoje = leia.nextInt();
		System.out.println("Os Pontos com bonus do alune "+aluno1.getNome()+"é: "+ aluno1.getPontos());
		
		
				
	}

}
