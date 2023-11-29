package ud2;
//Muestre los numero del 1 a 1000
// y muestre la suma de todos ellos
public class Ejemplo1 {
	
	public static void main(String[] args) {
		int sum=0;
		sum=sumaNumeros();
		System.out.println(sum);

	}
	
	public static int sumaNumeros() {
		int suma=0;
		for (int i=0;i<1000;i++) {
			System.out.println(i);
			suma=suma+i;
		}
		return suma;
	}

}
