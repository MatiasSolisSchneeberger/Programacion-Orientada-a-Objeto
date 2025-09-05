/**
 * TP 1 - Act 7
 *
 */

import java.util.Scanner;

public class CircunferenciaV2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double radio;
		do {
			System.out.print("Ingresar circunferencia (0 salir): ");
			radio = teclado.nextDouble();
			System.out.println("Perímetro: " + (2 * Math.PI * radio));
		} while (radio != 0);
	}
}
