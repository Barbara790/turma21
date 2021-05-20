package classes;

public class LivroDeLivraria extends Livro{
	private double precoLivro;
	
	public LivroDeLivraria(int numPaginas, String genero, String autor, String titulo, double precoLivro) {
		super(numPaginas,genero,autor,titulo);
		this.precoLivro=precoLivro;
	}
	
	public double getPrecoLivro() {
		return precoLivro;
	}
	
	public void setPrecoLivro() {
		this.precoLivro=precoLivro;
	}

}
