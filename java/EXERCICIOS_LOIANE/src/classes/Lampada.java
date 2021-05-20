package classes;

public class Lampada {
	private double preco;
	private String marca;
	private int quantiWatts;
	
	public Lampada(double preco,String marca,int quantiWatts) {
		this.preco=preco;
		this.marca=marca;
		this.quantiWatts=quantiWatts;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco() {
		this.preco=preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca() {
		this.marca=marca;
	}
	
	public void ligarLampada() {
		System.out.println("Lampada ligada");
	}
	public void desligarLampada() {
		System.out.println("Lampada desligada");
	}

}
