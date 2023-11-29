package ud2;

public class Juego {

	public static void main(String[] args) {
		

		int cont =1;
		
		for (int i=1; i<=3; i++) 
		{
			
			while (Dado.tirar()!=6 ) //|| dado2.tirar()!=6
			{
				cont++;
			}
			
			System.out.println("En la "+i+"ª "+"ronda se han hecho "+cont+" tiradas hasta sacar un 6 en ambos dados");
			
			cont = 1;
			
		}

	}

}
