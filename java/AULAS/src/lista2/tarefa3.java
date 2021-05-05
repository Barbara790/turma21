package lista2;

import java.util.Locale;
import java.util.Scanner;

public class tarefa3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.print("Digite a sua idade:");
		idade=leia.nextInt();
		
		if(idade>=10 && idade <=14) {
			System.out.println("Você faz parte do grupo infantil.");
		}
		else if(idade>=15 && idade <=17) {
			System.out.println("Você faz parte do grupo juvenil.");
		}
		else if(idade>=18 && idade <=25) {
			System.out.println("Você faz parte do grupo adulto.");
		}
		else {
			System.out.println("Você não faz parte de nenhum grupo.");
		}
		
		leia.close();

}
}