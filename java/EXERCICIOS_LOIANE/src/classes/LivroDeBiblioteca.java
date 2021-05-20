package classes;

public class LivroDeBiblioteca extends Livro {
		private String codigoDoLivro;
		private String prazoDeEmprestimo;
		
		public LivroDeBiblioteca(int numPaginas, String genero, String autor, String titulo,String codigoDoLivro,String prazoDeEmprestimo) {
			super(numPaginas,genero,autor,titulo);
			this.codigoDoLivro=codigoDoLivro;
			this.prazoDeEmprestimo=prazoDeEmprestimo;
		}
		
		public String getCodigoDoLivro() {
			return codigoDoLivro;
		}
		
		public void setCodigoDoLivro() {
			this.codigoDoLivro=codigoDoLivro;
		}
		
		public String getPrazoDeEmprestimo() {
			return prazoDeEmprestimo;
		}
		
		public void setPrazoDeEmprestimo() {
			this.prazoDeEmprestimo=prazoDeEmprestimo;
		}
}
