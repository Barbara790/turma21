package lista3;

public class Ex1 {
	public static void main(String[] args) {
		int numero = 1000;

		for (int x = 1000; x > 999 && x < 2000; x++) {
			if (x % 11 == 5) {
				System.out.println(x);
			}
		}

	}

}
