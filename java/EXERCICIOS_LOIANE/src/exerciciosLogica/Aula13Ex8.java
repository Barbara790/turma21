package exerciciosLogica;

import java.util.Scanner;

public class Aula13Ex8 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double salarioMensal =0;
		
		System.out.println("Digite quanto voc� ganha por hora:");
		double salarioHora= leia.nextDouble();
		System.out.println("Digite quantas horas voc� trabalha por m�s:");
		double horas = leia.nextDouble();
		
		salarioMensal=salarioHora*horas;
		
		System.out.println("O seu sal�rio mensal � de:" + salarioMensal);
		
		
		
	}
	

}
