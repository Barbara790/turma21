package classes;

public class Basico extends Estudante {//Estudante � a super(a m�e) de b�sico
	private int diaAniversario;

public Basico(int matricula, String cpf, int diaAniversario) {
	super(matricula, cpf);//ele tem que pegar os componentes da m�e
	this.diaAniversario = diaAniversario;
}
//sobrecarga
public Basico(int matricula, String cpf, boolean status, int diaAniversario) {
	super(matricula, cpf, status);
	this.diaAniversario = diaAniversario;
}

//getters and setters

public int getDiaAniversario() {
	return diaAniversario;
}
public void setDiaAniversario(int diaAniversario) {
	this.diaAniversario = diaAniversario;
}

//metodo

public void bonusAniversario(int dia) {
	if(diaAniversario==dia) {
		super.adicionarNota(super.getPontos()*0.1);
}
	
}




	 
}
