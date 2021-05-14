package classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Doacao {
	private int codigo;
	private double valor;
	private LocalDateTime dataHora;
	private Pessoa autor;
	
	public Doacao() {
		
	}
	
	public Doacao(int codigo, double valor,Pessoa autor) {
		this.codigo=codigo;
		this.valor=valor;
		this.autor=autor;
		this.dataHora=LocalDateTime.now();
		
	}
		
		public int getCodigo(){
			return codigo;
		}
		
		public void setCodigo() {
			this.codigo=codigo;
		}
		
		public double getValor() {
			return valor;
		
		}
		public void setValor() {
			this.valor=valor;
		}
		public Pessoa getPessoa() {
			return autor;
		
		}
		public void setPessoa(Pessoa autor) {
			this.autor=autor;
		}
		
		public LocalDateTime getdataHora() {
			return dataHora;
		}
		
		public double converterMoeda(double valor,char moeda) {
			
			if(moeda=='2'){
			return valor *(6.42);
			}
			if(moeda=='3'){
			 return valor * (5.31);
			}
			return valor;
			
		}
		
		@Override
		public String toString(){
			
			String hora=dataHora.format(DateTimeFormatter.ofPattern("HH:mm"));
			String data= dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			return codigo + " " + autor.getNome() + " " + valor + " " + data + " " + hora;
 		}
		
}
