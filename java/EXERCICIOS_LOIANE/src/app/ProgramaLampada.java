package app;

import classes.Lampada;

public class ProgramaLampada {
		public static void main(String[] args) {
			Lampada lamp=new Lampada(15, "Lampinha", 30);
			
			lamp.ligarLampada();
			lamp.desligarLampada();
			System.out.println(lamp.getMarca());
			System.out.println(lamp.getPreco());
			
		}
}
