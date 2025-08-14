import java.util.Scanner;

/**
 * TP 2 - Act 6
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 *
 */
public class EjecutarPunto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("-- Punto 1 --");
		System.out.print("Ingresar valor de X: ");
		double x1 = teclado.nextDouble();

		System.out.print("Ingresar valor de Y: ");
		double y1 = teclado.nextDouble();

		Punto punto1 = new Punto(x1, y1);
		System.out.println(punto1.coordenadas());
		System.out.print("- Desplazar Punto 1 -");
		System.out.print("Ingresar valor de X: ");
		x1 = teclado.nextDouble();

		System.out.print("Ingresar valor de Y: ");
		y1 = teclado.nextDouble();

		punto1.desplazar(x1, y1);

		punto1.mostrar();


		System.out.print("-- Punto 2 --");
		System.out.print("Ingresar valor de X: ");
		double x2 = teclado.nextDouble();

		System.out.print("Ingresar valor de Y: ");
		double y2 = teclado.nextDouble();

		Punto punto2 = new Punto(x2, y2);
		System.out.println(punto2.coordenadas());

		System.out.print("- Desplazar Punto 2 -");
		punto2.mostrar();

		System.out.print("Ingresar valor de X: ");
		x2 = teclado.nextDouble();

		System.out.print("Ingresar valor de Y: ");
		y2 = teclado.nextDouble();

		punto2.desplazar(x2, y2);

		punto2.mostrar();


		System.out.print("-- Punto 3 (en el origen) --");
		Punto punto3 = new Punto();
		punto3.mostrar();
	}
}
