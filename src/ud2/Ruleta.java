package ud2;

import java.util.Random;

public class Ruleta {
	static Random generador = new Random();
	
	private Random rand;
	
	public Ruleta() {				
	}
	
	public int girarRuleta() {  
		return generador.nextInt(36);
	}

}
