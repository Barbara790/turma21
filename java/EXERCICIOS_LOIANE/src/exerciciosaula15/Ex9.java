package exerciciosaula15;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o n�mero 1:");
		int n1 =leia.nextInt();
		
		System.out.println("Digite o n�mero 2:");
		int n2 =leia.nextInt();
		
		System.out.println("Digite o n�mero 3:");
		int n3 =leia.nextInt();
		
		if(n1<n2 && n1<n3 && n2<n3 ) {
			System.out.println("A ordem descrente dos n�meros �: "+ n3 + n2 + n1 );
		}
		else if(n1<n2 && n1<n3 && n3<n2 ) {
			System.out.println("A ordem descrente dos n�meros �: "+ n2 + n3 + n1 );
		}
		else if(n2<n1 && n2<n3 && n1<n3 ) {
			System.out.println("A ordem descrente dos n�meros �: "+ n3 + n1 + n2 );
		}
		else if(n2<n1 && n2<n3 && n3<n1 ) {
			System.out.println("A ordem descrente dos n�meros �: "+ n1 + n3 + n2 );
		}
		else if(n2<n1 && n2>n3 && n3<n1 ) {
			System.out.println("A ordem descrente dos n�meros �: "+ n1 + n2 + n3 );
		}
		
		else if(n3<n1 && n3<n2 && n1<n2 ) {
			System.out.println("A ordem descrente dos n�meros �: "+ n2 + n1 + n3 );
		}
		
			
}
}