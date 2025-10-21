/**
 * TP 1 - Act 8
 *
 */

import java.util.Scanner;

public class OperarVector {
	public static void main(String[] args) {
		// ingreso
		Scanner teclado = new Scanner(System.in);
		int maxArray = 5;
		int[] notas = new int[maxArray];
		int sumatoria = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Ingresar nota N° " + (i + 1) + ": ");
			notas[i] = teclado.nextInt();
			sumatoria = sumatoria + notas[i];
		}

		// mostrar
		System.out.print("Notas: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.print("\t" + notas[i]);
		}

		double promedio = sumatoria / notas.length;

		System.out.print("\nPromedio: " + promedio);
		int mayorNota = notas[0]; // tomo el primero como el mayor
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > mayorNota) {
				mayorNota = notas[i];
			}
		}
		System.out.print("\nMayor Nota: " + mayorNota);
	}
}
