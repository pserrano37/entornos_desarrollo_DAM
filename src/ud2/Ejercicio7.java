package ud2;

public class Ejercicio7 {

	public static void main(String[] args) {
		double result = calculateValue(5);
		System.out.println("El resultado es: " + result);

	}

	public static double calculateValue(int x) {
		double value = 0;
		for (int i = 1; i <= x; i++) {
			value += 1 / i;
		}
		return value;
	}
}
