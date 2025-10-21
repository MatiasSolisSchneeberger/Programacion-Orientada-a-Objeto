import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * TP 3 - Act 11
 *
 * @author Matias Solis Schneeberger
 * @version 1.0
 */
public class Empresa {
	public static void main(String[] args) {
		// Objeto 1: usando constructor con año (int)
		Empleado emp1 = new Empleado(20304567891L,
				"Gómez",
				"Ana",
				120000,
				2020);

		// Objeto 2: usando constructor con Calendar (fecha exacta)
		Calendar fechaIngreso = new GregorianCalendar(2015,
				Calendar.SEPTEMBER,
				7); // 7/9/2015
		Empleado emp2 = new Empleado(27365892112L,
				"Pérez",
				"Juan",
				150000,
				fechaIngreso);

		// ----- Probar métodos -----

		// mostrar() → imprime toda la info
		System.out.println("=== Datos Empleado 1 ===");
		emp1.mostrar();

		System.out.println("\n=== Datos Empleado 2 ===");
		emp2.mostrar();

		// mostrarLinea() → versión resumida
		System.out.println("\n--- mostrarLinea() ---");
		System.out.println(emp1.mostrarLinea());
		System.out.println(emp2.mostrarLinea());

		// antiguedad()
		System.out.println("\nAntigüedad de " + emp1.nomYApe() +
				": " + emp1.antiguedad() + " años");
		System.out.println("Antigüedad de " + emp2.nomYApe() +
				": " + emp2.antiguedad() + " años");

		// sueldoNeto()
		System.out.println("\nSueldo Neto de " + emp1.apeYNom() +
				": $" + emp1.sueldoNeto());
		System.out.println("Sueldo Neto de " + emp2.apeYNom() +
				": $" + emp2.sueldoNeto());

		// getAnioIngreso()
		System.out.println("\nAño de ingreso (emp1): " +
				emp1.getAnioIngreso());
		System.out.println("Año de ingreso (emp2): " +
				emp2.getAnioIngreso());

		// esAniversario()
		System.out.println("\n¿Hoy es aniversario de " +
				emp1.nomYApe() + "? " + emp1.esAniversario());
		System.out.println("¿Hoy es aniversario de " +
				emp2.nomYApe() + "? " + emp2.esAniversario());

		// nomYApe() y apeYNom()
		System.out.println("\nFormateos de nombre:");
		System.out.println("emp1 → " + emp1.nomYApe());
		System.out.println("emp1 → " + emp1.apeYNom());
		System.out.println("emp2 → " + emp2.nomYApe());
		System.out.println("emp2 → " + emp2.apeYNom());
	}
}
