package classes;

public class Basico2 extends Estudante {
	private int diaAniversario;

	public Basico2(int matricula, String cpf, double pontos, boolean status, int diaAniversario) {
		super(matricula, cpf, pontos, status);
		this.diaAniversario = diaAniversario;
	}
	 
	public int getdiaAniversario(){
		return diaAniversario;
	}
	public void setdiaAniversario(int diaAniversario) {
		this.diaAniversario=diaAniversario;	
	}
	
	public void bonusAniversario() {
		super.adicionarNota(this.getPontos()*0.1);
		
	}
	
	

}
