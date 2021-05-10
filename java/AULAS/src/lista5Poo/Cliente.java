package lista5Poo;

public class Cliente {
	public String nome;
	public String rg;
	public int anoNascimento;
	public char genero;
	
	public Cliente(String nome,String rg,int anoNascimento,char genero) {
		this.nome=nome;
		this.rg=rg;
		this.anoNascimento=anoNascimento;
		this.genero=genero;
	}
	
	public void idade() {
		System.out.println(2021-anoNascimento);
	}

}
