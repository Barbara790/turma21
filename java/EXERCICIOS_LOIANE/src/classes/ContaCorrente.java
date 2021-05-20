package classes;

public class ContaCorrente {
	private String numeroConta;
	private double saldo;
	private double limiteEspecial;
	private boolean especial;
	
	
	
	public ContaCorrente(String numeroConta,double saldo,double limiteEspecial,boolean especial) {
		this.numeroConta=numeroConta;
		this.saldo=saldo;
		this.limiteEspecial=limiteEspecial;
		this.especial=especial;
		
	}
	public ContaCorrente() {
		
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta=numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	public double getLimiteEspecial() {
		return limiteEspecial;
	}
	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial=limiteEspecial;
	}
	public boolean getEspecial() {
		return especial;
	}
	public void setEspecial(boolean especial) {
		this.especial=especial;
	}

	
	public boolean realizarSaque(double valorSaque) {
		if(valorSaque<=saldo) {
			saldo=saldo-valorSaque;
			System.out.println("O seu saldo � de"+saldo);
			return true;
		}
		 else {
			 double valorFaltante=0;
			 valorFaltante=valorSaque-saldo;
			System.out.println("Voc� n�o possui "+valorSaque+" reais na sua conta, no momento seu saldo � de "+saldo+" faltam "+ valorFaltante +" reias para completar o valor que voc� deseja sacar.");
			if(valorFaltante<=limiteEspecial){
				double restoDoLimiteEspecial=0;
				restoDoLimiteEspecial=limiteEspecial-valorFaltante;
				System.out.println("Voc� usou "+valorFaltante+" reias do seu l�mite,voc� ainda tem"+restoDoLimiteEspecial);
				return true;
			}
				else{
					System.out.println("Voc� n�o tem limite dispon�vel.");
						return false;
				}
			
			}
		}  


	public void depositarDinheiro(double depositar) {   
		double saldoAtual=0;
		saldoAtual=saldo+depositar;
		System.out.println("Voc� depositou "+depositar+" reais, agora, o seu saldo atual � de: "+saldoAtual);
		
	}
	public void consultarSaldo() {
		System.out.println(saldo);
	}
	public boolean verificarChequeEspecial() {
		return saldo>0;
	}
	
}
