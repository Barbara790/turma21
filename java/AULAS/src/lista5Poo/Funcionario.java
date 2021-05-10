package lista5Poo;

public class Funcionario {
	public boolean uniforme;
	public double salario;
	public int horarioDeTrabalho;
	public int horasTrabalhadas;
	public String NomeNoCracha;
	
	public Funcionario(boolean uniforme,double salario,int horarioDeTrabalho,String NomeNoCracha,int horasTrabalhadas) {
		this.uniforme=uniforme;
		this.salario=salario;
		this.horarioDeTrabalho=horarioDeTrabalho;
		this.NomeNoCracha=NomeNoCracha;
		this.horasTrabalhadas=horasTrabalhadas;
	}
	public void horaExtra() {
		System.out.println(horasTrabalhadas-horarioDeTrabalho);
		
	}
	
	
}
