package classes;

public class Estudante {
	//atributos
	private int matricula;
	private String cpf;
	private double pontos;
	private boolean status;
	private String nome;
	
	//construtor
	public Estudante(int matricula, String cpf) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
	}
	
	//sobrecarga de construtor

	public Estudante(int matricula, String cpf, boolean status) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.status = status;
	}

	public Estudante(int matricula, String cpf, double pontos, boolean status) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.pontos = pontos;
		this.status = status;
	}
	
	//encapsulamento- getters and setters
	public String getCPF(){
	    return this.cpf;
	  }

	  public void setCPF(String cpf){
	    this.cpf = cpf;
	  }

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public double getPontos() {
			return pontos;
		}
	

	//metodos
	

	public void adicionarNota(double pontos) {
		this.pontos=this.pontos+pontos;
	}
	public void tirarNota(double pontos) {
		this.pontos=this.pontos-pontos;
	}
	
	
}
