package ud2;

public class Ejercicio9 {

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50 };
		int sum = calculateSum(numbers);
		System.out.println("La suma de los elementos en el array es: " + sum);
	}

	public static int calculateSum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i]; // Error: Debería ser i < array.length en lugar de i <= array.length
		}
		return sum;
	}
}
