package classes;

public class Contador {
	private static int cont;

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Contador.cont = cont;
	}
	
	public static void zerarCont() {
		cont=0;
		System.out.println(cont);
	}
	public static void incrementarCont() {
		cont++;
		System.out.println(cont++);
	}
	public static int retornarCont() {
		System.out.println(cont);
		return cont;
	}
	
	
	

}
