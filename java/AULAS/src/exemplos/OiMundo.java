package exemplos;

import java.util.Scanner;

public class OiMundo {
	public static void main(String[] args) {
		
		//instanciar=criar um teclado
		Scanner leia=new Scanner(System.in);//sem dar esse comando não funcionna
		
		String nome=" ";
		int numero1=10;
		int numero2=30;
		double salario=20;
		char op=' ';
		System.out.println("Digite um nome:");
		nome = leia.next();
		System.out.println("Digite um número:");
		numero1 = leia.nextInt();
		System.out.println("Digite o salario:");
		salario =leia.nextDouble(); 
		
	}

}
