package exerciciosaula15;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
			
			
		
			System.out.println("Digite um n�mero");
			int num1 = leia.nextInt();
			
			System.out.println("Digite um n�mero");
			int num2 = leia.nextInt();
			
			System.out.println("Digite um n�mero");
			int num3 = leia.nextInt();
			
			
			if(num1>num2 && num1>num3 ) {
				System.out.println("O maior n�mero �"+ num1);	
			}
			else if(num2>num1 && num2>num3 ) {
				System.out.println("O maior n�mero �"+ num2);	
			}
			else if(num3>num1 && num3>num2 ) {
				System.out.println("O maior n�mero �"+ num3);	
			}
			
			if(num1<num2 && num1<num3 ) {
				System.out.println("O menor n�mero �"+ num1);	
			}
			else if(num2<num1 && num2<num3 ) {
				System.out.println("O menor n�mero �"+ num2);	
			}
			else if(num3<num1 && num3<num2 ) {
				System.out.println("O menor n�mero �"+ num3);	
			}
			
			
			
		
	}

}
