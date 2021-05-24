package classes;

public class Calculadora {
	private static int num1;
	private static int num2;
	
	Calculadora(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1=num1;
	}
	
	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num1=num1;
	}
	
	public static int somar() {
		int somanum;
		somanum=num1+num2;
		System.out.println(somanum);
		return somanum;
	}
	
	public static int subtrair() {
		int subnum;
		subnum=num1-num2;
		System.out.println(subnum);
		return subnum;
	}
	
	public static int multiplicar() {
		int multinum;
		multinum=num1*num2;
		System.out.println(multinum);
		return multinum;
	}
	public static int dividir () {
		int divinum;
		divinum=num1/num2;
		System.out.println(divinum);
		return divinum;
	}
	
	/*public static int potenciar () {
		int potencianum;
		//potencianum=Math.pow(num1, num2);
		System.out.println(potencianum);
		return potencianum;*/
	}
}
