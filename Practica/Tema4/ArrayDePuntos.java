import java.util.Scanner;

/**
 * TP 4 - Act 1
 * Permite crear un array de puntos en el plano cartesiano, ingresar sus coordenadas por teclado,
 * mostrar sus coordenadas y calcular las distancias entre puntos consecutivos.
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class ArrayDePuntos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Punto[] puntos = new Punto[6]; // array de 6 puntos

		for (int i = 0; i < puntos.length; i++) {
			// Ingresar por teclado las coordenadas de cada punto
			System.out.println("Punto " + (i + 1) + ": ");
			System.out.print("\tIngresar coordenadas de X: ");
			double x = teclado.nextDouble();

			System.out.print("\tIngresar coordenadas de Y: ");
			double y = teclado.nextDouble();

			// Crear el punto y almacenarlo en el array
			puntos[i] = new Punto(x, y);
		}

		// Mostrar las coordenadas de todos los puntos

		System.out.println("\nCoordenadas de los puntos ingresados:");
		for (Punto punto : puntos) {
			System.out.println(punto.coordenadas());
		}

		// Mostrar distancia entre los puntos consecutivos

		System.out.println("\nDistancias entre puntos consecutivos:");
		for (int i = 0; i < puntos.length - 1; i++) {
			// es - 1 porque el último punto no tiene siguiente (me costó mucho darme cuenta 😛)
			double distancia = puntos[i].distanciaA(puntos[i + 1]);
			System.out.printf("Distancia entre punto %d y punto %d: %.2f\n", i + 1, i + 2, distancia);
		}
	}
}
