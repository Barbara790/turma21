package lista6;

public class Animais {
	private String nome;
	private int idade;
	
	
	public Animais(String nome,int idade) {
		super();
		this.nome=nome;
		this.idade=idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	public void emitirSom() {
		System.out.println("SOMMM");
	}
}