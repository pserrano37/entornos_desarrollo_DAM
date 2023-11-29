package ud2;

public class Principal {
	
	public static void main(String[]args) {
		Jugador j1 = new Jugador("Juan", 5000);
		Jugador j2 = new Jugador("Luis", 10000);
		Ruleta ruleta = new Ruleta();
		boolean ganarj1 = false;
		boolean ganarj2 = false;
		
		for (int i = 0; i<10+1; i++) {
			System.out.println("Jugadores, realicen su apuesta.");
			System.out.println(j1.getNombre()+" realice su apuesta: ");
			j1.elegirNumero();
			System.out.println("Apuesta realizada.");
			System.out.println(j2.getNombre()+" realice su apuesta: ");
			j2.elegirNumero();
			System.out.println("Apuesta realizada.");
			System.out.println("No va más.");
			int resultado = ruleta.girarRuleta();
			System.out.println("Resultado de la ruleta: "+resultado);
			if (j1.getApuesta() == resultado) {
				ganarj1 = true;
			}
			else {
				ganarj1 = false;
			}
			j1.ganar(ganarj1);
			
			
			if (j2.getApuesta() == resultado) {
				ganarj2 = true;
			}
			else {
				ganarj2 = false;
			}
			j2.ganar(ganarj2);
			
			System.out.println("Dinero actual de "+ j1.getNombre()+": "+j1.getDinero());
			System.out.println("Dinero actual de "+ j2.getNombre()+": "+j2.getDinero());
		}
		
		System.out.println("Fin de la partida.");
	}

}
