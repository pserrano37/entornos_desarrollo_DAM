package ud2;

public class CodigoEspagueti {

	public static void main(String[] args) {
	       int i; 
	        bucleAInterrumpir:
	        for ( i=1 ; i<=10 ; i++ ) {
	            System.out.println( "Comenzada la vuelta" );
	            System.out.println( i );
	            if (i==8) break bucleAInterrumpir;
	            System.out.println( "Terminada esta vuelta" );
	        }
	        System.out.println( "Terminado" );  
	    }

	}


