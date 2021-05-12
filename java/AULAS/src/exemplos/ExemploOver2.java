package exemplos;

public class ExemploOver2 extends ExemploOver {
	private double adicional;
	

	public ExemploOver2(String matricula, String nome, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, nome, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override

	public void mostrarSalario() {
		System.out.println("O salário do terceiro é "+(calcularSalario()+adicional));
	}
}
