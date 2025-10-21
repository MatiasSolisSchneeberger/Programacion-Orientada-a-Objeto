/**
 * TP 1 - Act 9
 *
 */

import java.util.Scanner;

public class OrdenVector {
	public static void main(String[] args) {
		// ingresar
		Scanner teclado = new Scanner(System.in);
		int maxArray = 4;
		double[] num = new double[maxArray];
		for (int i = 0; i < num.length; i++) {
			System.out.print("Ingresar " + (i + 1) + "° numero: ");
			num[i] = teclado.nextDouble();
		}
		// mostrar
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}

		// menor
		double menorNumero = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] < menorNumero) {
				menorNumero = num[i];
			}
		}

		System.out.println("Menor Numero: " + menorNumero);

		// burbuja
		double aux;
		for (int i = 1; i < (num.length); i++) {
			for (int j = 0; j < (num.length - i); j++) {
				if (num[j] > num[j + 1]) {
					aux = num[j];
					num[j] = num[j + 1];
					num[j + 1] = aux;
				}
			}
		}

		// mostrar ordenado
		System.out.println("\nArray ordenado:");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
	}
}
