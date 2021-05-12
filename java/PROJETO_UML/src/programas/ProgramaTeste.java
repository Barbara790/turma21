package programas;

import java.util.Scanner;

import classes.Estudante;

public class ProgramaTeste {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		//instanciamento
		Estudante aluno1=new Estudante(11,"11.886.782");
		Estudante alunoDaAline=new Estudante(11,"11.886.782",true);
	
		//Depois que você instanciou um número, para mudar ele vc tem que fazer isso aqui chamando o set
		aluno1.setCPF("XX.XXX.XXX");
		
		System.out.println(aluno1.getCPF());
		System.out.println(alunoDaAline.getCPF());
		
		System.out.println("Digite o nome do aluno1:");//aqui tá errado porque eu teria que instanciar depois de ler o teclado
		String nome=leia.next();
		aluno1.setNome(nome);

		System.out.println("Digite A NOTA do aluno1:");
		double nota=leia.nextDouble();
		aluno1.adicionarNota(nota);
		
	}
	

}
