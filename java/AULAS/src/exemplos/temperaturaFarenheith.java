package exemplos;

import java.util.Scanner;

public class temperaturaFarenheith{

		public static void main(String[] args) 
		{
			
			
			Scanner leia = new Scanner(System.in);
			 
			double graus, farenheit, grausResultado;
			String nome;
			
			System.out.println("Informe a temperatura da sua cidade em Farenheit");
			farenheit = leia.nextDouble();
			
			grausResultado = (farenheit - 32) / 1.8;
			
			System.out.println("A conversão do valor da temperatura de Farenheit para Celsius é: "+Math.round(grausResultado)+ "°C");
			leia.close();
			
		}
		}
		
	



