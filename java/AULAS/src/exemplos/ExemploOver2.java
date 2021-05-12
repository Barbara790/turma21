package exemplos;

public class ExemploOver2 extends ExemploOver {
	private double adicional;

	public ExemploOver2(String matricula, String nome, int horasTrabalhadas, double valorHora) {
		super(matricula, nome, horasTrabalhadas, valorHora);
		// TODO Auto-generated constructor stub
	}

	public ExemploOver2(String matricula, String nome) {
		super(matricula, nome);
		// TODO Auto-generated constructor stub
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override

	public void mostrarSalario() {
		System.out.println(calcularSalario()+adicional);
	}
}
