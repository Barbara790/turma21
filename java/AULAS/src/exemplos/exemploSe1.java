package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class exemploSe1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		char genero;
		boolean usoEmergencial;
		double salario = 0;
		int lerEmergencial;
		double somaSalarioAnual = 0.00;
		double impostoRenda = 0.0;
		double multa = 600 * 5;
		String isento = "isento";
		System.out.println("Digite o seu nome:");
		nome = leia.next();
		
		System.out.println("Como voc� identifica: M-masculino; F- Feminino; O-Outro");
		genero = leia.next().toUpperCase().charAt(0);
		
		System.out.println("Voc� usou o emergengial: 1-Sim; 2-N�o");
		lerEmergencial = leia.nextInt();
		
		System.out.println("Digite o seu sal�rio bruto:");
		salario = leia.nextDouble();
		
		somaSalarioAnual=salario*12;
		
		if(lerEmergencial==1) {
			usoEmergencial=true;	
		}
		else{
				usoEmergencial=false;
		}

}
}
