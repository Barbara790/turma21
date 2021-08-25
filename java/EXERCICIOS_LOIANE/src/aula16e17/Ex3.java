package aula16e17;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		boolean notValid = true;
		
		while(notValid == true) {
			
		System.out.println("Digite um nome:");
		String name = leia.next();
		
		System.out.println("Digite uma idade:");
		int age = leia.nextInt();
		
		System.out.println("Digite um salário:");
		double wage = leia.nextDouble();
		
		System.out.println("Digite o seu gênero: f-feminino/m-masculino/o-outro");
		char gender = leia.next().toLowerCase().charAt(0);
		
		if(name.length()>3 && age>=0 && age<=150 && wage>0 && gender=='f'|| gender=='m'|| gender=='o') {
			notValid = false;
			System.out.println("Os seus dados foram validados");
		}
		else {
			System.out.println("Erro na validadação dos dados");
		}
		
		
	}
}
}
