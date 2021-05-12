package lista6Parte2Classes;

public class Preguiça extends Animais {
	
	public Preguiça(String nome, int idade ) {
		super(nome,idade);
	}
	@Override
	public void emitirSom() {
		System.out.println("uaaaaaaa");
	}
	public void subirEmArvore() {
		System.out.println("chaque chaque chaque");
	}
}
