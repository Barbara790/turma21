package exemplos;

import java.util.Scanner;

public class ProgramaOver {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		ExemploOver2 terceiro=new ExemploOver2("849289","jo",7,11,14);
	
		
		System.out.println("Digite o nome:");
		String nome=leia.next();
		System.out.println("Digite a matrícula:");
		String matricula=leia.next();
		System.out.println("Digite o número de horas trabalhas:");
		int horasTrabalhadas=leia.nextInt();
		System.out.println("Digite o valor da hora:");
		double valorSalario=leia.nextDouble();
		
		
		ExemploOver funcionario=new ExemploOver(matricula,nome,horasTrabalhadas,valorSalario);
		
		System.out.println(funcionario.getNome());
		funcionario.mostrarSalario();
		
		System.out.println(terceiro.getNome());
		terceiro.mostrarSalario();
	
	}

}
