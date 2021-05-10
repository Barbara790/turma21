package lista5Poo;

public class Aviao {
	public int numeroMaximoPassageiros;
	public int numeroPassageiros;
	public double velocidadeMaxima;
	public String marca;
	
	
	public Aviao( int numeroMaximoPassageiros,int numeroPassageiros,double velocidadeMaxima, String marca) {
		this.numeroMaximoPassageiros=numeroMaximoPassageiros;
		this.numeroPassageiros=numeroPassageiros;
		this.velocidadeMaxima=velocidadeMaxima;
		this.marca=marca;
	}
	public void assentosVazios() {
		System.out.println(numeroMaximoPassageiros-numeroPassageiros);
	}

}
