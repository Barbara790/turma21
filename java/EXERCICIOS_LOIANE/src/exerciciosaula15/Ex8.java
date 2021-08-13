package exerciciosaula15;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto 1:");
		double p1 =leia.nextDouble();
		
		System.out.println("Digite o preço do produto 2:");
		double p2 =leia.nextDouble();
		
		System.out.println("Digite o preço do produto 3:");
		double p3 =leia.nextDouble();
		
		if(p1<p2 && p1<p3) {
			System.out.println("Você deve comprar o produto 1");
		}
		else if(p2<p1 && p2<p3) {
			System.out.println("Você deve comprar o produto 2");
		}
		else {
			System.out.println("Você deve comprar o produto 3");
		}
		
	}

}
