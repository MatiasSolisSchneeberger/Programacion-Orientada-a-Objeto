import java.util.Scanner;

/**
 * TP 3 - Act 6
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class Secretaria {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("--- Datos del docente ---");
		System.out.print("Ingresar el nombre de un docente: ");
		String nombDoce = teclado.next();
		teclado.nextLine();

		System.out.print("Ingresar el grado: ");
		String gradoDoce = teclado.next();
		teclado.nextLine();

		System.out.print("Ingresar el sueldo: ");
		double sueldoDoce = teclado.nextDouble();
		teclado.nextLine();

		System.out.print("Ingresar monto de la asignación familiar: ");
		double asignFamilDoce = teclado.nextDouble();
		teclado.nextLine();

		Docente docente1 = new Docente(nombDoce, gradoDoce, sueldoDoce, asignFamilDoce);

		System.out.println("--- Datos de la escuela ---");
		System.out.print("Ingresar el nombre de la escuela: ");
		String nombEscu = teclado.next();
		teclado.nextLine();

		System.out.print("Ingresar la dirección: ");
		String domicilioEscu = teclado.next();
		teclado.nextLine();

		System.out.print("Ingresar el nombre del director: ");
		String directorEscu = teclado.next();
		teclado.nextLine();

		Escuela escuela1 = new Escuela(nombEscu, domicilioEscu, directorEscu);

		escuela1.imprimirRecibo(docente1);
	}
}
