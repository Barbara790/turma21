package exemplos;

public class ProgramaOver {
	public static void main(String[] args) {
		ExemploOver funcionario=new ExemploOver("177774","João",6,14);
		ExemploOver2 fun2=new ExemploOver2("849289","jo",7,11,14);
		
		funcionario.mostrarSalario();
		fun2.mostrarSalario();
	}

}
