package lista3;
//Escrever um programa que receba v�rios n�meros inteiros no teclado.
//E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)

import java.util.Scanner;

public class ex6 {public static void main(String[] args) {
	Scanner leia= new Scanner(System.in);
	int numero=0;
	int somaNumeros=0;
	
	do {
		numero++;
		System.out.print("Digite um numero:");
		numero=leia.nextInt();
		
		if(numero%3==0) {
		somaNumeros=somaNumeros+numero;
		}
		
		
	
		
	}while(numero!=0);
	
	System.out.print("A soma dos n�meros multiplos de 3 que foram digitados � :"+somaNumeros);
	
	
	
}
	

}
