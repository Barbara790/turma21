package lista5Poo;

public class ProdutoEletronico {
	public String cor;
	public double pre�oProdutoEletronico;
	public String tipoProdutoEletronico;
	public double quantiProdutos;
	public double valorRecebido;
	
	
	public ProdutoEletronico(String cor,double pre�oProdutoEletronico,String tipoProdutoEletronico,double quantiProdutos,double valorRecebido){
		this.cor=cor;
		this.pre�oProdutoEletronico=pre�oProdutoEletronico;
		this.tipoProdutoEletronico=tipoProdutoEletronico;
		this.quantiProdutos=quantiProdutos;
		this.valorRecebido=valorRecebido;
		
	}
	
	public void valorTroco() {
		System.out.println(valorRecebido-pre�oProdutoEletronico*quantiProdutos);
	}
	

}
