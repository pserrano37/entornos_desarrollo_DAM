package ud2;

import java.util.Random;

public class Dado {
	
	public static int tirar() {
		Random generador = new Random();
		final int valorMin = 1;
		final int valorMax = 6;
		return generador.nextInt(valorMax - valorMin + 1) + valorMin;	
	}

}
