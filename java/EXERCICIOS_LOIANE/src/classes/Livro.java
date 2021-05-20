package classes;

public class Livro {
	private int numPaginas;
	private String genero;
	private String autor;
	private String titulo;

	public Livro(int numPaginas, String genero, String autor, String titulo) {
		this.numPaginas = numPaginas;
		this.genero = genero;
		this.autor = autor;
		this.titulo = titulo;
	}

	public int getnumPaginas() {
		return numPaginas;
	}

	public void setnumPaginas() {
		this.numPaginas = numPaginas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero() {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor() {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo() {
		this.titulo = titulo;
	}
}
