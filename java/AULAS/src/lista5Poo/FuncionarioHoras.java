package lista5Poo;

public class FuncionarioHoras {
	public static void main(String[] args) {
		Funcionario func=new Funcionario(true,1500.0,8,"Jo�o",10);
		
		System.out.println("O n�mero de horas extras foi de:");
		func.horaExtra();
	}

}
