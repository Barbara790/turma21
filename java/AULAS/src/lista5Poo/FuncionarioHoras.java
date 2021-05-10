package lista5Poo;

public class FuncionarioHoras {
	public static void main(String[] args) {
		Funcionario func=new Funcionario(true,1500.0,8,"João",10);
		
		System.out.println("O número de horas extras foi de:");
		func.horaExtra();
	}

}
