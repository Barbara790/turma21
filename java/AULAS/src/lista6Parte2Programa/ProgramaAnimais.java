package lista6Parte2Programa;




import lista6.Preguica;
import lista6Parte2Classes.Cachorro;
import lista6Parte2Classes.Cavalo;

public class ProgramaAnimais {
	public static void main(String[] args) {
		Cavalo pocoto=new Cavalo("Zeca", 2);
		Cachorro caramelo=new Cachorro("Zezinho", 2);
		Preguica melissa=new Preguica("Melissa", 2);
		
		
		pocoto.emitirSom();
		caramelo.emitirSom();
		melissa.emitirSom();
		
		
		melissa.subirEmArvore();
		pocoto.correr();
		caramelo.correr();

	}
}