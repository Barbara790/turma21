package lista4;

/*1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/

public class ex1 {
	public static void main(String[] args) {
		int numero[]= { 1, 0, 5, -2, -5, 7};
		int soma=0;
		
		soma=numero[0]+numero[1]+numero[5];
		System.out.println("A soma dos valores é "+soma);
		numero[4]=100;
		
		for(int i=0; i <numero.length; i++) {
			System.out.println(numero[i]);
				
		}
		}
	
	
		
	}
    

