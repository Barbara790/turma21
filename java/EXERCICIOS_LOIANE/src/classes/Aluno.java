package classes;

public class Aluno {
	private String matricula;
	private String nome;
	private String curso;
	private String disciplina[];
	private double notas[][];
	

	
	public Aluno(String matricula, String nome, String curso, String[] disciplina, double[][] notas) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
		this.disciplina = disciplina;
		this.notas = notas;
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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String[] disciplina) {
		this.disciplina = disciplina;
	}

	public double[][] getNotas() {
		return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}
	
	public void infoAluno() {
		System.out.println("Nome do aluno: "+nome);
		System.out.println("Matrícula: "+matricula);
		System.out.println("Curso: "+curso);
		
	}

	public void aprovarAluno(double mediaFinal) {
		for(double x=0;x<notas.length;x++) {
		
	}
	}

}
	
