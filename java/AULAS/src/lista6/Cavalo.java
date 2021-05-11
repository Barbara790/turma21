package lista6;

public class Cavalo extends Animais{
	public Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}

	@Override
	public void emitirSom() {
		System.out.println("iiiiiii");
	}
	public void correr() {
		System.out.println("zooooom");
	}
		
}
