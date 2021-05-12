package exemplos;

public class ExemploOver {
	private String matricula;
	private String nome;
	private int horasTrabalhadas;
	private double valorHora;
	private double salario;
	
	public ExemploOver(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public ExemploOver(String matricula, String nome, int horasTrabalhadas, double valorHora) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double calcularSalario() {
		salario=horasTrabalhadas*valorHora;
		return salario;
	}
	
	public void mostrarSalario(){
		System.out.println("O salário é de "+calcularSalario());
	}
	
	
	
	

}
