package lista6;

//usa abstract para que não se possa criar elementos da classe animal dentro do programa
public abstract class ProgramaAnimais {
	public static void main(String[] args) {
		Cavalo pocoto=new Cavalo("Zeca", 2);
		Cachorro caramelo=new Cachorro("Zezinho", 2);
		Preguica melissa=new Preguica("Melissa", 2);
		Caseiro viraLata=new Caseiro("Melissa", 2,"pequeno",'a');
		
		pocoto.emitirSom();
		caramelo.emitirSom();
		melissa.emitirSom();
		viraLata.emitirSom();
		
		melissa.subirEmArvore();
		pocoto.correr();
		caramelo.correr();
		
		
		
	}

}
