package lista5Poo;

public class Patinete {
	public int rodasPequenas;
	public boolean freioRodaTraseira;
	public boolean guidao;
	public double valorPromocao;
	public double valorNormal;
	
	public Patinete(int rodasPequenas,double valorNormal,double valorPromocao,boolean freioRodaTraseira,boolean guidao) {
		this.rodasPequenas=rodasPequenas;
		this.valorNormal=valorNormal;
		this.valorPromocao=valorPromocao;
		this.freioRodaTraseira=freioRodaTraseira;
		this.guidao=guidao;
	}
	
	public void valorDoDesconto() {
		System.out.println(valorNormal-valorPromocao);
	}
	
	
}
