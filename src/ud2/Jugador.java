package ud2;

import java.util.Random;
import java.util.Scanner;

public class Jugador {	
	
	static Scanner entrada = new Scanner(System.in);
	private String nombre;
	private int dinero;
	private int apuesta;
	
	public Jugador(String nombre,int dinero) {
		this.nombre = nombre;
		this.dinero = dinero;
		this.apuesta = -1;
	}
	
	public String getNombre() {
    return nombre;
	}

    public int getDinero() {
    return dinero;
    }
    
    public int elegirNumero() {
    	if (dinero > 0) 
    	{
	    	boolean numeroValido = false;
	    	int numeroEscogido = 0;
	    	while (!numeroValido) {
	    		numeroEscogido = entrada.nextInt();
	    		numeroValido = numeroEscogido < 36 && numeroEscogido >= 0;
	    		if (!numeroValido) {
	    			System.out.println("Error. Escoja un número del 0 al 35.");
	    		}
	    	}
	    	apuesta = numeroEscogido;
	    	return numeroEscogido;
    	}
    	else {
    		System.out.println("No le queda dinero para apostar.");
    	}
    	apuesta = -1;
    	return -1;
    }
    
    public void ganar(boolean ganar) {
    	if (ganar) {
    		this.dinero += 3500;	
    	}
    	else
    		if (dinero > 0)
    			this.dinero -= 100;
    		else
    			System.out.println("No se ha realizado apuesta.");
    }
    
    public int getApuesta() {
    	
    	return apuesta;
    }
    
}
