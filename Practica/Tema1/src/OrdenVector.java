import java.util.Scanner;

public class OrdenVector {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int maxArray = 4;

		int[] num = new int[maxArray];

		for (int i = 0; i < num.length; i++) {
			System.out.print("Ingresar " + (i + 1) + "° numero: ");
			num[i] = teclado.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}

		int aux;

		for (int i = 1; i < (num.length); i++) {
			for (int j = 0; j < (num.length - i); j++) {
				if (num[j] > num[j + 1]) {
					aux = num[j];
					num[j] = num[j + 1];
					num[j + 1] = aux;
				}
			}
		}

		System.out.println("\nArray ordenado:");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
	}
}
