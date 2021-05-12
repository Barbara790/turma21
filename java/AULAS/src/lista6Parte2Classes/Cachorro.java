package lista6Parte2Classes;

public class Cachorro extends Animais {
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}

@Override
public void emitirSom() {
	System.out.println("au au au");
}

public void correr() {
	System.out.println("zooooom");
}
}
