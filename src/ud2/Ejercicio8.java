package ud2;

public class Ejercicio8 {

	public static void main(String[] args) {
		boolean result = isPrime(17);
		System.out.println("¿Es primo? " + result);

	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false; // Error: Debería ser número % i != 0
			}
		}
		return true;
	}

}
