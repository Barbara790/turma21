package exerciciosaula15;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu turno: M-Matutino/V-Vespertino/N-Noturno");
		char turno = leia.next().toUpperCase().charAt(0);
		
		if(turno == 'M') {
			System.out.println("Bom dia");
		}
		else if(turno == 'V') {
			System.out.println("Boa tarde");
		}
		else if(turno == 'N') {
			System.out.println("Boa noite");
		}
		else {
			System.out.println("Turno inválido");
		}
	}

}
