package exerciciosaula15;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu salário atual");
		double salario = leia.nextDouble();
		
		double percentual = 0;
		
		
		if(salario<280) {
			 percentual = 20;	 
		}
		else if(salario>280 && salario<700 ) {
			percentual =15;
		}
		else if(salario>700 && salario<1500 ) {
			percentual =10;
		}
		else if(salario>1500) {
			percentual =5;
		}
		
		double valorReajuste = (salario/100) * percentual;
		double novoSalario = salario + valorReajuste;
		System.out.println("Seu salários atual é de " + salario +". O percentual do seu reajuste foi "+percentual+ " e seu aumento foi de " + valorReajuste + ". Seu novo salário é de " + novoSalario + " reais.");
	
}
}
