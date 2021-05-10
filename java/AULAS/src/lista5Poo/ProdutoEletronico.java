package lista5Poo;

public class ProdutoEletronico {
	public String cor;
	public double preçoProdutoEletronico;
	public String tipoProdutoEletronico;
	public double quantiProdutos;
	public double valorRecebido;
	
	
	public ProdutoEletronico(String cor,double preçoProdutoEletronico,String tipoProdutoEletronico,double quantiProdutos,double valorRecebido){
		this.cor=cor;
		this.preçoProdutoEletronico=preçoProdutoEletronico;
		this.tipoProdutoEletronico=tipoProdutoEletronico;
		this.quantiProdutos=quantiProdutos;
		this.valorRecebido=valorRecebido;
		
	}
	
	public void valorTroco() {
		System.out.println(valorRecebido-preçoProdutoEletronico*quantiProdutos);
	}
	

}
