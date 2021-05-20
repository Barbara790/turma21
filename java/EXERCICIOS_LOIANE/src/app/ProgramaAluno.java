package app;

import java.util.Scanner;

public class ProgramaAluno {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		
		
		
		System.out.println("Digite o nome da disciplina 1:");
		String disciplina=leia.next();
		System.out.println("Digite o nome da disciplina 2:");
		String disciplina2=leia.next();
		System.out.println("Digite o nome da disciplina 3:");
		String disciplina3=leia.next();
		//System.out.println("Digite a nota 1:");
		//double nota1[0]=leia.nextDouble();
		System.out.println("Digite a nota 2:");
		double nota2=leia.nextDouble();
		System.out.println("Digite a nota 3:");
		double nota3=leia.nextDouble();
	}

}
