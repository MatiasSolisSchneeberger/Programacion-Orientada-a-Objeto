import java.util.Scanner;

/**
 * TP 2 - Act 5
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 *
 */
public class EjecutableEmpleado {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		long cuil = teclado.nextLong();
		String apellido = teclado.next();
		String nombre = teclado.next();
		double sueldoBasico = teclado.nextDouble();
		int anioIngreso = teclado.nextInt();

		Empleado empleado1 = new Empleado(cuil, apellido, nombre, sueldoBasico, anioIngreso);

		empleado1.mostrar();
		System.out.print("\n");

		empleado1.mostrarLinea();
	}
}
